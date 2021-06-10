grammar Arithmetic;
prog: stat+;

stat:
	print
	| assign
	| if_stat
	| while_stat
	| func_def
	| func_call
	| return_
	| NEWLINE;

func_def: TYPE ID '(' arguments ')' stat_block;
func_call: ID '(' arguments ')';
arguments: expr? ( ',' expr)*;

if_stat:
	'if' condition_block ('else if' condition_block)* (
		'else' stat_block
	)?;

while_stat: 'while' expr stat_block;

condition_block: expr stat_block;
stat_block: '{' stat* '}' | stat;

print: 'print' '(' expr ')';
assign: TYPE ID '=' expr | ID '=' expr;
return_: 'return' expr;

expr:
	func_call											# FuncCall
	| expr '^' expr										# PowExpr
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

