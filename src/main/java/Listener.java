import utils.SymbolTable;
import utils.Type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static utils.Kind.*;

public class Listener extends miniCSharpBaseListener {

    private SymbolTable symbolTable;
    private int varNum = 0;
    private int funIdx = -1;
    private int classIdx = -1;
    private Map<Integer, Type> assignmentStatements;
    private Type currentExpType;
    private List<Type> expTypes;
    private int expNumber;
    private final int NO_INDEX = -1;
    private final int NO_ATR = 0;

    @Override
    public void enterProgram(miniCSharpParser.ProgramContext ctx) {
        this.symbolTable = new SymbolTable();
        this.assignmentStatements = new HashMap<>();
        this.expTypes = new ArrayList<>();
    }

    @Override
    public void exitProgram(miniCSharpParser.ProgramContext ctx) {
        symbolTable.clearSymTab();
    }

    @Override
    public void enterClass_def(miniCSharpParser.Class_defContext ctx) {
        classIdx = symbolTable.lookupSymbol(ctx.ID().getText(), CLASS);
        if (classIdx == -1) {
            classIdx = symbolTable.insertSymbol(ctx.ID().getText(), CLASS, Type.NO_TYPE, NO_ATR, NO_ATR);
        } else
            System.err.printf("Redefinition of class '%s'\n", ctx.ID().getText());
    }

    @Override
    public void exitClass_def(miniCSharpParser.Class_defContext ctx) {
        symbolTable.clearSymbols(classIdx + 1);
    }

    @Override
    public void enterAttribute(miniCSharpParser.AttributeContext ctx) {
        int idx = symbolTable.lookupSymbol(ctx.ID().getText(), VAR);
        if (idx == NO_INDEX) {
            Type type = Type.valueOf(ctx.TYPE().getText().toUpperCase());
            symbolTable.insertSymbol(ctx.ID().getText(), VAR, type, NO_ATR, NO_ATR);
        }
    }

    @Override
    public void exitFunction_list(miniCSharpParser.Function_listContext ctx) {
        if (symbolTable.lookupSymbol("main", FUN) == NO_INDEX && symbolTable.lookupSymbol("Main", FUN) == NO_INDEX)
            System.err.println("Undefined reference to 'main'");
    }

    @Override
    public void enterFunction(miniCSharpParser.FunctionContext ctx) {
        funIdx = symbolTable.lookupSymbol(ctx.ID().getText(), FUN);
        if (funIdx == -1) {
            Type type = Type.valueOf(ctx.TYPE().getText().toUpperCase());
            funIdx = symbolTable.insertSymbol(ctx.ID().getText(), FUN, type, NO_ATR, NO_ATR);
        } else
            System.err.printf("Redefinition of function '%s'\n", ctx.ID().getText());

        // parameter
        if (ctx.parameter() == null)
            symbolTable.setAtr1(funIdx, 0);
        else {
            Type paramType = Type.valueOf(ctx.parameter().TYPE().getText().toUpperCase());
            symbolTable.insertSymbol(ctx.parameter().ID().getText(), PAR, paramType, 1, NO_ATR);
            symbolTable.setAtr1(funIdx, 1);
            symbolTable.setAtr2(funIdx, paramType.ordinal());
        }
    }

    @Override
    public void exitFunction_body(miniCSharpParser.Function_bodyContext ctx) {
        symbolTable.clearSymbols(funIdx + 1);
        varNum = 0;
    }

    @Override
    public void enterVariable(miniCSharpParser.VariableContext ctx) {
        if (symbolTable.lookupSymbol(ctx.ID().getText(), VAR) == NO_INDEX ||
                symbolTable.lookupSymbol(ctx.ID().getText(), PAR) == NO_INDEX) {
            Type type = Type.valueOf(ctx.TYPE().getText().toUpperCase());
            symbolTable.insertSymbol(ctx.ID().getText(), VAR, type, ++varNum, NO_ATR);
        } else
            System.err.printf("Redefinition of variable '%s'\n", ctx.ID().getText());
    }

    @Override
    public void enterAssignment_statement(miniCSharpParser.Assignment_statementContext context) {
        int varIdx = symbolTable.lookupSymbol(context.ID().getText(), VAR);
        int parIdx = symbolTable.lookupSymbol(context.ID().getText(), PAR);
        if (varIdx == NO_INDEX && parIdx == NO_INDEX)
            System.err.printf("Invalid lvalue '%s' in assignment\n", context.ID().getText());
        else {
            if (varIdx != NO_INDEX)
                this.assignmentStatements.put(expNumber + 1, symbolTable.getType(varIdx));
            else
                this.assignmentStatements.put(expNumber + 1, symbolTable.getType(parIdx));
        }

    }

    @Override
    public void enterExp(miniCSharpParser.ExpContext ctx) {
        // literal - ID - funCall - num_exp
        expNumber++;
        if (ctx.num_exp() != null) {
            expNumber--;
        }

        if (ctx.ID() != null) {
            int varIdx = symbolTable.lookupSymbol(ctx.ID().getText(), VAR);
            int parIdx = symbolTable.lookupSymbol(ctx.ID().getText(), PAR);
            if(varIdx == NO_INDEX && parIdx == NO_INDEX) {
                System.err.printf("'%s' undeclared\n", ctx.ID().getText());
                return;
            }

            if(varIdx != NO_INDEX)
                currentExpType = symbolTable.getType(varIdx);
            else
                currentExpType = symbolTable.getType(parIdx);
            expTypes.add(currentExpType);
        }
    }

    @Override
    public void enterLiteral(miniCSharpParser.LiteralContext ctx) {
        // int - long
        int idx;
        if (ctx.INT_NUMBER() != null) {
            idx = symbolTable.insertLiteral(ctx.INT_NUMBER().getText(), Type.INT);
        } else {
            idx = symbolTable.insertLiteral(ctx.LONG_NUMBER().getText(), Type.LONG);
        }
        currentExpType = symbolTable.getType(idx);
        expTypes.add(currentExpType);
    }

    @Override
    public void enterFunction_call(miniCSharpParser.Function_callContext ctx) {
        int fCallIdx = symbolTable.lookupSymbol(ctx.ID().getText(), FUN);
        if(fCallIdx == NO_INDEX)
            System.err.printf("'%s' is not a function\n", ctx.ID().getText());

        if (!ctx.argument().getText().equals("") && symbolTable.getAtr1(fCallIdx) == 0) {
            System.err.println("Wrong number of arguments");
        } else if (ctx.argument().getText().equals("") && symbolTable.getAtr1(fCallIdx) != 0) {
            System.err.println("Wrong number of arguments");
        }

        currentExpType = symbolTable.getType(fCallIdx);
        expTypes.add(currentExpType);
//        symbolTable.setType(FUN_REG, symbolTable.getType(fCallIdx));

    }

    @Override
    public void exitAssignment_statement(miniCSharpParser.Assignment_statementContext ctx) {
        Type idType = assignmentStatements.get(expNumber);
        if (currentExpType != idType)
            System.err.println("Incompatible types in assignment");
    }

    @Override
    public void exitRel_exp(miniCSharpParser.Rel_expContext ctx) {
        if (expTypes.get(expTypes.size() - 2) != currentExpType)
            System.err.println("Invalid operands: relational operator");
    }

    @Override
    public void exitReturn_statement(miniCSharpParser.Return_statementContext ctx) {
        if(symbolTable.getType(funIdx) != currentExpType)
            System.err.println("Incompatible types in return");
    }

}
