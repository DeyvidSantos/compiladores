grammar Linguagem;

prog : INICIO CHAVE funcaoInicio CHAVE_E FIM;

funcaoInicio: ((declaracoes PONTOVIRGULA) | funcao)+;
funcao: tipoComVoid ID PARENTESES parametros PARENTESES_E bloco;
parametros : (parametro(VIRGULA parametro)*)?;
parametro: tipo (BIT_AND)? ID (multidimensional)?;

//**Escopo de bloco
bloco: CHAVE comandos CHAVE_E ;

//*** Comandos
comandos: (condicionais|comando)*;
comando:((retorno|declaracoes|atribuicoes|chamadaFuncao|entradaesaida)PONTOVIRGULA);

//**** Entrada e Saida
entradaesaida: (CIN | COUT) PARENTESES parametrosChamada PARENTESES_E;

//**** Retorno
retorno: RETORNO expressao;

//**** Chamada de Funcao
chamadaFuncao: ID PARENTESES parametrosChamada PARENTESES_E;
parametrosChamada: (expressao (VIRGULA expressao)*)? ;

//**** Condicionais
condicionais: ifdes | whiledes | fordes | dodes PONTOVIRGULA | switchdes;

ifdes: IF PARENTESES expressao PARENTESES_E bloco (ifdeselse|ifdeselseif)?;
ifdeselse: ELSE bloco;
ifdeselseif: ELSE ifdes ;
whiledes: WHILE PARENTESES expressao PARENTESES_E bloco;
fordes: FOR PARENTESES (declaracoes|atribuicoes) PONTOVIRGULA expressao PONTOVIRGULA atribuicoes PARENTESES_E bloco;
dodes: DO bloco WHILE PARENTESES expressao PARENTESES_E;
switchdes: SWITCH PARENTESES expressao PARENTESES_E CHAVE switchCase defaultdes CHAVE_E;
switchCase: (CASE expressao DOISPONTOS comandos (BREAK)?)* ;
defaultdes: (DEFAULTCASE DOISPONTOS comandos (BREAK)?)? ;
//**** Declaracoes
declaracoes: tipo declaracao (VIRGULA declaracao)*;
declaracao: ID ((ATRIBU expressao)|(multidimensional(ATRIBU declaracoesArray)?))?;
multidimensional: (COCH expressao COCH_E)+;

declaracoesArray: CHAVE (subArrayDeclaracoes|declaracoesArray) CHAVE_E (VIRGULA CHAVE (subArrayDeclaracoes|declaracoesArray) CHAVE_E)*;
subArrayDeclaracoes: expressao (VIRGULA expressao)* ;

//**** Atribuições
atribuicoes: ID (multidimensional)? ((atribuicoesIncEDec)|((ATRIBU | op_atr) expressao));
atribuicoesIncEDec: SOMA SOMA|SUB SUB;

//Definições gerais
tipoComVoid: VOID | tipo;
tipo: INT | STRING | DOUBLE | BOOLEAN | N_BIN | N_HEX | CHAR;

// NEW Expressões
expressao: (op_neg)?(val_final)((operations)(val_final))*;

operations : op_rel | op_neg | op_bitwise | op_arit_baixa | op_logica;
op_atr : SOMA IGUAL | SOMA IGUAL;
op_rel : MAIOQ | MENOQ | MAIOIG | MENOQ | IGUAL | DIF;
op_neg : SUB | BIT_NOT | NEGA;
op_bitwise : BIT_PE | BIT_PD | BIT_AND | BIT_OR | BIT_XOR | BIT_NOT;
op_arit_baixa : SOMA | DIV | MULT | RESTO;
op_logica : EE | OUOU | NEGA;
val_final : N_INT | E_STRING | N_BIN | N_HEX | E_CHAR | CONSTLOGICO | N_DOUBLE | ID | chamadaFuncao | ID multidimensional | PARENTESES expressao PARENTESES_E;


                       //PALAVRAAS RESERVADAs/ss/

INICIO: 'begin';
FIM: 'end';
BREAK: 'break';
DEFINE: 'define';

//VARIAVEIS
INT : 'int';
STRING : 'string';
CHAR : 'char';
BOOLEAN : 'bool';
FLOAT : 'float';
DOUBLE : 'double';
VOID : 'void';

//Desvios Cond
IF : 'if';
ELSEIF : 'elseif';
ELSE : 'else';
TRY : 'try';
CATCH : 'catch';
ENDIF : 'endif';
SWITCH : 'switch';
CASE : 'case';
DEFAULTCASE: 'defaultcase';

//Lacos de repticao
FOR : 'for';
WHILE: 'while';
DO: 'do';

//operadores aritimeticos 
SOMA : '+';
SUB : '-';
MULT : '*';
DIV : '/';
RESTO : '%';
ATRIBU : '=';

//operadores relacionais
IGUAL : '==';
MENOQ : '<';
MAIOQ : '>';
MENOIG: '<=';
MAIOIG : '>=';
DIF : '!=';

//operadores logicos
EE : '&&';
OUOU : '||';
NEGA : '!';
CONSTLOGICO: TRUE | FALSE;
TRUE: 'true';
FALSE: 'false';

//operadores bit a bit
BIT_PD : '>>';
BIT_PE : '<<';
BIT_AND : '&';
BIT_OR : '|';
BIT_NOT : '~';
BIT_XOR : '^';

//Valores Constantes
N_DOUBLE: [0-9]+'.'[0-9]+;
N_FLOAT: [0-9]+'.'[0-9]+ ('f'|'F');
N_BIN: '0b'[01]+;
N_INT: [0-9]+;
N_HEX: '0x'[A-Fa-f0-9]+;
E_STRING: '"'(~["\\]|'\\'.)*'"';
E_CHAR: '\''.'\'';

//Comentario de Linha
C_LINHA: '//'~[\n\r]* -> skip;
C_MULT: '/*'(.)*?'*/';

//Delimitadores
PONTOVIRGULA : ';';
DOISPONTOS : ':';
VIRGULA : ',';
PONTO : '.';
PARENTESES : '(';
PARENTESES_E : ')';
CHAVE : '{';
CHAVE_E : '}';
COCH: '[';
COCH_E: ']';

ID : [A-Za-z_][A-Za-z_0-9]*;
RETORNO : 'return' ;
COUT: 'cout';
CIN: 'cin';
ESPACOEMBRANCO : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;
