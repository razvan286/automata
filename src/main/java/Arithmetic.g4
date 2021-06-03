grammar Arithmetic;
prog: stat+;

stat: print | assign | if_stat | while_stat | NEWLINE;

if_stat:
	'if' condition_block ('else if' condition_block)* (
		'else' stat_block
	)?;

condition_block: expr stat_block;

stat_block: '{' stat* '}' | stat;

while_stat: 'while' expr stat_block;

print: 'print' '(' expr ')';
assign: TYPE ID '=' expr | ID '=' expr;

expr:
	expr '^' expr										# PowExpr
	| expr ('*' | '/') expr								# MultExpr
	| expr ('+' | '-') expr								# AddExpr
	| expr '!'											# FactExpr
	| expr ('<=' | '>=' | '<' | '>' | '==' | '!=') expr	# ComparisonExpr
	| expr '&&' expr									# AndExpr
	| expr '||' expr									# OrExpr
	| '(' expr ')'										# ParExpr
	| atom												# AtomExpr;

atom:
	INT					# IntAtom
	| (TRUE | FALSE)	# BoolAtom
	| ID				# IdAtom
	| STRING			# StringAtom;

TRUE: 'true';
FALSE: 'false';
STRING: '"' .*? '"';
TYPE: 'int' | 'bool' | 'string';
ID: [a-zA-Z]+;
NEWLINE: [ \t\r\n]+ -> skip;
INT: [0-9]+;

