grammar Arithmetic;
prog:	(expr NEWLINE)* ;
expr:	expr ('*'|'/') expr # Mult
    |	expr ('+'|'-') expr # Add
    |	INT                 # Int
    |	'(' expr ')'        # Parenthesis
    ;
NEWLINE : [\r\n]+ ;
INT     : [0-9]+ ;