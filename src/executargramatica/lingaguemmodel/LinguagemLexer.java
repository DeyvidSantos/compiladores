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
		MAIOQ=32, MENOIG=33, MAIOIG=34, DIF=35, EE=36, OUOU=37, NEGA=38, TRUE=39, 
		FALSE=40, BIT_PD=41, BIT_PE=42, BIT_AND=43, BIT_OR=44, BIT_NOT=45, BIT_XOR=46, 
		N_DOUBLE=47, N_FLOAT=48, N_BIN=49, N_INT=50, N_HEX=51, E_STRING=52, E_CHAR=53, 
		C_LINHA=54, C_MULT=55, PONTOVIRGULA=56, DOISPONTOS=57, VIRGULA=58, PONTO=59, 
		PARENTESES=60, PARENTESES_E=61, CHAVE=62, CHAVE_E=63, COCH=64, COCH_E=65, 
		ID=66, RETORNO=67, COUT=68, CIN=69, ESPACOEMBRANCO=70;
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
			"MAIOIG", "DIF", "EE", "OUOU", "NEGA", "TRUE", "FALSE", "BIT_PD", "BIT_PE", 
			"BIT_AND", "BIT_OR", "BIT_NOT", "BIT_XOR", "N_DOUBLE", "N_FLOAT", "N_BIN", 
			"N_INT", "N_HEX", "E_STRING", "E_CHAR", "C_LINHA", "C_MULT", "PONTOVIRGULA", 
			"DOISPONTOS", "VIRGULA", "PONTO", "PARENTESES", "PARENTESES_E", "CHAVE", 
			"CHAVE_E", "COCH", "COCH_E", "ID", "RETORNO", "COUT", "CIN", "ESPACOEMBRANCO"
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
			"'true'", "'false'", "'>>'", "'<<'", "'&'", "'|'", "'~'", "'^'", null, 
			null, null, null, null, null, null, null, null, "';'", "':'", "','", 
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
			"MAIOIG", "DIF", "EE", "OUOU", "NEGA", "TRUE", "FALSE", "BIT_PD", "BIT_PE", 
			"BIT_AND", "BIT_OR", "BIT_NOT", "BIT_XOR", "N_DOUBLE", "N_FLOAT", "N_BIN", 
			"N_INT", "N_HEX", "E_STRING", "E_CHAR", "C_LINHA", "C_MULT", "PONTOVIRGULA", 
			"DOISPONTOS", "VIRGULA", "PONTO", "PARENTESES", "PARENTESES_E", "CHAVE", 
			"CHAVE_E", "COCH", "COCH_E", "ID", "RETORNO", "COUT", "CIN", "ESPACOEMBRANCO"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2H\u01d3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3"+
		"$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*"+
		"\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\6\60\u0150\n\60\r\60\16\60\u0151"+
		"\3\60\3\60\6\60\u0156\n\60\r\60\16\60\u0157\3\61\6\61\u015b\n\61\r\61"+
		"\16\61\u015c\3\61\3\61\6\61\u0161\n\61\r\61\16\61\u0162\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\6\62\u016b\n\62\r\62\16\62\u016c\3\63\6\63\u0170\n\63"+
		"\r\63\16\63\u0171\3\64\3\64\3\64\3\64\6\64\u0178\n\64\r\64\16\64\u0179"+
		"\3\65\3\65\3\65\3\65\7\65\u0180\n\65\f\65\16\65\u0183\13\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\7\67\u018f\n\67\f\67\16\67\u0192"+
		"\13\67\3\67\3\67\38\38\38\38\78\u019a\n8\f8\168\u019d\138\38\38\38\39"+
		"\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\7C\u01b8"+
		"\nC\fC\16C\u01bb\13C\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3F\3F\3F\3F\3"+
		"G\6G\u01ce\nG\rG\16G\u01cf\3G\3G\3\u019b\2H\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\3\2\13\3\2\62;\4\2HHhh\3\2"+
		"\62\63\5\2\62;CHch\4\2$$^^\4\2\f\f\17\17\5\2C\\aac|\6\2\62;C\\aac|\5\2"+
		"\13\f\16\17\"\"\2\u01df\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\3\u008f\3\2\2\2\5\u0095\3\2\2\2\7\u0099\3\2\2"+
		"\2\t\u009f\3\2\2\2\13\u00a6\3\2\2\2\r\u00aa\3\2\2\2\17\u00b1\3\2\2\2\21"+
		"\u00b6\3\2\2\2\23\u00bb\3\2\2\2\25\u00c1\3\2\2\2\27\u00c8\3\2\2\2\31\u00cd"+
		"\3\2\2\2\33\u00d0\3\2\2\2\35\u00d7\3\2\2\2\37\u00dc\3\2\2\2!\u00e0\3\2"+
		"\2\2#\u00e6\3\2\2\2%\u00ec\3\2\2\2\'\u00f3\3\2\2\2)\u00f8\3\2\2\2+\u0104"+
		"\3\2\2\2-\u0108\3\2\2\2/\u010e\3\2\2\2\61\u0111\3\2\2\2\63\u0113\3\2\2"+
		"\2\65\u0115\3\2\2\2\67\u0117\3\2\2\29\u0119\3\2\2\2;\u011b\3\2\2\2=\u011d"+
		"\3\2\2\2?\u0120\3\2\2\2A\u0122\3\2\2\2C\u0124\3\2\2\2E\u0127\3\2\2\2G"+
		"\u012a\3\2\2\2I\u012d\3\2\2\2K\u0130\3\2\2\2M\u0133\3\2\2\2O\u0135\3\2"+
		"\2\2Q\u013a\3\2\2\2S\u0140\3\2\2\2U\u0143\3\2\2\2W\u0146\3\2\2\2Y\u0148"+
		"\3\2\2\2[\u014a\3\2\2\2]\u014c\3\2\2\2_\u014f\3\2\2\2a\u015a\3\2\2\2c"+
		"\u0166\3\2\2\2e\u016f\3\2\2\2g\u0173\3\2\2\2i\u017b\3\2\2\2k\u0186\3\2"+
		"\2\2m\u018a\3\2\2\2o\u0195\3\2\2\2q\u01a1\3\2\2\2s\u01a3\3\2\2\2u\u01a5"+
		"\3\2\2\2w\u01a7\3\2\2\2y\u01a9\3\2\2\2{\u01ab\3\2\2\2}\u01ad\3\2\2\2\177"+
		"\u01af\3\2\2\2\u0081\u01b1\3\2\2\2\u0083\u01b3\3\2\2\2\u0085\u01b5\3\2"+
		"\2\2\u0087\u01bc\3\2\2\2\u0089\u01c3\3\2\2\2\u008b\u01c8\3\2\2\2\u008d"+
		"\u01cd\3\2\2\2\u008f\u0090\7d\2\2\u0090\u0091\7g\2\2\u0091\u0092\7i\2"+
		"\2\u0092\u0093\7k\2\2\u0093\u0094\7p\2\2\u0094\4\3\2\2\2\u0095\u0096\7"+
		"g\2\2\u0096\u0097\7p\2\2\u0097\u0098\7f\2\2\u0098\6\3\2\2\2\u0099\u009a"+
		"\7d\2\2\u009a\u009b\7t\2\2\u009b\u009c\7g\2\2\u009c\u009d\7c\2\2\u009d"+
		"\u009e\7m\2\2\u009e\b\3\2\2\2\u009f\u00a0\7f\2\2\u00a0\u00a1\7g\2\2\u00a1"+
		"\u00a2\7h\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7g\2\2"+
		"\u00a5\n\3\2\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7v"+
		"\2\2\u00a9\f\3\2\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad"+
		"\7t\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7i\2\2\u00b0"+
		"\16\3\2\2\2\u00b1\u00b2\7e\2\2\u00b2\u00b3\7j\2\2\u00b3\u00b4\7c\2\2\u00b4"+
		"\u00b5\7t\2\2\u00b5\20\3\2\2\2\u00b6\u00b7\7d\2\2\u00b7\u00b8\7q\2\2\u00b8"+
		"\u00b9\7q\2\2\u00b9\u00ba\7n\2\2\u00ba\22\3\2\2\2\u00bb\u00bc\7h\2\2\u00bc"+
		"\u00bd\7n\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7v\2\2"+
		"\u00c0\24\3\2\2\2\u00c1\u00c2\7f\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7"+
		"w\2\2\u00c4\u00c5\7d\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7g\2\2\u00c7\26"+
		"\3\2\2\2\u00c8\u00c9\7x\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7k\2\2\u00cb"+
		"\u00cc\7f\2\2\u00cc\30\3\2\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7h\2\2\u00cf"+
		"\32\3\2\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7u\2\2\u00d3"+
		"\u00d4\7g\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7h\2\2\u00d6\34\3\2\2\2\u00d7"+
		"\u00d8\7g\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7g\2\2"+
		"\u00db\36\3\2\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7"+
		"{\2\2\u00df \3\2\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3"+
		"\7v\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5\7j\2\2\u00e5\"\3\2\2\2\u00e6\u00e7"+
		"\7g\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9\7f\2\2\u00e9\u00ea\7k\2\2\u00ea"+
		"\u00eb\7h\2\2\u00eb$\3\2\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ee\7y\2\2\u00ee"+
		"\u00ef\7k\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7j\2\2"+
		"\u00f2&\3\2\2\2\u00f3\u00f4\7e\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7u\2"+
		"\2\u00f6\u00f7\7g\2\2\u00f7(\3\2\2\2\u00f8\u00f9\7f\2\2\u00f9\u00fa\7"+
		"g\2\2\u00fa\u00fb\7h\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7w\2\2\u00fd\u00fe"+
		"\7n\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7e\2\2\u0100\u0101\7c\2\2\u0101"+
		"\u0102\7u\2\2\u0102\u0103\7g\2\2\u0103*\3\2\2\2\u0104\u0105\7h\2\2\u0105"+
		"\u0106\7q\2\2\u0106\u0107\7t\2\2\u0107,\3\2\2\2\u0108\u0109\7y\2\2\u0109"+
		"\u010a\7j\2\2\u010a\u010b\7k\2\2\u010b\u010c\7n\2\2\u010c\u010d\7g\2\2"+
		"\u010d.\3\2\2\2\u010e\u010f\7f\2\2\u010f\u0110\7q\2\2\u0110\60\3\2\2\2"+
		"\u0111\u0112\7-\2\2\u0112\62\3\2\2\2\u0113\u0114\7/\2\2\u0114\64\3\2\2"+
		"\2\u0115\u0116\7,\2\2\u0116\66\3\2\2\2\u0117\u0118\7\61\2\2\u01188\3\2"+
		"\2\2\u0119\u011a\7\'\2\2\u011a:\3\2\2\2\u011b\u011c\7?\2\2\u011c<\3\2"+
		"\2\2\u011d\u011e\7?\2\2\u011e\u011f\7?\2\2\u011f>\3\2\2\2\u0120\u0121"+
		"\7>\2\2\u0121@\3\2\2\2\u0122\u0123\7@\2\2\u0123B\3\2\2\2\u0124\u0125\7"+
		">\2\2\u0125\u0126\7?\2\2\u0126D\3\2\2\2\u0127\u0128\7@\2\2\u0128\u0129"+
		"\7?\2\2\u0129F\3\2\2\2\u012a\u012b\7#\2\2\u012b\u012c\7?\2\2\u012cH\3"+
		"\2\2\2\u012d\u012e\7(\2\2\u012e\u012f\7(\2\2\u012fJ\3\2\2\2\u0130\u0131"+
		"\7~\2\2\u0131\u0132\7~\2\2\u0132L\3\2\2\2\u0133\u0134\7#\2\2\u0134N\3"+
		"\2\2\2\u0135\u0136\7v\2\2\u0136\u0137\7t\2\2\u0137\u0138\7w\2\2\u0138"+
		"\u0139\7g\2\2\u0139P\3\2\2\2\u013a\u013b\7h\2\2\u013b\u013c\7c\2\2\u013c"+
		"\u013d\7n\2\2\u013d\u013e\7u\2\2\u013e\u013f\7g\2\2\u013fR\3\2\2\2\u0140"+
		"\u0141\7@\2\2\u0141\u0142\7@\2\2\u0142T\3\2\2\2\u0143\u0144\7>\2\2\u0144"+
		"\u0145\7>\2\2\u0145V\3\2\2\2\u0146\u0147\7(\2\2\u0147X\3\2\2\2\u0148\u0149"+
		"\7~\2\2\u0149Z\3\2\2\2\u014a\u014b\7\u0080\2\2\u014b\\\3\2\2\2\u014c\u014d"+
		"\7`\2\2\u014d^\3\2\2\2\u014e\u0150\t\2\2\2\u014f\u014e\3\2\2\2\u0150\u0151"+
		"\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0155\7\60\2\2\u0154\u0156\t\2\2\2\u0155\u0154\3\2\2\2\u0156\u0157\3"+
		"\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158`\3\2\2\2\u0159\u015b"+
		"\t\2\2\2\u015a\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\7\60\2\2\u015f\u0161\t"+
		"\2\2\2\u0160\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0160\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\t\3\2\2\u0165b\3\2\2\2"+
		"\u0166\u0167\7\62\2\2\u0167\u0168\7d\2\2\u0168\u016a\3\2\2\2\u0169\u016b"+
		"\t\4\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016a\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016dd\3\2\2\2\u016e\u0170\t\2\2\2\u016f\u016e\3\2\2\2"+
		"\u0170\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172f\3"+
		"\2\2\2\u0173\u0174\7\62\2\2\u0174\u0175\7z\2\2\u0175\u0177\3\2\2\2\u0176"+
		"\u0178\t\5\2\2\u0177\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0177\3\2"+
		"\2\2\u0179\u017a\3\2\2\2\u017ah\3\2\2\2\u017b\u0181\7$\2\2\u017c\u0180"+
		"\n\6\2\2\u017d\u017e\7^\2\2\u017e\u0180\13\2\2\2\u017f\u017c\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\7$\2\2\u0185"+
		"j\3\2\2\2\u0186\u0187\7)\2\2\u0187\u0188\13\2\2\2\u0188\u0189\7)\2\2\u0189"+
		"l\3\2\2\2\u018a\u018b\7\61\2\2\u018b\u018c\7\61\2\2\u018c\u0190\3\2\2"+
		"\2\u018d\u018f\n\7\2\2\u018e\u018d\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193"+
		"\u0194\b\67\2\2\u0194n\3\2\2\2\u0195\u0196\7\61\2\2\u0196\u0197\7,\2\2"+
		"\u0197\u019b\3\2\2\2\u0198\u019a\13\2\2\2\u0199\u0198\3\2\2\2\u019a\u019d"+
		"\3\2\2\2\u019b\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019e\3\2\2\2\u019d"+
		"\u019b\3\2\2\2\u019e\u019f\7,\2\2\u019f\u01a0\7\61\2\2\u01a0p\3\2\2\2"+
		"\u01a1\u01a2\7=\2\2\u01a2r\3\2\2\2\u01a3\u01a4\7<\2\2\u01a4t\3\2\2\2\u01a5"+
		"\u01a6\7.\2\2\u01a6v\3\2\2\2\u01a7\u01a8\7\60\2\2\u01a8x\3\2\2\2\u01a9"+
		"\u01aa\7*\2\2\u01aaz\3\2\2\2\u01ab\u01ac\7+\2\2\u01ac|\3\2\2\2\u01ad\u01ae"+
		"\7}\2\2\u01ae~\3\2\2\2\u01af\u01b0\7\177\2\2\u01b0\u0080\3\2\2\2\u01b1"+
		"\u01b2\7]\2\2\u01b2\u0082\3\2\2\2\u01b3\u01b4\7_\2\2\u01b4\u0084\3\2\2"+
		"\2\u01b5\u01b9\t\b\2\2\u01b6\u01b8\t\t\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb"+
		"\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u0086\3\2\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bc\u01bd\7t\2\2\u01bd\u01be\7g\2\2\u01be\u01bf\7v\2"+
		"\2\u01bf\u01c0\7w\2\2\u01c0\u01c1\7t\2\2\u01c1\u01c2\7p\2\2\u01c2\u0088"+
		"\3\2\2\2\u01c3\u01c4\7e\2\2\u01c4\u01c5\7q\2\2\u01c5\u01c6\7w\2\2\u01c6"+
		"\u01c7\7v\2\2\u01c7\u008a\3\2\2\2\u01c8\u01c9\7e\2\2\u01c9\u01ca\7k\2"+
		"\2\u01ca\u01cb\7p\2\2\u01cb\u008c\3\2\2\2\u01cc\u01ce\t\n\2\2\u01cd\u01cc"+
		"\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01d1\3\2\2\2\u01d1\u01d2\bG\2\2\u01d2\u008e\3\2\2\2\20\2\u0151\u0157"+
		"\u015c\u0162\u016c\u0171\u0179\u017f\u0181\u0190\u019b\u01b9\u01cf\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}