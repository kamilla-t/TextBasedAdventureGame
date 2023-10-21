grammar GameMap;

// Parser rules
//gameMap: room*;
gamemap : room* connections?;
room: ROOMID NEWLINE attr+

attr : MONSTER NEWLINE
     | TREASURE NEWLINE
     | FOOD NEWLINE
     ;

connections: Connections NEWLINE connections;

connections: INT '-' INT NEWLINE;

ROOM: 'Room' 'ID' NEWLINE;
MONSTER: 'INT' 'ID' NEWLINE;
TREASURE: 'INT' 'ID' NEWLINE;
FOOD: 'INT' 'ID' NEWLINE;

// Lexer rules
ID: [a-zA-Z_][a-zA-Z0-9_]*;
WS: [ \t\r\n]+ -> skip;
NEWLINE:'\r'? '\n' ;
INT: ('0' | [1-9] [0-9]*);
FLOAT: ('0' | [1-9] [0-9]*) '.' [0-9]+;

//antlr4 GameMap.g4

