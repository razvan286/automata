grammar Arithmetic;
prog:	stat+;
stat:   expr NEWLINE               # Print
    |   ID NEWLINE                 # PrintVar 
    |   ID '=' expr NEWLINE        # Var
    |   NEWLINE                    # NL
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
NEWLINE : [\t\r\n]+;
INT     : [0-9]+;


