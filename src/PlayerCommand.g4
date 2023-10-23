grammar PlayerCommand;

// Parser rules
command: action NEWLINE;

action:
    | 'door n' ID
    | 'pickup item' ID
    | 'describe'
    | 'admire valuable' ID
    | 'eat food' ID
    | 'stats'
    | 'wield weapon' ID
    | 'open chest' ID
    | 'help'
    | 'attack'
    ;


// Lexer rules
//ID: [a-zA-Z_][a-zA-Z0-9_]*;
ID: [a-zA-Z]+;// identifier rule
NEWLINE:'\r'? '\n' ; // return newlines to parser (is end-statement signal)

//antlr4 PlayerCommand.g4