grammar miniCSharp;

/*
 * Parser Rules
 */

program             : namespace
                    ;

namespace           : NAMESPACE ID LBRACKET class RBRACKET  // pitaj za clss list bez semanticke provjere
                    ;

class               : ACCESSOR? CLASS ID LBRACKET class_body RBRACKET
                    ;

class_body          : attribute_list function_list
                    ;

attribute_list      : attribute
                    | attribute_list attribute
                    ;

attribute           : ACCESSOR? TYPE ID SEMICOLON
                    ;

function_list       : function
                    | function_list function
                    ;

function            : ACCESSOR? TYPE ID LPAREN parameter RPAREN body
                    ;

parameter           : // empty
                    | TYPE ID
                    ;

body                : LBRACKET statement_list RBRACKET
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
TYPE                : 'int' | 'uint' ;

// key signs
LPAREN              : '(' ;
RPAREN              : ')' ;
LBRACKET            : '{' ;
RBRACKET            : '}' ;
SEMICOLON           : ';' ;
ASSING              : '=' ;

// relation operators
RELOP               : '<' | '>' | '==' | '<=' | '>=' | '!=' ;

// arithmetic operators
AROP                : '+' | '-' ;

// identificator
ID                  : [a-zA-Z][a-zA-Z0-9]* ;

// numbers
LONG_NUMBER         : [+-]?[0-9]{1,19}[lL] ;
INT_NUMBER          : [+-]?[0-9]{1,10} ;

// skips
WHITESPACE          : [ \n\r\t]+ -> skip ;
COMMENT             : '//'.*? -> skip ;

// error
ANY                 : . ;