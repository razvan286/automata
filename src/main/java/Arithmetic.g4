grammar Arithmetic;
prog:	stat+;

stat:   expr               # Print
    |   ID '=' expr        # Var
    |   NEWLINE            # NL
    ;

expr:	expr '^' expr       # Pow
    |   expr ('*'|'/') expr # Mult
    |	expr ('+'|'-') expr # Add
    |   expr '!'            # Fact
    |	INT                 # Int
    |   ID                  # ID
    |	'(' expr ')'        # Parenthesis
    ;

ID : [a-zA-Z]+ ;
WS : [ \t]+ -> skip;
//NEWLINE : [\t\r\n]+;
NEWLINE :'\r'? '\n' ;
INT     : [0-9]+;


