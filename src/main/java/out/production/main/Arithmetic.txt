grammar Arithmetic;
prog:	(expr NEWLINE)* ;
expr:	expr ('*'|'/') expr # MultAdd
    |	expr ('+'|'-') expr # AddSubtr
    |	INT # Int
    |	'(' expr ')' # Brackets
    ;
NEWLINE : [\r\n]+ ;
INT     : [0-9]+ ;