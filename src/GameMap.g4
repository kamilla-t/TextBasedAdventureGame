grammar GameMap;
// Parser rules
gamemap: room+ connections?; //RoomMap
room: ROOMID NEWLINE attr+ NEWLINE;
//Room done, new line,0 or more attributes

attr : MONSTER NEWLINE //Monster
     | VALUABLES NEWLINE //Valuable
     | FOOD NEWLINE //Food
     | WIELDABLE NEWLINE //WIELDABLE
     | OPENABLE NEWLINE //OPENABLE
     ;

connections: 'Connections' NEWLINE connection+; //ConnectionList

connection: INT '-' INT NEWLINE; //RoomConnection

ROOMID: 'R:' INT ',' BOOL;
MONSTER: 'M:' ID ',' ID; //Monster - description, currentHealthPoints, probability, damage
VALUABLES: 'V:' ID ',' ID; //Valuables - description, value
WIELDABLE: 'W:' ID ',' ID; //
OPENABLE: 'O:' ID ',' ID ',' BOOL ',' VALUABLES; //
FOOD: 'F:' ID ',' ID; // Food - description, healthPoints

// Lexer rules
WHITESPACE: [ \t]+ -> skip; // Skip spaces and tabs
NEWLINE: '\r'? '\n' ; // return newlines to parser (is end-statement signal)
ID: [a-zA-Z_][a-zA-Z0-9_]*;
INT: ('0' | [1-9] [0-9]*);
BOOL: ('true' | 'false');
