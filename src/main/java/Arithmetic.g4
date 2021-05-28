grammar Arithmetic;
prog:	stat+;

stat:   expr               # Print
    |   TYPE ID '=' expr   # Var
    |   NEWLINE            # NL
    ;

expr:	expr '^' expr       # Pow
    |   expr ('*'|'/') expr # Mult
    |	expr ('+'|'-') expr # Add
    |   expr '!'            # Fact
    |	INT                 # Int
    |   STRING              # String
    |   BOOL                # Boolean
    |   ID                  # ID
    |	'(' expr ')'        # Parenthesis
    ;

BOOL : 'true' | 'false' ;
STRING : '"' .*? '"' ;
TYPE : 'int' | 'bool' | 'string' ;
ID : [a-zA-Z]+ ;
NEWLINE : [ \t\r\n]+ -> skip;
INT     : [0-9]+;


