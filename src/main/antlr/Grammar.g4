grammar Grammar;


input_grammar: header codes lexer_rule+ parse_rule+ EOF;

header: (WS* 'parser' ':' 'header' WS* '{' text '}' WS*)?;
codes: (WS* 'parser' ':' 'member' WS* '{' text '}' WS*)?;

rule_name: LETTER ('_' | LETTER)*;

lexer_rule: rule_name WS* '->' WS* '\'' regexp '\'' SEMICOLON WS* code_block? WS*;

regexp: unit* ('|' unit*)*;

unit: (regexText | '(' regexp ')');


regexText: (LETTER | DIGIT | PLUS | FACTOR | QWE | COMMA | COLON | SEMICOLON | DOT | WS | '(' | ')' | '{' | '}'
| '"' | '=' | '<' | '>' | '!' | '^' | '_' | '?' | '-' | '&' | '$' | '.' | '[' | ']')+;

text: (LETTER | DIGIT | PLUS | FACTOR | QWE | COMMA | COLON | SEMICOLON | DOT | WS | '(' | ')' | '{' text '}'
| '"' | '=' | '<' | '>' | '!' | '^' | '_' | '?' | '\'' | '-' | '&' | '[' | ']')+;

rule_helper: (code_block* WS* rule_name WS* code_block* WS*)*;

code_block: '{' code '}';

code: text*;


parse_rule: rule_name WS* '{' WS* (rule_helper ';'WS*)* WS*'}' WS*;

LETTER: 'A'..'Z' | 'a'..'z';
DIGIT: '0'..'9';
PLUS: '+';
FACTOR: '*';
QWE: '/' | '\\';
COMMA: ',';
COLON: ':';
SEMICOLON: ';';
DOT: '.';

OR : '|';
WS: [ \n\t\r];

