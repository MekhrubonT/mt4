grammar Grammar;


input_grammar: lexer_rule+ parse_rule+ EOF;

rule_name: LETTER+;

lexer_rule: rule_name WS* '->' WS* '\'' regexp '\'' SEMICOLON WS*;

regexp: unit* ('|' unit*)*;

unit: (text | '(' regexp ')');

text: (LETTER | DIGIT | PLUS | FACTOR | QWE | COMMA | COLON | SEMICOLON)+;

rule_helper: (rule_name WS*)*;


parse_rule: rule_name WS* '{' WS* (rule_helper ';'WS*)* WS*'}' WS*;

LETTER: 'A'..'Z' | 'a'..'z';
DIGIT: '0'..'9';
PLUS: '+';
FACTOR: '*';
QWE: '/' | '\\';
COMMA: ',';
COLON: ':';
SEMICOLON: ';';

OR : '|';
WS: [ \n\t\r];

