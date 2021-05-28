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
    |   ID                  # ID
    |   STRING              # String
    |	'(' expr ')'        # Parenthesis
    ;

STRING : '"' .*? '"' ;
TYPE : 'int' | 'bool' | 'string' ;
ID : [a-zA-Z]+ ;
NEWLINE : [ \t\r\n]+ -> skip;
//NEWLINE : [\t\r\n]+;
//NEWLINE :'\r'? '\n' ;
INT     : [0-9]+;


