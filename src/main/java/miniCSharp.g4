grammar miniCSharp;

/*
 * Parser Rules
 */

program             : namespace
                    ;

namespace           : NAMESPACE ID LBRACKET class_def* RBRACKET
                    ;

class_def           : ACCESSOR? CLASS ID LBRACKET class_body RBRACKET
                    ;

class_body          : attribute_list function_list
                    ;

attribute_list      : attribute*
                    ;

attribute           : ACCESSOR? TYPE ID SEMICOLON
                    ;

function_list       : function*
                    ;

function            : ACCESSOR? TYPE ID LPAREN parameter? RPAREN function_body
                    ;

parameter           : TYPE ID
                    ;

function_body       : LBRACKET variable_list statement_list RBRACKET
                    ;

variable_list       : variable*
                    ;

variable            : TYPE ID SEMICOLON
                    ;

statement_list      : statement*
                    ;

statement           : compound_statement
                    | assignment_statement
                    | if_statement
                    | return_statement
                    ;

compound_statement  : LBRACKET statement_list RBRACKET
                    ;

assignment_statement: ID ASSIGN num_exp SEMICOLON
                    ;

num_exp             : exp
                    | num_exp AROP exp
                    ;

exp                 : literal
                    | ID
                    | function_call
                    | LPAREN num_exp RPAREN
                    ;

literal             : INT_NUMBER
                    | LONG_NUMBER
                    ;

function_call       : ID LPAREN argument RPAREN
                    ;

argument            : num_exp*
                    ;

if_statement        : if_part
                    | if_part ELSE statement
                    ;

if_part             : IF LPAREN rel_exp RPAREN statement
                    ;

rel_exp             : num_exp RELOP num_exp
                    ;

return_statement    : RETURN num_exp SEMICOLON
                    ;


/*
 * Lexer Rules
 */

// keywords
NAMESPACE           : 'namespace';
CLASS               : 'class';
ACCESSOR            : 'public' | 'private' | 'protected' ;
IF                  : 'if' ;
ELSE                : 'else' ;
RETURN              : 'return' ;
TYPE                : 'int' | 'long' ;

// key signs
LPAREN              : '(' ;
RPAREN              : ')' ;
LBRACKET            : '{' ;
RBRACKET            : '}' ;
SEMICOLON           : ';' ;
ASSIGN              : '=' ;

// relation operators
RELOP               : '<' | '>' | '==' | '<=' | '>=' | '!=' ;

// arithmetic operators
AROP                : '+' | '-' ;

// identificator
ID                  : [a-zA-Z][a-zA-Z0-9]* ;

// numbers
LONG_NUMBER         : [+-]?[0-9]+[lL] ;
INT_NUMBER          : [+-]?[0-9]+ ;

// skips
WHITESPACE          : [ \n\r\t]+ -> skip ;
COMMENT             : '//' ~ [\r\n]* -> skip ;

// error
ANY                 : . ;