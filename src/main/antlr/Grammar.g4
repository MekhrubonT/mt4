grammar Grammar;


input_grammar: lexer_rule+ parse_rule+ EOF;

rule_name: LETTER+;

lexer_rule: rule_name WS* '->' WS* '\'' regexp '\'' ';' WS*;

regexp: unit* ('|' unit*)*;

unit: (text | '(' regexp ')') repeat_amount;

text: (LETTER | DIGIT | PLUS | FACTOR | QWE)+;

rule_helper: (rule_name WS* repeat_amount)*;

repeat_amount: CLOSURE | '?' | '+' |;

parse_rule: rule_name WS* '{' WS* (rule_helper ';'WS*)* WS*'}' WS*;

LETTER: 'A'..'Z' | 'a'..'z';
DIGIT: '0'..'9';
PLUS: '+';
FACTOR: '*';
QWE: '/' | '\\';

OR : '|';
CLOSURE: '*';
WS: [ \n\t\r];

