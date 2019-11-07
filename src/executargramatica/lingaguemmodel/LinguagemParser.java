// Generated from .\Linguagem.g4 by ANTLR 4.7.2
package executargramatica.lingaguemmodel;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LinguagemParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_funcaoInicio = 1, RULE_funcao = 2, RULE_parametros = 3, 
		RULE_parametro = 4, RULE_bloco = 5, RULE_comandos = 6, RULE_comando = 7, 
		RULE_entradaesaida = 8, RULE_retorno = 9, RULE_chamadaFuncao = 10, RULE_parametrosChamada = 11, 
		RULE_condicionais = 12, RULE_ifdes = 13, RULE_ifdeselse = 14, RULE_ifdeselseif = 15, 
		RULE_whiledes = 16, RULE_fordes = 17, RULE_dodes = 18, RULE_switchdes = 19, 
		RULE_switchCase = 20, RULE_defaultdes = 21, RULE_declaracoes = 22, RULE_declaracao = 23, 
		RULE_multidimensional = 24, RULE_declaracoesArray = 25, RULE_subArrayDeclaracoes = 26, 
		RULE_atribuicoes = 27, RULE_atribuicoesIncEDec = 28, RULE_tipoComVoid = 29, 
		RULE_tipo = 30, RULE_expressao = 31, RULE_operations = 32, RULE_op_atr = 33, 
		RULE_op_rel = 34, RULE_op_neg = 35, RULE_op_bitwise = 36, RULE_op_arit_baixa = 37, 
		RULE_op_logica = 38, RULE_val_final = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "funcaoInicio", "funcao", "parametros", "parametro", "bloco", 
			"comandos", "comando", "entradaesaida", "retorno", "chamadaFuncao", "parametrosChamada", 
			"condicionais", "ifdes", "ifdeselse", "ifdeselseif", "whiledes", "fordes", 
			"dodes", "switchdes", "switchCase", "defaultdes", "declaracoes", "declaracao", 
			"multidimensional", "declaracoesArray", "subArrayDeclaracoes", "atribuicoes", 
			"atribuicoesIncEDec", "tipoComVoid", "tipo", "expressao", "operations", 
			"op_atr", "op_rel", "op_neg", "op_bitwise", "op_arit_baixa", "op_logica", 
			"val_final"
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

	@Override
	public String getGrammarFileName() { return "Linguagem.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LinguagemParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(LinguagemParser.INICIO, 0); }
		public TerminalNode CHAVE() { return getToken(LinguagemParser.CHAVE, 0); }
		public FuncaoInicioContext funcaoInicio() {
			return getRuleContext(FuncaoInicioContext.class,0);
		}
		public TerminalNode CHAVE_E() { return getToken(LinguagemParser.CHAVE_E, 0); }
		public TerminalNode FIM() { return getToken(LinguagemParser.FIM, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(INICIO);
			setState(81);
			match(CHAVE);
			setState(82);
			funcaoInicio();
			setState(83);
			match(CHAVE_E);
			setState(84);
			match(FIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncaoInicioContext extends ParserRuleContext {
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public List<DeclaracoesContext> declaracoes() {
			return getRuleContexts(DeclaracoesContext.class);
		}
		public DeclaracoesContext declaracoes(int i) {
			return getRuleContext(DeclaracoesContext.class,i);
		}
		public List<TerminalNode> PONTOVIRGULA() { return getTokens(LinguagemParser.PONTOVIRGULA); }
		public TerminalNode PONTOVIRGULA(int i) {
			return getToken(LinguagemParser.PONTOVIRGULA, i);
		}
		public FuncaoInicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcaoInicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterFuncaoInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitFuncaoInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitFuncaoInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncaoInicioContext funcaoInicio() throws RecognitionException {
		FuncaoInicioContext _localctx = new FuncaoInicioContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcaoInicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					{
					setState(86);
					declaracoes();
					setState(87);
					match(PONTOVIRGULA);
					}
					}
					break;
				case 2:
					{
					setState(89);
					funcao();
					}
					break;
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << DOUBLE) | (1L << VOID) | (1L << N_BIN) | (1L << N_HEX))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncaoContext extends ParserRuleContext {
		public TipoComVoidContext tipoComVoid() {
			return getRuleContext(TipoComVoidContext.class,0);
		}
		public TerminalNode ID() { return getToken(LinguagemParser.ID, 0); }
		public TerminalNode PARENTESES() { return getToken(LinguagemParser.PARENTESES, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PARENTESES_E() { return getToken(LinguagemParser.PARENTESES_E, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			tipoComVoid();
			setState(95);
			match(ID);
			setState(96);
			match(PARENTESES);
			setState(97);
			parametros();
			setState(98);
			match(PARENTESES_E);
			setState(99);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LinguagemParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LinguagemParser.VIRGULA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << DOUBLE) | (1L << N_BIN) | (1L << N_HEX))) != 0)) {
				{
				setState(101);
				parametro();
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(102);
					match(VIRGULA);
					setState(103);
					parametro();
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(LinguagemParser.ID, 0); }
		public TerminalNode BIT_AND() { return getToken(LinguagemParser.BIT_AND, 0); }
		public MultidimensionalContext multidimensional() {
			return getRuleContext(MultidimensionalContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			tipo();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BIT_AND) {
				{
				setState(112);
				match(BIT_AND);
				}
			}

			setState(115);
			match(ID);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COCH) {
				{
				setState(116);
				multidimensional();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode CHAVE() { return getToken(LinguagemParser.CHAVE, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode CHAVE_E() { return getToken(LinguagemParser.CHAVE_E, 0); }
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(CHAVE);
			setState(120);
			comandos();
			setState(121);
			match(CHAVE_E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandosContext extends ParserRuleContext {
		public List<CondicionaisContext> condicionais() {
			return getRuleContexts(CondicionaisContext.class);
		}
		public CondicionaisContext condicionais(int i) {
			return getRuleContext(CondicionaisContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << DOUBLE) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << N_BIN) | (1L << N_HEX))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ID - 67)) | (1L << (RETORNO - 67)) | (1L << (COUT - 67)) | (1L << (CIN - 67)))) != 0)) {
				{
				setState(125);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case SWITCH:
				case FOR:
				case WHILE:
				case DO:
					{
					setState(123);
					condicionais();
					}
					break;
				case INT:
				case STRING:
				case CHAR:
				case BOOLEAN:
				case DOUBLE:
				case N_BIN:
				case N_HEX:
				case ID:
				case RETORNO:
				case COUT:
				case CIN:
					{
					setState(124);
					comando();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoContext extends ParserRuleContext {
		public TerminalNode PONTOVIRGULA() { return getToken(LinguagemParser.PONTOVIRGULA, 0); }
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public AtribuicoesContext atribuicoes() {
			return getRuleContext(AtribuicoesContext.class,0);
		}
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public EntradaesaidaContext entradaesaida() {
			return getRuleContext(EntradaesaidaContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(130);
				retorno();
				}
				break;
			case 2:
				{
				setState(131);
				declaracoes();
				}
				break;
			case 3:
				{
				setState(132);
				atribuicoes();
				}
				break;
			case 4:
				{
				setState(133);
				chamadaFuncao();
				}
				break;
			case 5:
				{
				setState(134);
				entradaesaida();
				}
				break;
			}
			setState(137);
			match(PONTOVIRGULA);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntradaesaidaContext extends ParserRuleContext {
		public TerminalNode PARENTESES() { return getToken(LinguagemParser.PARENTESES, 0); }
		public ParametrosChamadaContext parametrosChamada() {
			return getRuleContext(ParametrosChamadaContext.class,0);
		}
		public TerminalNode PARENTESES_E() { return getToken(LinguagemParser.PARENTESES_E, 0); }
		public TerminalNode CIN() { return getToken(LinguagemParser.CIN, 0); }
		public TerminalNode COUT() { return getToken(LinguagemParser.COUT, 0); }
		public EntradaesaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entradaesaida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterEntradaesaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitEntradaesaida(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitEntradaesaida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntradaesaidaContext entradaesaida() throws RecognitionException {
		EntradaesaidaContext _localctx = new EntradaesaidaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_entradaesaida);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !(_la==COUT || _la==CIN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(140);
			match(PARENTESES);
			setState(141);
			parametrosChamada();
			setState(142);
			match(PARENTESES_E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETORNO() { return getToken(LinguagemParser.RETORNO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(RETORNO);
			setState(145);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChamadaFuncaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LinguagemParser.ID, 0); }
		public TerminalNode PARENTESES() { return getToken(LinguagemParser.PARENTESES, 0); }
		public ParametrosChamadaContext parametrosChamada() {
			return getRuleContext(ParametrosChamadaContext.class,0);
		}
		public TerminalNode PARENTESES_E() { return getToken(LinguagemParser.PARENTESES_E, 0); }
		public ChamadaFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterChamadaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitChamadaFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitChamadaFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChamadaFuncaoContext chamadaFuncao() throws RecognitionException {
		ChamadaFuncaoContext _localctx = new ChamadaFuncaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_chamadaFuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(ID);
			setState(148);
			match(PARENTESES);
			setState(149);
			parametrosChamada();
			setState(150);
			match(PARENTESES_E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosChamadaContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LinguagemParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LinguagemParser.VIRGULA, i);
		}
		public ParametrosChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosChamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterParametrosChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitParametrosChamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitParametrosChamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosChamadaContext parametrosChamada() throws RecognitionException {
		ParametrosChamadaContext _localctx = new ParametrosChamadaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parametrosChamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (SUB - 25)) | (1L << (NEGA - 25)) | (1L << (CONSTLOGICO - 25)) | (1L << (BIT_NOT - 25)) | (1L << (N_DOUBLE - 25)) | (1L << (N_BIN - 25)) | (1L << (N_INT - 25)) | (1L << (N_HEX - 25)) | (1L << (E_STRING - 25)) | (1L << (E_CHAR - 25)) | (1L << (PARENTESES - 25)) | (1L << (ID - 25)))) != 0)) {
				{
				setState(152);
				expressao();
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(153);
					match(VIRGULA);
					setState(154);
					expressao();
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionaisContext extends ParserRuleContext {
		public IfdesContext ifdes() {
			return getRuleContext(IfdesContext.class,0);
		}
		public WhiledesContext whiledes() {
			return getRuleContext(WhiledesContext.class,0);
		}
		public FordesContext fordes() {
			return getRuleContext(FordesContext.class,0);
		}
		public DodesContext dodes() {
			return getRuleContext(DodesContext.class,0);
		}
		public TerminalNode PONTOVIRGULA() { return getToken(LinguagemParser.PONTOVIRGULA, 0); }
		public SwitchdesContext switchdes() {
			return getRuleContext(SwitchdesContext.class,0);
		}
		public CondicionaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterCondicionais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitCondicionais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitCondicionais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionaisContext condicionais() throws RecognitionException {
		CondicionaisContext _localctx = new CondicionaisContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condicionais);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				ifdes();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				whiledes();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				fordes();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				dodes();
				setState(166);
				match(PONTOVIRGULA);
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				switchdes();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfdesContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LinguagemParser.IF, 0); }
		public TerminalNode PARENTESES() { return getToken(LinguagemParser.PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESES_E() { return getToken(LinguagemParser.PARENTESES_E, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public IfdeselseContext ifdeselse() {
			return getRuleContext(IfdeselseContext.class,0);
		}
		public IfdeselseifContext ifdeselseif() {
			return getRuleContext(IfdeselseifContext.class,0);
		}
		public IfdesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifdes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterIfdes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitIfdes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitIfdes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfdesContext ifdes() throws RecognitionException {
		IfdesContext _localctx = new IfdesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifdes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(IF);
			setState(172);
			match(PARENTESES);
			setState(173);
			expressao();
			setState(174);
			match(PARENTESES_E);
			setState(175);
			bloco();
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(176);
				ifdeselse();
				}
				break;
			case 2:
				{
				setState(177);
				ifdeselseif();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfdeselseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(LinguagemParser.ELSE, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public IfdeselseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifdeselse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterIfdeselse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitIfdeselse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitIfdeselse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfdeselseContext ifdeselse() throws RecognitionException {
		IfdeselseContext _localctx = new IfdeselseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifdeselse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ELSE);
			setState(181);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfdeselseifContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(LinguagemParser.ELSE, 0); }
		public IfdesContext ifdes() {
			return getRuleContext(IfdesContext.class,0);
		}
		public IfdeselseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifdeselseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterIfdeselseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitIfdeselseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitIfdeselseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfdeselseifContext ifdeselseif() throws RecognitionException {
		IfdeselseifContext _localctx = new IfdeselseifContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifdeselseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(ELSE);
			setState(184);
			ifdes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhiledesContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LinguagemParser.WHILE, 0); }
		public TerminalNode PARENTESES() { return getToken(LinguagemParser.PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESES_E() { return getToken(LinguagemParser.PARENTESES_E, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public WhiledesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whiledes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterWhiledes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitWhiledes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitWhiledes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhiledesContext whiledes() throws RecognitionException {
		WhiledesContext _localctx = new WhiledesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whiledes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(WHILE);
			setState(187);
			match(PARENTESES);
			setState(188);
			expressao();
			setState(189);
			match(PARENTESES_E);
			setState(190);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FordesContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LinguagemParser.FOR, 0); }
		public TerminalNode PARENTESES() { return getToken(LinguagemParser.PARENTESES, 0); }
		public List<TerminalNode> PONTOVIRGULA() { return getTokens(LinguagemParser.PONTOVIRGULA); }
		public TerminalNode PONTOVIRGULA(int i) {
			return getToken(LinguagemParser.PONTOVIRGULA, i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<AtribuicoesContext> atribuicoes() {
			return getRuleContexts(AtribuicoesContext.class);
		}
		public AtribuicoesContext atribuicoes(int i) {
			return getRuleContext(AtribuicoesContext.class,i);
		}
		public TerminalNode PARENTESES_E() { return getToken(LinguagemParser.PARENTESES_E, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public FordesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fordes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterFordes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitFordes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitFordes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FordesContext fordes() throws RecognitionException {
		FordesContext _localctx = new FordesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fordes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(FOR);
			setState(193);
			match(PARENTESES);
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case CHAR:
			case BOOLEAN:
			case DOUBLE:
			case N_BIN:
			case N_HEX:
				{
				setState(194);
				declaracoes();
				}
				break;
			case ID:
				{
				setState(195);
				atribuicoes();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(198);
			match(PONTOVIRGULA);
			setState(199);
			expressao();
			setState(200);
			match(PONTOVIRGULA);
			setState(201);
			atribuicoes();
			setState(202);
			match(PARENTESES_E);
			setState(203);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DodesContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(LinguagemParser.DO, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(LinguagemParser.WHILE, 0); }
		public TerminalNode PARENTESES() { return getToken(LinguagemParser.PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESES_E() { return getToken(LinguagemParser.PARENTESES_E, 0); }
		public DodesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dodes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterDodes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitDodes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitDodes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DodesContext dodes() throws RecognitionException {
		DodesContext _localctx = new DodesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dodes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(DO);
			setState(206);
			bloco();
			setState(207);
			match(WHILE);
			setState(208);
			match(PARENTESES);
			setState(209);
			expressao();
			setState(210);
			match(PARENTESES_E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchdesContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(LinguagemParser.SWITCH, 0); }
		public TerminalNode PARENTESES() { return getToken(LinguagemParser.PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESES_E() { return getToken(LinguagemParser.PARENTESES_E, 0); }
		public TerminalNode CHAVE() { return getToken(LinguagemParser.CHAVE, 0); }
		public SwitchCaseContext switchCase() {
			return getRuleContext(SwitchCaseContext.class,0);
		}
		public DefaultdesContext defaultdes() {
			return getRuleContext(DefaultdesContext.class,0);
		}
		public TerminalNode CHAVE_E() { return getToken(LinguagemParser.CHAVE_E, 0); }
		public SwitchdesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchdes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterSwitchdes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitSwitchdes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitSwitchdes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchdesContext switchdes() throws RecognitionException {
		SwitchdesContext _localctx = new SwitchdesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_switchdes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(SWITCH);
			setState(213);
			match(PARENTESES);
			setState(214);
			expressao();
			setState(215);
			match(PARENTESES_E);
			setState(216);
			match(CHAVE);
			setState(217);
			switchCase();
			setState(218);
			defaultdes();
			setState(219);
			match(CHAVE_E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchCaseContext extends ParserRuleContext {
		public List<TerminalNode> CASE() { return getTokens(LinguagemParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(LinguagemParser.CASE, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> DOISPONTOS() { return getTokens(LinguagemParser.DOISPONTOS); }
		public TerminalNode DOISPONTOS(int i) {
			return getToken(LinguagemParser.DOISPONTOS, i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<TerminalNode> BREAK() { return getTokens(LinguagemParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(LinguagemParser.BREAK, i);
		}
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitSwitchCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitSwitchCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_switchCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(221);
				match(CASE);
				setState(222);
				expressao();
				setState(223);
				match(DOISPONTOS);
				setState(224);
				comandos();
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(225);
					match(BREAK);
					}
				}

				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultdesContext extends ParserRuleContext {
		public TerminalNode DEFAULTCASE() { return getToken(LinguagemParser.DEFAULTCASE, 0); }
		public TerminalNode DOISPONTOS() { return getToken(LinguagemParser.DOISPONTOS, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(LinguagemParser.BREAK, 0); }
		public DefaultdesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultdes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterDefaultdes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitDefaultdes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitDefaultdes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultdesContext defaultdes() throws RecognitionException {
		DefaultdesContext _localctx = new DefaultdesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_defaultdes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULTCASE) {
				{
				setState(233);
				match(DEFAULTCASE);
				setState(234);
				match(DOISPONTOS);
				setState(235);
				comandos();
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(236);
					match(BREAK);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracoesContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LinguagemParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LinguagemParser.VIRGULA, i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			tipo();
			setState(242);
			declaracao();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(243);
				match(VIRGULA);
				setState(244);
				declaracao();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LinguagemParser.ID, 0); }
		public TerminalNode ATRIBU() { return getToken(LinguagemParser.ATRIBU, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public MultidimensionalContext multidimensional() {
			return getRuleContext(MultidimensionalContext.class,0);
		}
		public DeclaracoesArrayContext declaracoesArray() {
			return getRuleContext(DeclaracoesArrayContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(ID);
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATRIBU:
				{
				{
				setState(251);
				match(ATRIBU);
				setState(252);
				expressao();
				}
				}
				break;
			case COCH:
				{
				{
				setState(253);
				multidimensional();
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ATRIBU) {
					{
					setState(254);
					match(ATRIBU);
					setState(255);
					declaracoesArray();
					}
				}

				}
				}
				break;
			case PONTOVIRGULA:
			case VIRGULA:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultidimensionalContext extends ParserRuleContext {
		public List<TerminalNode> COCH() { return getTokens(LinguagemParser.COCH); }
		public TerminalNode COCH(int i) {
			return getToken(LinguagemParser.COCH, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> COCH_E() { return getTokens(LinguagemParser.COCH_E); }
		public TerminalNode COCH_E(int i) {
			return getToken(LinguagemParser.COCH_E, i);
		}
		public MultidimensionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multidimensional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterMultidimensional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitMultidimensional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitMultidimensional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultidimensionalContext multidimensional() throws RecognitionException {
		MultidimensionalContext _localctx = new MultidimensionalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_multidimensional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(260);
				match(COCH);
				setState(261);
				expressao();
				setState(262);
				match(COCH_E);
				}
				}
				setState(266); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COCH );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracoesArrayContext extends ParserRuleContext {
		public List<TerminalNode> CHAVE() { return getTokens(LinguagemParser.CHAVE); }
		public TerminalNode CHAVE(int i) {
			return getToken(LinguagemParser.CHAVE, i);
		}
		public List<TerminalNode> CHAVE_E() { return getTokens(LinguagemParser.CHAVE_E); }
		public TerminalNode CHAVE_E(int i) {
			return getToken(LinguagemParser.CHAVE_E, i);
		}
		public List<SubArrayDeclaracoesContext> subArrayDeclaracoes() {
			return getRuleContexts(SubArrayDeclaracoesContext.class);
		}
		public SubArrayDeclaracoesContext subArrayDeclaracoes(int i) {
			return getRuleContext(SubArrayDeclaracoesContext.class,i);
		}
		public List<DeclaracoesArrayContext> declaracoesArray() {
			return getRuleContexts(DeclaracoesArrayContext.class);
		}
		public DeclaracoesArrayContext declaracoesArray(int i) {
			return getRuleContext(DeclaracoesArrayContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LinguagemParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LinguagemParser.VIRGULA, i);
		}
		public DeclaracoesArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoesArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterDeclaracoesArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitDeclaracoesArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitDeclaracoesArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesArrayContext declaracoesArray() throws RecognitionException {
		DeclaracoesArrayContext _localctx = new DeclaracoesArrayContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declaracoesArray);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(CHAVE);
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
			case NEGA:
			case CONSTLOGICO:
			case BIT_NOT:
			case N_DOUBLE:
			case N_BIN:
			case N_INT:
			case N_HEX:
			case E_STRING:
			case E_CHAR:
			case PARENTESES:
			case ID:
				{
				setState(269);
				subArrayDeclaracoes();
				}
				break;
			case CHAVE:
				{
				setState(270);
				declaracoesArray();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(273);
			match(CHAVE_E);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(274);
					match(VIRGULA);
					setState(275);
					match(CHAVE);
					setState(278);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SUB:
					case NEGA:
					case CONSTLOGICO:
					case BIT_NOT:
					case N_DOUBLE:
					case N_BIN:
					case N_INT:
					case N_HEX:
					case E_STRING:
					case E_CHAR:
					case PARENTESES:
					case ID:
						{
						setState(276);
						subArrayDeclaracoes();
						}
						break;
					case CHAVE:
						{
						setState(277);
						declaracoesArray();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(280);
					match(CHAVE_E);
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubArrayDeclaracoesContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LinguagemParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LinguagemParser.VIRGULA, i);
		}
		public SubArrayDeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subArrayDeclaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterSubArrayDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitSubArrayDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitSubArrayDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubArrayDeclaracoesContext subArrayDeclaracoes() throws RecognitionException {
		SubArrayDeclaracoesContext _localctx = new SubArrayDeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_subArrayDeclaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			expressao();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(288);
				match(VIRGULA);
				setState(289);
				expressao();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtribuicoesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LinguagemParser.ID, 0); }
		public MultidimensionalContext multidimensional() {
			return getRuleContext(MultidimensionalContext.class,0);
		}
		public AtribuicoesIncEDecContext atribuicoesIncEDec() {
			return getRuleContext(AtribuicoesIncEDecContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ATRIBU() { return getToken(LinguagemParser.ATRIBU, 0); }
		public Op_atrContext op_atr() {
			return getRuleContext(Op_atrContext.class,0);
		}
		public AtribuicoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterAtribuicoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitAtribuicoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitAtribuicoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicoesContext atribuicoes() throws RecognitionException {
		AtribuicoesContext _localctx = new AtribuicoesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_atribuicoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(ID);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COCH) {
				{
				setState(296);
				multidimensional();
				}
			}

			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				{
				setState(299);
				atribuicoesIncEDec();
				}
				}
				break;
			case 2:
				{
				{
				setState(302);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ATRIBU:
					{
					setState(300);
					match(ATRIBU);
					}
					break;
				case SOMA:
					{
					setState(301);
					op_atr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(304);
				expressao();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtribuicoesIncEDecContext extends ParserRuleContext {
		public List<TerminalNode> SOMA() { return getTokens(LinguagemParser.SOMA); }
		public TerminalNode SOMA(int i) {
			return getToken(LinguagemParser.SOMA, i);
		}
		public List<TerminalNode> SUB() { return getTokens(LinguagemParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(LinguagemParser.SUB, i);
		}
		public AtribuicoesIncEDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicoesIncEDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterAtribuicoesIncEDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitAtribuicoesIncEDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitAtribuicoesIncEDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicoesIncEDecContext atribuicoesIncEDec() throws RecognitionException {
		AtribuicoesIncEDecContext _localctx = new AtribuicoesIncEDecContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_atribuicoesIncEDec);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(SOMA);
				setState(308);
				match(SOMA);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(SUB);
				setState(310);
				match(SUB);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoComVoidContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(LinguagemParser.VOID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoComVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoComVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterTipoComVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitTipoComVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitTipoComVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoComVoidContext tipoComVoid() throws RecognitionException {
		TipoComVoidContext _localctx = new TipoComVoidContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tipoComVoid);
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(VOID);
				}
				break;
			case INT:
			case STRING:
			case CHAR:
			case BOOLEAN:
			case DOUBLE:
			case N_BIN:
			case N_HEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				tipo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LinguagemParser.INT, 0); }
		public TerminalNode STRING() { return getToken(LinguagemParser.STRING, 0); }
		public TerminalNode DOUBLE() { return getToken(LinguagemParser.DOUBLE, 0); }
		public TerminalNode BOOLEAN() { return getToken(LinguagemParser.BOOLEAN, 0); }
		public TerminalNode N_BIN() { return getToken(LinguagemParser.N_BIN, 0); }
		public TerminalNode N_HEX() { return getToken(LinguagemParser.N_HEX, 0); }
		public TerminalNode CHAR() { return getToken(LinguagemParser.CHAR, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << DOUBLE) | (1L << N_BIN) | (1L << N_HEX))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public List<Val_finalContext> val_final() {
			return getRuleContexts(Val_finalContext.class);
		}
		public Val_finalContext val_final(int i) {
			return getRuleContext(Val_finalContext.class,i);
		}
		public Op_negContext op_neg() {
			return getRuleContext(Op_negContext.class,0);
		}
		public List<OperationsContext> operations() {
			return getRuleContexts(OperationsContext.class);
		}
		public OperationsContext operations(int i) {
			return getRuleContext(OperationsContext.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << NEGA) | (1L << BIT_NOT))) != 0)) {
				{
				setState(319);
				op_neg();
				}
			}

			{
			setState(322);
			val_final();
			}
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOMA) | (1L << SUB) | (1L << MULT) | (1L << DIV) | (1L << RESTO) | (1L << IGUAL) | (1L << MENOQ) | (1L << MAIOQ) | (1L << MAIOIG) | (1L << DIF) | (1L << EE) | (1L << OUOU) | (1L << NEGA) | (1L << BIT_PD) | (1L << BIT_PE) | (1L << BIT_AND) | (1L << BIT_OR) | (1L << BIT_NOT) | (1L << BIT_XOR))) != 0)) {
				{
				{
				{
				setState(323);
				operations();
				}
				{
				setState(324);
				val_final();
				}
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationsContext extends ParserRuleContext {
		public Op_relContext op_rel() {
			return getRuleContext(Op_relContext.class,0);
		}
		public Op_negContext op_neg() {
			return getRuleContext(Op_negContext.class,0);
		}
		public Op_bitwiseContext op_bitwise() {
			return getRuleContext(Op_bitwiseContext.class,0);
		}
		public Op_arit_baixaContext op_arit_baixa() {
			return getRuleContext(Op_arit_baixaContext.class,0);
		}
		public Op_logicaContext op_logica() {
			return getRuleContext(Op_logicaContext.class,0);
		}
		public OperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitOperations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitOperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationsContext operations() throws RecognitionException {
		OperationsContext _localctx = new OperationsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_operations);
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				op_rel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				op_neg();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				op_bitwise();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				op_arit_baixa();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(335);
				op_logica();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_atrContext extends ParserRuleContext {
		public TerminalNode SOMA() { return getToken(LinguagemParser.SOMA, 0); }
		public TerminalNode IGUAL() { return getToken(LinguagemParser.IGUAL, 0); }
		public Op_atrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_atr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterOp_atr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitOp_atr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitOp_atr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_atrContext op_atr() throws RecognitionException {
		Op_atrContext _localctx = new Op_atrContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_op_atr);
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				match(SOMA);
				setState(339);
				match(IGUAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				match(SOMA);
				setState(341);
				match(IGUAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_relContext extends ParserRuleContext {
		public TerminalNode MAIOQ() { return getToken(LinguagemParser.MAIOQ, 0); }
		public TerminalNode MENOQ() { return getToken(LinguagemParser.MENOQ, 0); }
		public TerminalNode MAIOIG() { return getToken(LinguagemParser.MAIOIG, 0); }
		public TerminalNode IGUAL() { return getToken(LinguagemParser.IGUAL, 0); }
		public TerminalNode DIF() { return getToken(LinguagemParser.DIF, 0); }
		public Op_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterOp_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitOp_rel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitOp_rel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_relContext op_rel() throws RecognitionException {
		Op_relContext _localctx = new Op_relContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_op_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MENOQ) | (1L << MAIOQ) | (1L << MAIOIG) | (1L << DIF))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_negContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(LinguagemParser.SUB, 0); }
		public TerminalNode BIT_NOT() { return getToken(LinguagemParser.BIT_NOT, 0); }
		public TerminalNode NEGA() { return getToken(LinguagemParser.NEGA, 0); }
		public Op_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterOp_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitOp_neg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitOp_neg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_negContext op_neg() throws RecognitionException {
		Op_negContext _localctx = new Op_negContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_op_neg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << NEGA) | (1L << BIT_NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_bitwiseContext extends ParserRuleContext {
		public TerminalNode BIT_PE() { return getToken(LinguagemParser.BIT_PE, 0); }
		public TerminalNode BIT_PD() { return getToken(LinguagemParser.BIT_PD, 0); }
		public TerminalNode BIT_AND() { return getToken(LinguagemParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(LinguagemParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(LinguagemParser.BIT_XOR, 0); }
		public TerminalNode BIT_NOT() { return getToken(LinguagemParser.BIT_NOT, 0); }
		public Op_bitwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_bitwise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterOp_bitwise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitOp_bitwise(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitOp_bitwise(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_bitwiseContext op_bitwise() throws RecognitionException {
		Op_bitwiseContext _localctx = new Op_bitwiseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_op_bitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIT_PD) | (1L << BIT_PE) | (1L << BIT_AND) | (1L << BIT_OR) | (1L << BIT_NOT) | (1L << BIT_XOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_arit_baixaContext extends ParserRuleContext {
		public TerminalNode SOMA() { return getToken(LinguagemParser.SOMA, 0); }
		public TerminalNode DIV() { return getToken(LinguagemParser.DIV, 0); }
		public TerminalNode MULT() { return getToken(LinguagemParser.MULT, 0); }
		public TerminalNode RESTO() { return getToken(LinguagemParser.RESTO, 0); }
		public Op_arit_baixaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_arit_baixa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterOp_arit_baixa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitOp_arit_baixa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitOp_arit_baixa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_arit_baixaContext op_arit_baixa() throws RecognitionException {
		Op_arit_baixaContext _localctx = new Op_arit_baixaContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_op_arit_baixa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOMA) | (1L << MULT) | (1L << DIV) | (1L << RESTO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_logicaContext extends ParserRuleContext {
		public TerminalNode EE() { return getToken(LinguagemParser.EE, 0); }
		public TerminalNode OUOU() { return getToken(LinguagemParser.OUOU, 0); }
		public TerminalNode NEGA() { return getToken(LinguagemParser.NEGA, 0); }
		public Op_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterOp_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitOp_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitOp_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_logicaContext op_logica() throws RecognitionException {
		Op_logicaContext _localctx = new Op_logicaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_op_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EE) | (1L << OUOU) | (1L << NEGA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Val_finalContext extends ParserRuleContext {
		public TerminalNode N_INT() { return getToken(LinguagemParser.N_INT, 0); }
		public TerminalNode E_STRING() { return getToken(LinguagemParser.E_STRING, 0); }
		public TerminalNode N_BIN() { return getToken(LinguagemParser.N_BIN, 0); }
		public TerminalNode N_HEX() { return getToken(LinguagemParser.N_HEX, 0); }
		public TerminalNode E_CHAR() { return getToken(LinguagemParser.E_CHAR, 0); }
		public TerminalNode CONSTLOGICO() { return getToken(LinguagemParser.CONSTLOGICO, 0); }
		public TerminalNode N_DOUBLE() { return getToken(LinguagemParser.N_DOUBLE, 0); }
		public TerminalNode ID() { return getToken(LinguagemParser.ID, 0); }
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public MultidimensionalContext multidimensional() {
			return getRuleContext(MultidimensionalContext.class,0);
		}
		public TerminalNode PARENTESES() { return getToken(LinguagemParser.PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESES_E() { return getToken(LinguagemParser.PARENTESES_E, 0); }
		public Val_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterVal_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitVal_final(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitVal_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Val_finalContext val_final() throws RecognitionException {
		Val_finalContext _localctx = new Val_finalContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_val_final);
		try {
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(N_INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(E_STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				match(N_BIN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(357);
				match(N_HEX);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(358);
				match(E_CHAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(359);
				match(CONSTLOGICO);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(360);
				match(N_DOUBLE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(361);
				match(ID);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(362);
				chamadaFuncao();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(363);
				match(ID);
				setState(364);
				multidimensional();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(365);
				match(PARENTESES);
				setState(366);
				expressao();
				setState(367);
				match(PARENTESES_E);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u0176\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3]\n\3\r\3\16\3^\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\7\5k\n\5\f\5\16\5n\13\5\5\5p\n\5\3\6\3\6\5\6t\n\6\3\6"+
		"\3\6\5\6x\n\6\3\7\3\7\3\7\3\7\3\b\3\b\7\b\u0080\n\b\f\b\16\b\u0083\13"+
		"\b\3\t\3\t\3\t\3\t\3\t\5\t\u008a\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u009e\n\r\f\r\16\r\u00a1"+
		"\13\r\5\r\u00a3\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ac\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b5\n\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00c7"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u00e5\n\26\7\26\u00e7\n\26\f\26\16\26\u00ea\13\26\3\27\3\27"+
		"\3\27\3\27\5\27\u00f0\n\27\5\27\u00f2\n\27\3\30\3\30\3\30\3\30\7\30\u00f8"+
		"\n\30\f\30\16\30\u00fb\13\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0103"+
		"\n\31\5\31\u0105\n\31\3\32\3\32\3\32\3\32\6\32\u010b\n\32\r\32\16\32\u010c"+
		"\3\33\3\33\3\33\5\33\u0112\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u0119\n"+
		"\33\3\33\3\33\7\33\u011d\n\33\f\33\16\33\u0120\13\33\3\34\3\34\3\34\7"+
		"\34\u0125\n\34\f\34\16\34\u0128\13\34\3\35\3\35\5\35\u012c\n\35\3\35\3"+
		"\35\3\35\5\35\u0131\n\35\3\35\5\35\u0134\n\35\3\36\3\36\3\36\3\36\5\36"+
		"\u013a\n\36\3\37\3\37\5\37\u013e\n\37\3 \3 \3!\5!\u0143\n!\3!\3!\3!\3"+
		"!\7!\u0149\n!\f!\16!\u014c\13!\3\"\3\"\3\"\3\"\3\"\5\"\u0153\n\"\3#\3"+
		"#\3#\3#\5#\u0159\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0174\n)\3)\2\2*\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\t\3\2GH\6\2\7\n\f"+
		"\f\64\64\66\66\4\2 \"$%\5\2\33\33((\60\60\3\2,\61\4\2\32\32\34\36\3\2"+
		"&(\2\u0185\2R\3\2\2\2\4\\\3\2\2\2\6`\3\2\2\2\bo\3\2\2\2\nq\3\2\2\2\fy"+
		"\3\2\2\2\16\u0081\3\2\2\2\20\u0089\3\2\2\2\22\u008d\3\2\2\2\24\u0092\3"+
		"\2\2\2\26\u0095\3\2\2\2\30\u00a2\3\2\2\2\32\u00ab\3\2\2\2\34\u00ad\3\2"+
		"\2\2\36\u00b6\3\2\2\2 \u00b9\3\2\2\2\"\u00bc\3\2\2\2$\u00c2\3\2\2\2&\u00cf"+
		"\3\2\2\2(\u00d6\3\2\2\2*\u00e8\3\2\2\2,\u00f1\3\2\2\2.\u00f3\3\2\2\2\60"+
		"\u00fc\3\2\2\2\62\u010a\3\2\2\2\64\u010e\3\2\2\2\66\u0121\3\2\2\28\u0129"+
		"\3\2\2\2:\u0139\3\2\2\2<\u013d\3\2\2\2>\u013f\3\2\2\2@\u0142\3\2\2\2B"+
		"\u0152\3\2\2\2D\u0158\3\2\2\2F\u015a\3\2\2\2H\u015c\3\2\2\2J\u015e\3\2"+
		"\2\2L\u0160\3\2\2\2N\u0162\3\2\2\2P\u0173\3\2\2\2RS\7\3\2\2ST\7A\2\2T"+
		"U\5\4\3\2UV\7B\2\2VW\7\4\2\2W\3\3\2\2\2XY\5.\30\2YZ\7;\2\2Z]\3\2\2\2["+
		"]\5\6\4\2\\X\3\2\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\5\3\2"+
		"\2\2`a\5<\37\2ab\7E\2\2bc\7?\2\2cd\5\b\5\2de\7@\2\2ef\5\f\7\2f\7\3\2\2"+
		"\2gl\5\n\6\2hi\7=\2\2ik\5\n\6\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2"+
		"\2mp\3\2\2\2nl\3\2\2\2og\3\2\2\2op\3\2\2\2p\t\3\2\2\2qs\5> \2rt\7.\2\2"+
		"sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uw\7E\2\2vx\5\62\32\2wv\3\2\2\2wx\3\2\2"+
		"\2x\13\3\2\2\2yz\7A\2\2z{\5\16\b\2{|\7B\2\2|\r\3\2\2\2}\u0080\5\32\16"+
		"\2~\u0080\5\20\t\2\177}\3\2\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\17\3\2\2\2\u0083\u0081\3\2\2\2"+
		"\u0084\u008a\5\24\13\2\u0085\u008a\5.\30\2\u0086\u008a\58\35\2\u0087\u008a"+
		"\5\26\f\2\u0088\u008a\5\22\n\2\u0089\u0084\3\2\2\2\u0089\u0085\3\2\2\2"+
		"\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008c\7;\2\2\u008c\21\3\2\2\2\u008d\u008e\t\2\2\2\u008e"+
		"\u008f\7?\2\2\u008f\u0090\5\30\r\2\u0090\u0091\7@\2\2\u0091\23\3\2\2\2"+
		"\u0092\u0093\7F\2\2\u0093\u0094\5@!\2\u0094\25\3\2\2\2\u0095\u0096\7E"+
		"\2\2\u0096\u0097\7?\2\2\u0097\u0098\5\30\r\2\u0098\u0099\7@\2\2\u0099"+
		"\27\3\2\2\2\u009a\u009f\5@!\2\u009b\u009c\7=\2\2\u009c\u009e\5@!\2\u009d"+
		"\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u009a\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\31\3\2\2\2\u00a4\u00ac\5\34\17\2\u00a5\u00ac\5\""+
		"\22\2\u00a6\u00ac\5$\23\2\u00a7\u00a8\5&\24\2\u00a8\u00a9\7;\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00ac\5(\25\2\u00ab\u00a4\3\2\2\2\u00ab\u00a5\3\2"+
		"\2\2\u00ab\u00a6\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\33\3\2\2\2\u00ad\u00ae\7\16\2\2\u00ae\u00af\7?\2\2\u00af\u00b0\5@!\2"+
		"\u00b0\u00b1\7@\2\2\u00b1\u00b4\5\f\7\2\u00b2\u00b5\5\36\20\2\u00b3\u00b5"+
		"\5 \21\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\35\3\2\2\2\u00b6\u00b7\7\20\2\2\u00b7\u00b8\5\f\7\2\u00b8\37\3\2\2\2"+
		"\u00b9\u00ba\7\20\2\2\u00ba\u00bb\5\34\17\2\u00bb!\3\2\2\2\u00bc\u00bd"+
		"\7\30\2\2\u00bd\u00be\7?\2\2\u00be\u00bf\5@!\2\u00bf\u00c0\7@\2\2\u00c0"+
		"\u00c1\5\f\7\2\u00c1#\3\2\2\2\u00c2\u00c3\7\27\2\2\u00c3\u00c6\7?\2\2"+
		"\u00c4\u00c7\5.\30\2\u00c5\u00c7\58\35\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7;\2\2\u00c9\u00ca\5@!\2\u00ca"+
		"\u00cb\7;\2\2\u00cb\u00cc\58\35\2\u00cc\u00cd\7@\2\2\u00cd\u00ce\5\f\7"+
		"\2\u00ce%\3\2\2\2\u00cf\u00d0\7\31\2\2\u00d0\u00d1\5\f\7\2\u00d1\u00d2"+
		"\7\30\2\2\u00d2\u00d3\7?\2\2\u00d3\u00d4\5@!\2\u00d4\u00d5\7@\2\2\u00d5"+
		"\'\3\2\2\2\u00d6\u00d7\7\24\2\2\u00d7\u00d8\7?\2\2\u00d8\u00d9\5@!\2\u00d9"+
		"\u00da\7@\2\2\u00da\u00db\7A\2\2\u00db\u00dc\5*\26\2\u00dc\u00dd\5,\27"+
		"\2\u00dd\u00de\7B\2\2\u00de)\3\2\2\2\u00df\u00e0\7\25\2\2\u00e0\u00e1"+
		"\5@!\2\u00e1\u00e2\7<\2\2\u00e2\u00e4\5\16\b\2\u00e3\u00e5\7\5\2\2\u00e4"+
		"\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00df\3\2"+
		"\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"+\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7\26\2\2\u00ec\u00ed\7<\2\2"+
		"\u00ed\u00ef\5\16\b\2\u00ee\u00f0\7\5\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"-\3\2\2\2\u00f3\u00f4\5> \2\u00f4\u00f9\5\60\31\2\u00f5\u00f6\7=\2\2\u00f6"+
		"\u00f8\5\60\31\2\u00f7\u00f5\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3"+
		"\2\2\2\u00f9\u00fa\3\2\2\2\u00fa/\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u0104"+
		"\7E\2\2\u00fd\u00fe\7\37\2\2\u00fe\u0105\5@!\2\u00ff\u0102\5\62\32\2\u0100"+
		"\u0101\7\37\2\2\u0101\u0103\5\64\33\2\u0102\u0100\3\2\2\2\u0102\u0103"+
		"\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u00fd\3\2\2\2\u0104\u00ff\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\61\3\2\2\2\u0106\u0107\7C\2\2\u0107\u0108\5@!\2\u0108"+
		"\u0109\7D\2\2\u0109\u010b\3\2\2\2\u010a\u0106\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\63\3\2\2\2\u010e\u0111"+
		"\7A\2\2\u010f\u0112\5\66\34\2\u0110\u0112\5\64\33\2\u0111\u010f\3\2\2"+
		"\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u011e\7B\2\2\u0114\u0115"+
		"\7=\2\2\u0115\u0118\7A\2\2\u0116\u0119\5\66\34\2\u0117\u0119\5\64\33\2"+
		"\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b"+
		"\7B\2\2\u011b\u011d\3\2\2\2\u011c\u0114\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\65\3\2\2\2\u0120\u011e\3\2\2"+
		"\2\u0121\u0126\5@!\2\u0122\u0123\7=\2\2\u0123\u0125\5@!\2\u0124\u0122"+
		"\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\67\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012b\7E\2\2\u012a\u012c\5\62\32"+
		"\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u0133\3\2\2\2\u012d\u0134"+
		"\5:\36\2\u012e\u0131\7\37\2\2\u012f\u0131\5D#\2\u0130\u012e\3\2\2\2\u0130"+
		"\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\5@!\2\u0133\u012d\3\2\2"+
		"\2\u0133\u0130\3\2\2\2\u01349\3\2\2\2\u0135\u0136\7\32\2\2\u0136\u013a"+
		"\7\32\2\2\u0137\u0138\7\33\2\2\u0138\u013a\7\33\2\2\u0139\u0135\3\2\2"+
		"\2\u0139\u0137\3\2\2\2\u013a;\3\2\2\2\u013b\u013e\7\r\2\2\u013c\u013e"+
		"\5> \2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e=\3\2\2\2\u013f\u0140"+
		"\t\3\2\2\u0140?\3\2\2\2\u0141\u0143\5H%\2\u0142\u0141\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u014a\5P)\2\u0145\u0146\5B\"\2\u0146"+
		"\u0147\5P)\2\u0147\u0149\3\2\2\2\u0148\u0145\3\2\2\2\u0149\u014c\3\2\2"+
		"\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014bA\3\2\2\2\u014c\u014a"+
		"\3\2\2\2\u014d\u0153\5F$\2\u014e\u0153\5H%\2\u014f\u0153\5J&\2\u0150\u0153"+
		"\5L\'\2\u0151\u0153\5N(\2\u0152\u014d\3\2\2\2\u0152\u014e\3\2\2\2\u0152"+
		"\u014f\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153C\3\2\2\2"+
		"\u0154\u0155\7\32\2\2\u0155\u0159\7 \2\2\u0156\u0157\7\32\2\2\u0157\u0159"+
		"\7 \2\2\u0158\u0154\3\2\2\2\u0158\u0156\3\2\2\2\u0159E\3\2\2\2\u015a\u015b"+
		"\t\4\2\2\u015bG\3\2\2\2\u015c\u015d\t\5\2\2\u015dI\3\2\2\2\u015e\u015f"+
		"\t\6\2\2\u015fK\3\2\2\2\u0160\u0161\t\7\2\2\u0161M\3\2\2\2\u0162\u0163"+
		"\t\b\2\2\u0163O\3\2\2\2\u0164\u0174\7\65\2\2\u0165\u0174\7\67\2\2\u0166"+
		"\u0174\7\64\2\2\u0167\u0174\7\66\2\2\u0168\u0174\78\2\2\u0169\u0174\7"+
		")\2\2\u016a\u0174\7\62\2\2\u016b\u0174\7E\2\2\u016c\u0174\5\26\f\2\u016d"+
		"\u016e\7E\2\2\u016e\u0174\5\62\32\2\u016f\u0170\7?\2\2\u0170\u0171\5@"+
		"!\2\u0171\u0172\7@\2\2\u0172\u0174\3\2\2\2\u0173\u0164\3\2\2\2\u0173\u0165"+
		"\3\2\2\2\u0173\u0166\3\2\2\2\u0173\u0167\3\2\2\2\u0173\u0168\3\2\2\2\u0173"+
		"\u0169\3\2\2\2\u0173\u016a\3\2\2\2\u0173\u016b\3\2\2\2\u0173\u016c\3\2"+
		"\2\2\u0173\u016d\3\2\2\2\u0173\u016f\3\2\2\2\u0174Q\3\2\2\2&\\^losw\177"+
		"\u0081\u0089\u009f\u00a2\u00ab\u00b4\u00c6\u00e4\u00e8\u00ef\u00f1\u00f9"+
		"\u0102\u0104\u010c\u0111\u0118\u011e\u0126\u012b\u0130\u0133\u0139\u013d"+
		"\u0142\u014a\u0152\u0158\u0173";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}