package utils;

import java.util.List;
import java.util.ArrayList;


public class SymbolTable {

    public static List<SymTabElement> symbols;

    public SymbolTable() {
        symbols = new ArrayList<>();
    }

    /**
     * @return index of symbol if exists, else -1
     */
    public int lookupSymbol(String name, Kind kind) {
        for (SymTabElement symbol: symbols) {
            if (symbol.getName().equals(name) && symbol.getKind() == kind)
                return symbols.indexOf(symbol);
        }
        return -1;
    }

    /**
     * @return index of new symbol
     */
    public int insertSymbol(String name, Kind kind, Type type, int attr1, int attr2) {
        SymTabElement symbol = new SymTabElement(name, kind, type, attr1, attr2);
        symbols.add(symbol);
        return symbols.indexOf(symbol);
    }

    /**
     * @param beginIndex clear table from that index
     */
    public void clearSymbols(int beginIndex) {
        symbols.subList(beginIndex, symbols.size()).clear();
    }

    /**
     * @apiNote delete all elements from table
     */
    public void clearSymTab() {
        symbols.clear();
    }

    /**
     * @apiNote inserts literal if not exist
     */
    public int insertLiteral(String name, Type type) {
        int idx = lookupSymbol(name, Kind.LIT);
        if (idx == -1)
            idx = insertSymbol(name, Kind.LIT, type, 0, 0);
        return idx;
    }

    public Type getType(int index)
    {
        SymTabElement symbol = symbols.get(index);
        return symbol.getType();
    }

    public int getAtr1(int index) {
        SymTabElement symbol = symbols.get(index);
        return symbol.getAtr1();
    }

    public void setType(int index, Type type) {
        SymTabElement symbol = symbols.get(index);
        symbol.setType(type);
    }

    public void setAtr1(int index, int value) {
        SymTabElement symbol = symbols.get(index);
        symbol.setAtr1(value);
    }

    public void setAtr2(int index, int type) {
        SymTabElement symbol = symbols.get(index);
        symbol.setAtr2(type);
    }
}