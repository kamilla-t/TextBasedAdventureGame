grammar PlayerCommand;

// Parser rules
command: action EOF;

action:
    | 'door' ID
    | 'pickup' ID
    | 'describe'
    | 'admire' ID
    | 'eat' ID
    | 'stats'
    | 'wield' ID
    | 'open' ID
    | 'help'
    | 'attack'
    | 'battle' ID
    ;


// Lexer rules
//ID: [a-zA-Z_][a-zA-Z0-9_]*;
ID: [a-zA-Z0-9]+;// identifier rule
NEWLINE: '\r'? '\n' ; // return newlines to parser (is end-statement signal)
WHITESPACE: [ \t]+ -> skip;

//antlr4 PlayerCommand.g4