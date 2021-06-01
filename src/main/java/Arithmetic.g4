grammar Arithmetic;
prog: stat+;

stat: expr | assign | NEWLINE;

assign: TYPE ID '=' expr;

expr:
	expr '^' expr										# PowExpr
	| expr ('*' | '/') expr								# MultExpr
	| expr ('+' | '-') expr								# AddExpr
	| expr '!'											# FactExpr
	| expr ('<=' | '>=' | '<' | '>' | '==' | '!=') expr	# ComparisonExpr
	| expr '&&' expr									# AndExpr
	| expr '||' expr									# OrExpr
	| atom												# AtomExpr;

atom:
	'(' expr ')'	# ParExpr
	| INT			# IntAtom
	| BOOL			# BoolAtom
	| ID			# IdAtom
	| STRING		# StringAtom;

BOOL: 'true' | 'false';
STRING: '"' .*? '"';
TYPE: 'int' | 'bool' | 'string';
ID: [a-zA-Z]+;
NEWLINE: [ \t\r\n]+ -> skip;
INT: [0-9]+;

