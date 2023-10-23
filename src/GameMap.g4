grammar GameMap;
// Parser rules
gamemap : room* connections?;
room: ROOMID NEWLINE attr*;

attr : MONSTER NEWLINE
     | VALUABLES NEWLINE
     | FOOD NEWLINE
     ;

connections: 'Connections' NEWLINE connection+;

connection: INT '-' INT NEWLINE;

ROOMID: 'Room' ',' ID ',' INT; //Room - description, pickupsInRoom, isFinalRoom, connectedRooms, monsters
MONSTER: ID ',' INT ',' INT ',' INT; //Monster - description, currentHealthPoints, probability, damage
VALUABLES: ID ',' INT; //Valuables - description, value
FOOD: ID ',' INT; // Food - description, healthPoints

// Lexer rules
ID: [a-zA-Z_][a-zA-Z0-9_]*;
WS: [ \t\r\n]+ -> skip; // Skip spaces and tabs
NEWLINE:'\r'? '\n' ; // Skip newlines
INT: ('0' | [1-9] [0-9]*);
FLOAT: ('0' | [1-9] [0-9]*) '.' [0-9]+;

//antlr4 GameMap.g4

