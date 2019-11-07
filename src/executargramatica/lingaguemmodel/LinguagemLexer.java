// Generated from .\Linguagem.g4 by ANTLR 4.7.2
package executargramatica.lingaguemmodel;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LinguagemLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INICIO=1, FIM=2, BREAK=3, DEFINE=4, INT=5, STRING=6, CHAR=7, BOOLEAN=8, 
		FLOAT=9, DOUBLE=10, VOID=11, IF=12, ELSEIF=13, ELSE=14, TRY=15, CATCH=16, 
		ENDIF=17, SWITCH=18, CASE=19, DEFAULTCASE=20, FOR=21, WHILE=22, DO=23, 
		SOMA=24, SUB=25, MULT=26, DIV=27, RESTO=28, ATRIBU=29, IGUAL=30, MENOQ=31, 
		MAIOQ=32, MENOIG=33, MAIOIG=34, DIF=35, EE=36, OUOU=37, NEGA=38, CONSTLOGICO=39, 
		TRUE=40, FALSE=41, BIT_PD=42, BIT_PE=43, BIT_AND=44, BIT_OR=45, BIT_NOT=46, 
		BIT_XOR=47, N_DOUBLE=48, N_FLOAT=49, N_BIN=50, N_INT=51, N_HEX=52, E_STRING=53, 
		E_CHAR=54, C_LINHA=55, C_MULT=56, PONTOVIRGULA=57, DOISPONTOS=58, VIRGULA=59, 
		PONTO=60, PARENTESES=61, PARENTESES_E=62, CHAVE=63, CHAVE_E=64, COCH=65, 
		COCH_E=66, ID=67, RETORNO=68, COUT=69, CIN=70, ESPACOEMBRANCO=71;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INICIO", "FIM", "BREAK", "DEFINE", "INT", "STRING", "CHAR", "BOOLEAN", 
			"FLOAT", "DOUBLE", "VOID", "IF", "ELSEIF", "ELSE", "TRY", "CATCH", "ENDIF", 
			"SWITCH", "CASE", "DEFAULTCASE", "FOR", "WHILE", "DO", "SOMA", "SUB", 
			"MULT", "DIV", "RESTO", "ATRIBU", "IGUAL", "MENOQ", "MAIOQ", "MENOIG", 
			"MAIOIG", "DIF", "EE", "OUOU", "NEGA", "CONSTLOGICO", "TRUE", "FALSE", 
			"BIT_PD", "BIT_PE", "BIT_AND", "BIT_OR", "BIT_NOT", "BIT_XOR", "N_DOUBLE", 
			"N_FLOAT", "N_BIN", "N_INT", "N_HEX", "E_STRING", "E_CHAR", "C_LINHA", 
			"C_MULT", "PONTOVIRGULA", "DOISPONTOS", "VIRGULA", "PONTO", "PARENTESES", 
			"PARENTESES_E", "CHAVE", "CHAVE_E", "COCH", "COCH_E", "ID", "RETORNO", 
			"COUT", "CIN", "ESPACOEMBRANCO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'end'", "'break'", "'define'", "'int'", "'string'", 
			"'char'", "'bool'", "'float'", "'double'", "'void'", "'if'", "'elseif'", 
			"'else'", "'try'", "'catch'", "'endif'", "'switch'", "'case'", "'defaultcase'", 
			"'for'", "'while'", "'do'", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", 
			"'=='", "'<'", "'>'", "'<='", "'>='", "'!='", "'&&'", "'||'", "'!'", 
			null, "'true'", "'false'", "'>>'", "'<<'", "'&'", "'|'", "'~'", "'^'", 
			null, null, null, null, null, null, null, null, null, "';'", "':'", "','", 
			"'.'", "'('", "')'", "'{'", "'}'", "'['", "']'", null, "'return'", "'cout'", 
			"'cin'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INICIO", "FIM", "BREAK", "DEFINE", "INT", "STRING", "CHAR", "BOOLEAN", 
			"FLOAT", "DOUBLE", "VOID", "IF", "ELSEIF", "ELSE", "TRY", "CATCH", "ENDIF", 
			"SWITCH", "CASE", "DEFAULTCASE", "FOR", "WHILE", "DO", "SOMA", "SUB", 
			"MULT", "DIV", "RESTO", "ATRIBU", "IGUAL", "MENOQ", "MAIOQ", "MENOIG", 
			"MAIOIG", "DIF", "EE", "OUOU", "NEGA", "CONSTLOGICO", "TRUE", "FALSE", 
			"BIT_PD", "BIT_PE", "BIT_AND", "BIT_OR", "BIT_NOT", "BIT_XOR", "N_DOUBLE", 
			"N_FLOAT", "N_BIN", "N_INT", "N_HEX", "E_STRING", "E_CHAR", "C_LINHA", 
			"C_MULT", "PONTOVIRGULA", "DOISPONTOS", "VIRGULA", "PONTO", "PARENTESES", 
			"PARENTESES_E", "CHAVE", "CHAVE_E", "COCH", "COCH_E", "ID", "RETORNO", 
			"COUT", "CIN", "ESPACOEMBRANCO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LinguagemLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Linguagem.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2I\u01d9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$"+
		"\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\5(\u013a\n(\3)\3)\3)\3)\3)\3*\3"+
		"*\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\6\61"+
		"\u0156\n\61\r\61\16\61\u0157\3\61\3\61\6\61\u015c\n\61\r\61\16\61\u015d"+
		"\3\62\6\62\u0161\n\62\r\62\16\62\u0162\3\62\3\62\6\62\u0167\n\62\r\62"+
		"\16\62\u0168\3\62\3\62\3\63\3\63\3\63\3\63\6\63\u0171\n\63\r\63\16\63"+
		"\u0172\3\64\6\64\u0176\n\64\r\64\16\64\u0177\3\65\3\65\3\65\3\65\6\65"+
		"\u017e\n\65\r\65\16\65\u017f\3\66\3\66\3\66\3\66\7\66\u0186\n\66\f\66"+
		"\16\66\u0189\13\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\78\u0195"+
		"\n8\f8\168\u0198\138\38\38\39\39\39\39\79\u01a0\n9\f9\169\u01a3\139\3"+
		"9\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3"+
		"D\3D\7D\u01be\nD\fD\16D\u01c1\13D\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F"+
		"\3G\3G\3G\3G\3H\6H\u01d4\nH\rH\16H\u01d5\3H\3H\3\u01a1\2I\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{"+
		"?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\3\2\13"+
		"\3\2\62;\4\2HHhh\3\2\62\63\5\2\62;CHch\4\2$$^^\4\2\f\f\17\17\5\2C\\aa"+
		"c|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\2\u01e6\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\3\u0091"+
		"\3\2\2\2\5\u0097\3\2\2\2\7\u009b\3\2\2\2\t\u00a1\3\2\2\2\13\u00a8\3\2"+
		"\2\2\r\u00ac\3\2\2\2\17\u00b3\3\2\2\2\21\u00b8\3\2\2\2\23\u00bd\3\2\2"+
		"\2\25\u00c3\3\2\2\2\27\u00ca\3\2\2\2\31\u00cf\3\2\2\2\33\u00d2\3\2\2\2"+
		"\35\u00d9\3\2\2\2\37\u00de\3\2\2\2!\u00e2\3\2\2\2#\u00e8\3\2\2\2%\u00ee"+
		"\3\2\2\2\'\u00f5\3\2\2\2)\u00fa\3\2\2\2+\u0106\3\2\2\2-\u010a\3\2\2\2"+
		"/\u0110\3\2\2\2\61\u0113\3\2\2\2\63\u0115\3\2\2\2\65\u0117\3\2\2\2\67"+
		"\u0119\3\2\2\29\u011b\3\2\2\2;\u011d\3\2\2\2=\u011f\3\2\2\2?\u0122\3\2"+
		"\2\2A\u0124\3\2\2\2C\u0126\3\2\2\2E\u0129\3\2\2\2G\u012c\3\2\2\2I\u012f"+
		"\3\2\2\2K\u0132\3\2\2\2M\u0135\3\2\2\2O\u0139\3\2\2\2Q\u013b\3\2\2\2S"+
		"\u0140\3\2\2\2U\u0146\3\2\2\2W\u0149\3\2\2\2Y\u014c\3\2\2\2[\u014e\3\2"+
		"\2\2]\u0150\3\2\2\2_\u0152\3\2\2\2a\u0155\3\2\2\2c\u0160\3\2\2\2e\u016c"+
		"\3\2\2\2g\u0175\3\2\2\2i\u0179\3\2\2\2k\u0181\3\2\2\2m\u018c\3\2\2\2o"+
		"\u0190\3\2\2\2q\u019b\3\2\2\2s\u01a7\3\2\2\2u\u01a9\3\2\2\2w\u01ab\3\2"+
		"\2\2y\u01ad\3\2\2\2{\u01af\3\2\2\2}\u01b1\3\2\2\2\177\u01b3\3\2\2\2\u0081"+
		"\u01b5\3\2\2\2\u0083\u01b7\3\2\2\2\u0085\u01b9\3\2\2\2\u0087\u01bb\3\2"+
		"\2\2\u0089\u01c2\3\2\2\2\u008b\u01c9\3\2\2\2\u008d\u01ce\3\2\2\2\u008f"+
		"\u01d3\3\2\2\2\u0091\u0092\7d\2\2\u0092\u0093\7g\2\2\u0093\u0094\7i\2"+
		"\2\u0094\u0095\7k\2\2\u0095\u0096\7p\2\2\u0096\4\3\2\2\2\u0097\u0098\7"+
		"g\2\2\u0098\u0099\7p\2\2\u0099\u009a\7f\2\2\u009a\6\3\2\2\2\u009b\u009c"+
		"\7d\2\2\u009c\u009d\7t\2\2\u009d\u009e\7g\2\2\u009e\u009f\7c\2\2\u009f"+
		"\u00a0\7m\2\2\u00a0\b\3\2\2\2\u00a1\u00a2\7f\2\2\u00a2\u00a3\7g\2\2\u00a3"+
		"\u00a4\7h\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7g\2\2"+
		"\u00a7\n\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7v"+
		"\2\2\u00ab\f\3\2\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af"+
		"\7t\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7i\2\2\u00b2"+
		"\16\3\2\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7j\2\2\u00b5\u00b6\7c\2\2\u00b6"+
		"\u00b7\7t\2\2\u00b7\20\3\2\2\2\u00b8\u00b9\7d\2\2\u00b9\u00ba\7q\2\2\u00ba"+
		"\u00bb\7q\2\2\u00bb\u00bc\7n\2\2\u00bc\22\3\2\2\2\u00bd\u00be\7h\2\2\u00be"+
		"\u00bf\7n\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7v\2\2"+
		"\u00c2\24\3\2\2\2\u00c3\u00c4\7f\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7"+
		"w\2\2\u00c6\u00c7\7d\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7g\2\2\u00c9\26"+
		"\3\2\2\2\u00ca\u00cb\7x\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7k\2\2\u00cd"+
		"\u00ce\7f\2\2\u00ce\30\3\2\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7h\2\2\u00d1"+
		"\32\3\2\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7u\2\2\u00d5"+
		"\u00d6\7g\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7h\2\2\u00d8\34\3\2\2\2\u00d9"+
		"\u00da\7g\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7g\2\2"+
		"\u00dd\36\3\2\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7"+
		"{\2\2\u00e1 \3\2\2\2\u00e2\u00e3\7e\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5"+
		"\7v\2\2\u00e5\u00e6\7e\2\2\u00e6\u00e7\7j\2\2\u00e7\"\3\2\2\2\u00e8\u00e9"+
		"\7g\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7f\2\2\u00eb\u00ec\7k\2\2\u00ec"+
		"\u00ed\7h\2\2\u00ed$\3\2\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0\7y\2\2\u00f0"+
		"\u00f1\7k\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7e\2\2\u00f3\u00f4\7j\2\2"+
		"\u00f4&\3\2\2\2\u00f5\u00f6\7e\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7u\2"+
		"\2\u00f8\u00f9\7g\2\2\u00f9(\3\2\2\2\u00fa\u00fb\7f\2\2\u00fb\u00fc\7"+
		"g\2\2\u00fc\u00fd\7h\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7w\2\2\u00ff\u0100"+
		"\7n\2\2\u0100\u0101\7v\2\2\u0101\u0102\7e\2\2\u0102\u0103\7c\2\2\u0103"+
		"\u0104\7u\2\2\u0104\u0105\7g\2\2\u0105*\3\2\2\2\u0106\u0107\7h\2\2\u0107"+
		"\u0108\7q\2\2\u0108\u0109\7t\2\2\u0109,\3\2\2\2\u010a\u010b\7y\2\2\u010b"+
		"\u010c\7j\2\2\u010c\u010d\7k\2\2\u010d\u010e\7n\2\2\u010e\u010f\7g\2\2"+
		"\u010f.\3\2\2\2\u0110\u0111\7f\2\2\u0111\u0112\7q\2\2\u0112\60\3\2\2\2"+
		"\u0113\u0114\7-\2\2\u0114\62\3\2\2\2\u0115\u0116\7/\2\2\u0116\64\3\2\2"+
		"\2\u0117\u0118\7,\2\2\u0118\66\3\2\2\2\u0119\u011a\7\61\2\2\u011a8\3\2"+
		"\2\2\u011b\u011c\7\'\2\2\u011c:\3\2\2\2\u011d\u011e\7?\2\2\u011e<\3\2"+
		"\2\2\u011f\u0120\7?\2\2\u0120\u0121\7?\2\2\u0121>\3\2\2\2\u0122\u0123"+
		"\7>\2\2\u0123@\3\2\2\2\u0124\u0125\7@\2\2\u0125B\3\2\2\2\u0126\u0127\7"+
		">\2\2\u0127\u0128\7?\2\2\u0128D\3\2\2\2\u0129\u012a\7@\2\2\u012a\u012b"+
		"\7?\2\2\u012bF\3\2\2\2\u012c\u012d\7#\2\2\u012d\u012e\7?\2\2\u012eH\3"+
		"\2\2\2\u012f\u0130\7(\2\2\u0130\u0131\7(\2\2\u0131J\3\2\2\2\u0132\u0133"+
		"\7~\2\2\u0133\u0134\7~\2\2\u0134L\3\2\2\2\u0135\u0136\7#\2\2\u0136N\3"+
		"\2\2\2\u0137\u013a\5Q)\2\u0138\u013a\5S*\2\u0139\u0137\3\2\2\2\u0139\u0138"+
		"\3\2\2\2\u013aP\3\2\2\2\u013b\u013c\7v\2\2\u013c\u013d\7t\2\2\u013d\u013e"+
		"\7w\2\2\u013e\u013f\7g\2\2\u013fR\3\2\2\2\u0140\u0141\7h\2\2\u0141\u0142"+
		"\7c\2\2\u0142\u0143\7n\2\2\u0143\u0144\7u\2\2\u0144\u0145\7g\2\2\u0145"+
		"T\3\2\2\2\u0146\u0147\7@\2\2\u0147\u0148\7@\2\2\u0148V\3\2\2\2\u0149\u014a"+
		"\7>\2\2\u014a\u014b\7>\2\2\u014bX\3\2\2\2\u014c\u014d\7(\2\2\u014dZ\3"+
		"\2\2\2\u014e\u014f\7~\2\2\u014f\\\3\2\2\2\u0150\u0151\7\u0080\2\2\u0151"+
		"^\3\2\2\2\u0152\u0153\7`\2\2\u0153`\3\2\2\2\u0154\u0156\t\2\2\2\u0155"+
		"\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159\u015b\7\60\2\2\u015a\u015c\t\2\2\2\u015b"+
		"\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015eb\3\2\2\2\u015f\u0161\t\2\2\2\u0160\u015f\3\2\2\2\u0161\u0162"+
		"\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0166\7\60\2\2\u0165\u0167\t\2\2\2\u0166\u0165\3\2\2\2\u0167\u0168\3"+
		"\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"\u016b\t\3\2\2\u016bd\3\2\2\2\u016c\u016d\7\62\2\2\u016d\u016e\7d\2\2"+
		"\u016e\u0170\3\2\2\2\u016f\u0171\t\4\2\2\u0170\u016f\3\2\2\2\u0171\u0172"+
		"\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173f\3\2\2\2\u0174"+
		"\u0176\t\2\2\2\u0175\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0175\3\2"+
		"\2\2\u0177\u0178\3\2\2\2\u0178h\3\2\2\2\u0179\u017a\7\62\2\2\u017a\u017b"+
		"\7z\2\2\u017b\u017d\3\2\2\2\u017c\u017e\t\5\2\2\u017d\u017c\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180j\3\2\2\2"+
		"\u0181\u0187\7$\2\2\u0182\u0186\n\6\2\2\u0183\u0184\7^\2\2\u0184\u0186"+
		"\13\2\2\2\u0185\u0182\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0189\3\2\2\2"+
		"\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u0187"+
		"\3\2\2\2\u018a\u018b\7$\2\2\u018bl\3\2\2\2\u018c\u018d\7)\2\2\u018d\u018e"+
		"\13\2\2\2\u018e\u018f\7)\2\2\u018fn\3\2\2\2\u0190\u0191\7\61\2\2\u0191"+
		"\u0192\7\61\2\2\u0192\u0196\3\2\2\2\u0193\u0195\n\7\2\2\u0194\u0193\3"+
		"\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019a\b8\2\2\u019ap\3\2\2\2\u019b"+
		"\u019c\7\61\2\2\u019c\u019d\7,\2\2\u019d\u01a1\3\2\2\2\u019e\u01a0\13"+
		"\2\2\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\7,"+
		"\2\2\u01a5\u01a6\7\61\2\2\u01a6r\3\2\2\2\u01a7\u01a8\7=\2\2\u01a8t\3\2"+
		"\2\2\u01a9\u01aa\7<\2\2\u01aav\3\2\2\2\u01ab\u01ac\7.\2\2\u01acx\3\2\2"+
		"\2\u01ad\u01ae\7\60\2\2\u01aez\3\2\2\2\u01af\u01b0\7*\2\2\u01b0|\3\2\2"+
		"\2\u01b1\u01b2\7+\2\2\u01b2~\3\2\2\2\u01b3\u01b4\7}\2\2\u01b4\u0080\3"+
		"\2\2\2\u01b5\u01b6\7\177\2\2\u01b6\u0082\3\2\2\2\u01b7\u01b8\7]\2\2\u01b8"+
		"\u0084\3\2\2\2\u01b9\u01ba\7_\2\2\u01ba\u0086\3\2\2\2\u01bb\u01bf\t\b"+
		"\2\2\u01bc\u01be\t\t\2\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u0088\3\2\2\2\u01c1\u01bf\3\2"+
		"\2\2\u01c2\u01c3\7t\2\2\u01c3\u01c4\7g\2\2\u01c4\u01c5\7v\2\2\u01c5\u01c6"+
		"\7w\2\2\u01c6\u01c7\7t\2\2\u01c7\u01c8\7p\2\2\u01c8\u008a\3\2\2\2\u01c9"+
		"\u01ca\7e\2\2\u01ca\u01cb\7q\2\2\u01cb\u01cc\7w\2\2\u01cc\u01cd\7v\2\2"+
		"\u01cd\u008c\3\2\2\2\u01ce\u01cf\7e\2\2\u01cf\u01d0\7k\2\2\u01d0\u01d1"+
		"\7p\2\2\u01d1\u008e\3\2\2\2\u01d2\u01d4\t\n\2\2\u01d3\u01d2\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2"+
		"\2\2\u01d7\u01d8\bH\2\2\u01d8\u0090\3\2\2\2\21\2\u0139\u0157\u015d\u0162"+
		"\u0168\u0172\u0177\u017f\u0185\u0187\u0196\u01a1\u01bf\u01d5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}