grammar Linguagem;

prog : INICIO CHAVE declaracoes* funcoes+ CHAVE_E FIM;

//*Escopo de funCOes

funcoes: (tipoComVoid ID PARENTESES parametros PARENTESES_E bloco);
parametros : ((tipo ID (VIRGULA tipo ID)* | (tipo ID multidimensional)))?; //sadd regra sobre array

//**Escopo de bloco
bloco: CHAVE comandos CHAVE_E ;

//*** Comandos
comandos: (condicionais|((retorno|declaracoes|atribuicoes|chamadaFuncao|imprimir|ler)PONTOVIRGULA))*;

//COut
imprimir: COUT PARENTESES expressao PARENTESES_E;

//CIN
ler: CIN PARENTESES comandos PARENTESES_E; //variaveis e vetores

//**** Retorno
retorno: RETORNO expressao;

//**** Chamada de Funcao
chamadaFuncao: ID PARENTESES parametrosChamada PARENTESES_E;
parametrosChamada: (expressao (VIRGULA expressao)*)? ;

//**** Condicionais
condicionais: iffi | whiles | fors | dos PONTOVIRGULA | switchs;

iffi: IF PARENTESES expressao PARENTESES_E bloco (elsese|elseiffi)?;
elsese: ELSE bloco;
elseiffi: ELSE iffi ;
whiles: WHILE PARENTESES expressao PARENTESES_E bloco;
fors: FOR PARENTESES (declaracoes|atribuicoes) PONTOVIRGULA expressao PONTOVIRGULA atribuicoes PARENTESES_E bloco;
dos: DO bloco WHILE PARENTESES expressao PARENTESES_E PONTOVIRGULA;
switchs: SWITCH PARENTESES expressao PARENTESES_E CHAVE cases defaults CHAVE_E;
cases: (CASE expressao DOISPONTOS comandos (BREAK)?)* ;
defaults: (DEFAULTCASE DOISPONTOS comandos (BREAK)?)? ;

//**** Declaracoes
declaracoes: tipo ID ((ATRIBU expressao)|(multidimensional(ATRIBU declaracoesArray)?))?;
multidimensional: (COCH N_INT COCH_E)+;

declaracoesArray: CHAVE (subArrayDeclaracoes|declaracoesArray) CHAVE_E (VIRGULA CHAVE (subArrayDeclaracoes|declaracoesArray) CHAVE_E)*;
subArrayDeclaracoes: expressao (VIRGULA expressao)*;



//**** Atribui��es
atribuicoes: ID (multidimensional)? ((atribuicoesIncEDec)|(ATRIBU expressao));
atribuicoesIncEDec: SOMA SOMA|SUB SUB;

//Defini��es gerais
tipoComVoid: VOID | tipo;
tipo: INT | STRING | DOUBLE | BOOLEAN | CHAR | FLOAT | N_BIN | N_HEX ;

// NEW Express�es
expressao: (op_neg)?(val_final)((operations)(val_final))*;

operations : op_rel | op_neg | op_bitwise | op_arit_baixa | op_logica;
op_rel : MAIOQ | MENOQ | MAIOIG | MENOIG | IGUAL | DIF;
op_neg : SUB | BIT_NOT | NEGA;
op_bitwise : BIT_PE | BIT_PD;
op_arit_baixa : SOMA | MULT | DIV;
op_logica : EE | OUOU | NEGA;
val_final : N_INT | E_STRING | TRUE | FALSE | N_DOUBLE | N_FLOAT  | ID | chamadaFuncao | ID multidimensional | PARENTESES expressao PARENTESES_E;


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
