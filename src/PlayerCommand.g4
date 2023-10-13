grammar PlayerCommand;

// Parser rules
command: action NEWLINE;

action:
    | 'pickup ' ID
    | 'door n' ID
    | 'pickup item' ID
    | 'exit' ID
    | 'describe' ID
    | 'admire valuable' ID
    | 'eat food' ID
    | 'stats' ID
    | 'wield weapon' ID
    | 'wield fistsoffury' ID
    | 'open chest' ID
    | 'help' ID
    | 'attack'ID
    ;


// Lexer rules
ID: [a-zA-Z_][a-zA-Z0-9_]*;
NEWLINE:'\r'? '\n' ; // return newlines to parser (is end-statement signal)

//antlr4 PlayerCommand.g4