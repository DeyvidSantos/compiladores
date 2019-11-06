// Generated from c:\antlr\ExecutarGramatica\src\executargramatica\lingaguemmodel\Linguagem.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

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
	public static final int
		RULE_prog = 0, RULE_funcoes = 1, RULE_parametros = 2, RULE_bloco = 3, 
		RULE_comandos = 4, RULE_imprimir = 5, RULE_ler = 6, RULE_retorno = 7, 
		RULE_chamadaFuncao = 8, RULE_parametrosChamada = 9, RULE_condicionais = 10, 
		RULE_iffi = 11, RULE_elsese = 12, RULE_elseiffi = 13, RULE_whiles = 14, 
		RULE_fors = 15, RULE_dos = 16, RULE_switchs = 17, RULE_cases = 18, RULE_defaults = 19, 
		RULE_declaracoes = 20, RULE_multidimensional = 21, RULE_declaracoesArray = 22, 
		RULE_subArrayDeclaracoes = 23, RULE_atribuicoes = 24, RULE_atribuicoesIncEDec = 25, 
		RULE_tipoComVoid = 26, RULE_tipo = 27, RULE_expressao = 28, RULE_operations = 29, 
		RULE_op_rel = 30, RULE_op_neg = 31, RULE_op_bitwise = 32, RULE_op_arit_baixa = 33, 
		RULE_op_logica = 34, RULE_val_final = 35;
	public static final String[] ruleNames = {
		"prog", "funcoes", "parametros", "bloco", "comandos", "imprimir", "ler", 
		"retorno", "chamadaFuncao", "parametrosChamada", "condicionais", "iffi", 
		"elsese", "elseiffi", "whiles", "fors", "dos", "switchs", "cases", "defaults", 
		"declaracoes", "multidimensional", "declaracoesArray", "subArrayDeclaracoes", 
		"atribuicoes", "atribuicoesIncEDec", "tipoComVoid", "tipo", "expressao", 
		"operations", "op_rel", "op_neg", "op_bitwise", "op_arit_baixa", "op_logica", 
		"val_final"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'end'", "'break'", "'define'", "'int'", "'string'", 
		"'char'", "'bool'", "'float'", "'double'", "'void'", "'if'", "'elseif'", 
		"'else'", "'try'", "'catch'", "'endif'", "'switch'", "'case'", "'defaultcase'", 
		"'for'", "'while'", "'do'", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", 
		"'=='", "'<'", "'>'", "'<='", "'>='", "'!='", "'&&'", "'||'", "'!'", "'true'", 
		"'false'", "'>>'", "'<<'", "'&'", "'|'", "'~'", "'^'", null, null, null, 
		null, null, null, null, null, null, "';'", "':'", "','", "'.'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", null, "'return'", "'cout'", "'cin'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
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
		public TerminalNode CHAVE_E() { return getToken(LinguagemParser.CHAVE_E, 0); }
		public TerminalNode FIM() { return getToken(LinguagemParser.FIM, 0); }
		public List<DeclaracoesContext> declaracoes() {
			return getRuleContexts(DeclaracoesContext.class);
		}
		public DeclaracoesContext declaracoes(int i) {
			return getRuleContext(DeclaracoesContext.class,i);
		}
		public List<FuncoesContext> funcoes() {
			return getRuleContexts(FuncoesContext.class);
		}
		public FuncoesContext funcoes(int i) {
			return getRuleContext(FuncoesContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(INICIO);
			setState(73);
			match(CHAVE);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74);
					declaracoes();
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				funcoes();
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << FLOAT) | (1L << DOUBLE) | (1L << VOID) | (1L << N_BIN) | (1L << N_HEX))) != 0) );
			setState(85);
			match(CHAVE_E);
			setState(86);
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

	public static class FuncoesContext extends ParserRuleContext {
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
		public FuncoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcoes; }
	}

	public final FuncoesContext funcoes() throws RecognitionException {
		FuncoesContext _localctx = new FuncoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcoes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(88);
			tipoComVoid();
			setState(89);
			match(ID);
			setState(90);
			match(PARENTESES);
			setState(91);
			parametros();
			setState(92);
			match(PARENTESES_E);
			setState(93);
			bloco();
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

	public static class ParametrosContext extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(LinguagemParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LinguagemParser.ID, i);
		}
		public MultidimensionalContext multidimensional() {
			return getRuleContext(MultidimensionalContext.class,0);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LinguagemParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LinguagemParser.VIRGULA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << FLOAT) | (1L << DOUBLE) | (1L << N_BIN) | (1L << N_HEX))) != 0)) {
				{
				setState(110);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(95);
					tipo();
					setState(96);
					match(ID);
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULA) {
						{
						{
						setState(97);
						match(VIRGULA);
						setState(98);
						tipo();
						setState(99);
						match(ID);
						}
						}
						setState(105);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					{
					setState(106);
					tipo();
					setState(107);
					match(ID);
					setState(108);
					multidimensional();
					}
					}
					break;
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
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(CHAVE);
			setState(115);
			comandos();
			setState(116);
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
		public List<TerminalNode> PONTOVIRGULA() { return getTokens(LinguagemParser.PONTOVIRGULA); }
		public TerminalNode PONTOVIRGULA(int i) {
			return getToken(LinguagemParser.PONTOVIRGULA, i);
		}
		public List<RetornoContext> retorno() {
			return getRuleContexts(RetornoContext.class);
		}
		public RetornoContext retorno(int i) {
			return getRuleContext(RetornoContext.class,i);
		}
		public List<DeclaracoesContext> declaracoes() {
			return getRuleContexts(DeclaracoesContext.class);
		}
		public DeclaracoesContext declaracoes(int i) {
			return getRuleContext(DeclaracoesContext.class,i);
		}
		public List<AtribuicoesContext> atribuicoes() {
			return getRuleContexts(AtribuicoesContext.class);
		}
		public AtribuicoesContext atribuicoes(int i) {
			return getRuleContext(AtribuicoesContext.class,i);
		}
		public List<ChamadaFuncaoContext> chamadaFuncao() {
			return getRuleContexts(ChamadaFuncaoContext.class);
		}
		public ChamadaFuncaoContext chamadaFuncao(int i) {
			return getRuleContext(ChamadaFuncaoContext.class,i);
		}
		public List<ImprimirContext> imprimir() {
			return getRuleContexts(ImprimirContext.class);
		}
		public ImprimirContext imprimir(int i) {
			return getRuleContext(ImprimirContext.class,i);
		}
		public List<LerContext> ler() {
			return getRuleContexts(LerContext.class);
		}
		public LerContext ler(int i) {
			return getRuleContext(LerContext.class,i);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << FLOAT) | (1L << DOUBLE) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << N_BIN) | (1L << N_HEX))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ID - 66)) | (1L << (RETORNO - 66)) | (1L << (COUT - 66)) | (1L << (CIN - 66)))) != 0)) {
				{
				setState(129);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case SWITCH:
				case FOR:
				case WHILE:
				case DO:
					{
					setState(118);
					condicionais();
					}
					break;
				case INT:
				case STRING:
				case CHAR:
				case BOOLEAN:
				case FLOAT:
				case DOUBLE:
				case N_BIN:
				case N_HEX:
				case ID:
				case RETORNO:
				case COUT:
				case CIN:
					{
					{
					setState(125);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(119);
						retorno();
						}
						break;
					case 2:
						{
						setState(120);
						declaracoes();
						}
						break;
					case 3:
						{
						setState(121);
						atribuicoes();
						}
						break;
					case 4:
						{
						setState(122);
						chamadaFuncao();
						}
						break;
					case 5:
						{
						setState(123);
						imprimir();
						}
						break;
					case 6:
						{
						setState(124);
						ler();
						}
						break;
					}
					setState(127);
					match(PONTOVIRGULA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(133);
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

	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode COUT() { return getToken(LinguagemParser.COUT, 0); }
		public TerminalNode PARENTESES() { return getToken(LinguagemParser.PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESES_E() { return getToken(LinguagemParser.PARENTESES_E, 0); }
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(COUT);
			setState(135);
			match(PARENTESES);
			setState(136);
			expressao();
			setState(137);
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

	public static class LerContext extends ParserRuleContext {
		public TerminalNode CIN() { return getToken(LinguagemParser.CIN, 0); }
		public TerminalNode PARENTESES() { return getToken(LinguagemParser.PARENTESES, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode PARENTESES_E() { return getToken(LinguagemParser.PARENTESES_E, 0); }
		public LerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ler; }
	}

	public final LerContext ler() throws RecognitionException {
		LerContext _localctx = new LerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(CIN);
			setState(140);
			match(PARENTESES);
			setState(141);
			comandos();
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
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_retorno);
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
	}

	public final ChamadaFuncaoContext chamadaFuncao() throws RecognitionException {
		ChamadaFuncaoContext _localctx = new ChamadaFuncaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_chamadaFuncao);
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
	}

	public final ParametrosChamadaContext parametrosChamada() throws RecognitionException {
		ParametrosChamadaContext _localctx = new ParametrosChamadaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parametrosChamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (SUB - 25)) | (1L << (NEGA - 25)) | (1L << (TRUE - 25)) | (1L << (FALSE - 25)) | (1L << (BIT_NOT - 25)) | (1L << (N_DOUBLE - 25)) | (1L << (N_FLOAT - 25)) | (1L << (N_INT - 25)) | (1L << (E_STRING - 25)) | (1L << (PARENTESES - 25)) | (1L << (ID - 25)))) != 0)) {
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
		public IffiContext iffi() {
			return getRuleContext(IffiContext.class,0);
		}
		public WhilesContext whiles() {
			return getRuleContext(WhilesContext.class,0);
		}
		public ForsContext fors() {
			return getRuleContext(ForsContext.class,0);
		}
		public DosContext dos() {
			return getRuleContext(DosContext.class,0);
		}
		public TerminalNode PONTOVIRGULA() { return getToken(LinguagemParser.PONTOVIRGULA, 0); }
		public SwitchsContext switchs() {
			return getRuleContext(SwitchsContext.class,0);
		}
		public CondicionaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionais; }
	}

	public final CondicionaisContext condicionais() throws RecognitionException {
		CondicionaisContext _localctx = new CondicionaisContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condicionais);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				iffi();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				whiles();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				fors();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				dos();
				setState(166);
				match(PONTOVIRGULA);
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				switchs();
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

	public static class IffiContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LinguagemParser.IF, 0); }
		public TerminalNode PARENTESES() { return getToken(LinguagemParser.PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESES_E() { return getToken(LinguagemParser.PARENTESES_E, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ElseseContext elsese() {
			return getRuleContext(ElseseContext.class,0);
		}
		public ElseiffiContext elseiffi() {
			return getRuleContext(ElseiffiContext.class,0);
		}
		public IffiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iffi; }
	}

	public final IffiContext iffi() throws RecognitionException {
		IffiContext _localctx = new IffiContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_iffi);
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
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(176);
				elsese();
				}
				break;
			case 2:
				{
				setState(177);
				elseiffi();
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

	public static class ElseseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(LinguagemParser.ELSE, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ElseseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsese; }
	}

	public final ElseseContext elsese() throws RecognitionException {
		ElseseContext _localctx = new ElseseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elsese);
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

	public static class ElseiffiContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(LinguagemParser.ELSE, 0); }
		public IffiContext iffi() {
			return getRuleContext(IffiContext.class,0);
		}
		public ElseiffiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseiffi; }
	}

	public final ElseiffiContext elseiffi() throws RecognitionException {
		ElseiffiContext _localctx = new ElseiffiContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elseiffi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(ELSE);
			setState(184);
			iffi();
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

	public static class WhilesContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LinguagemParser.WHILE, 0); }
		public TerminalNode PARENTESES() { return getToken(LinguagemParser.PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESES_E() { return getToken(LinguagemParser.PARENTESES_E, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public WhilesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whiles; }
	}

	public final WhilesContext whiles() throws RecognitionException {
		WhilesContext _localctx = new WhilesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whiles);
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

	public static class ForsContext extends ParserRuleContext {
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
		public ForsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fors; }
	}

	public final ForsContext fors() throws RecognitionException {
		ForsContext _localctx = new ForsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fors);
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
			case FLOAT:
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

	public static class DosContext extends ParserRuleContext {
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
		public TerminalNode PONTOVIRGULA() { return getToken(LinguagemParser.PONTOVIRGULA, 0); }
		public DosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dos; }
	}

	public final DosContext dos() throws RecognitionException {
		DosContext _localctx = new DosContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dos);
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
			setState(211);
			match(PONTOVIRGULA);
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

	public static class SwitchsContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(LinguagemParser.SWITCH, 0); }
		public TerminalNode PARENTESES() { return getToken(LinguagemParser.PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESES_E() { return getToken(LinguagemParser.PARENTESES_E, 0); }
		public TerminalNode CHAVE() { return getToken(LinguagemParser.CHAVE, 0); }
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public DefaultsContext defaults() {
			return getRuleContext(DefaultsContext.class,0);
		}
		public TerminalNode CHAVE_E() { return getToken(LinguagemParser.CHAVE_E, 0); }
		public SwitchsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchs; }
	}

	public final SwitchsContext switchs() throws RecognitionException {
		SwitchsContext _localctx = new SwitchsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_switchs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(SWITCH);
			setState(214);
			match(PARENTESES);
			setState(215);
			expressao();
			setState(216);
			match(PARENTESES_E);
			setState(217);
			match(CHAVE);
			setState(218);
			cases();
			setState(219);
			defaults();
			setState(220);
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

	public static class CasesContext extends ParserRuleContext {
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
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(222);
				match(CASE);
				setState(223);
				expressao();
				setState(224);
				match(DOISPONTOS);
				setState(225);
				comandos();
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(226);
					match(BREAK);
					}
				}

				}
				}
				setState(233);
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

	public static class DefaultsContext extends ParserRuleContext {
		public TerminalNode DEFAULTCASE() { return getToken(LinguagemParser.DEFAULTCASE, 0); }
		public TerminalNode DOISPONTOS() { return getToken(LinguagemParser.DOISPONTOS, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(LinguagemParser.BREAK, 0); }
		public DefaultsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaults; }
	}

	public final DefaultsContext defaults() throws RecognitionException {
		DefaultsContext _localctx = new DefaultsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_defaults);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULTCASE) {
				{
				setState(234);
				match(DEFAULTCASE);
				setState(235);
				match(DOISPONTOS);
				setState(236);
				comandos();
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(237);
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
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			tipo();
			setState(243);
			match(ID);
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATRIBU:
				{
				{
				setState(244);
				match(ATRIBU);
				setState(245);
				expressao();
				}
				}
				break;
			case COCH:
				{
				{
				setState(246);
				multidimensional();
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ATRIBU) {
					{
					setState(247);
					match(ATRIBU);
					setState(248);
					declaracoesArray();
					}
				}

				}
				}
				break;
			case INT:
			case STRING:
			case CHAR:
			case BOOLEAN:
			case FLOAT:
			case DOUBLE:
			case VOID:
			case N_BIN:
			case N_HEX:
			case PONTOVIRGULA:
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
		public List<TerminalNode> N_INT() { return getTokens(LinguagemParser.N_INT); }
		public TerminalNode N_INT(int i) {
			return getToken(LinguagemParser.N_INT, i);
		}
		public List<TerminalNode> COCH_E() { return getTokens(LinguagemParser.COCH_E); }
		public TerminalNode COCH_E(int i) {
			return getToken(LinguagemParser.COCH_E, i);
		}
		public MultidimensionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multidimensional; }
	}

	public final MultidimensionalContext multidimensional() throws RecognitionException {
		MultidimensionalContext _localctx = new MultidimensionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multidimensional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(253);
				match(COCH);
				setState(254);
				match(N_INT);
				setState(255);
				match(COCH_E);
				}
				}
				setState(258); 
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
	}

	public final DeclaracoesArrayContext declaracoesArray() throws RecognitionException {
		DeclaracoesArrayContext _localctx = new DeclaracoesArrayContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declaracoesArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(CHAVE);
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
			case NEGA:
			case TRUE:
			case FALSE:
			case BIT_NOT:
			case N_DOUBLE:
			case N_FLOAT:
			case N_INT:
			case E_STRING:
			case PARENTESES:
			case ID:
				{
				setState(261);
				subArrayDeclaracoes();
				}
				break;
			case CHAVE:
				{
				setState(262);
				declaracoesArray();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(265);
			match(CHAVE_E);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(266);
				match(VIRGULA);
				setState(267);
				match(CHAVE);
				setState(270);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUB:
				case NEGA:
				case TRUE:
				case FALSE:
				case BIT_NOT:
				case N_DOUBLE:
				case N_FLOAT:
				case N_INT:
				case E_STRING:
				case PARENTESES:
				case ID:
					{
					setState(268);
					subArrayDeclaracoes();
					}
					break;
				case CHAVE:
					{
					setState(269);
					declaracoesArray();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(272);
				match(CHAVE_E);
				}
				}
				setState(278);
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
	}

	public final SubArrayDeclaracoesContext subArrayDeclaracoes() throws RecognitionException {
		SubArrayDeclaracoesContext _localctx = new SubArrayDeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_subArrayDeclaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			expressao();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(280);
				match(VIRGULA);
				setState(281);
				expressao();
				}
				}
				setState(286);
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
		public TerminalNode ATRIBU() { return getToken(LinguagemParser.ATRIBU, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicoes; }
	}

	public final AtribuicoesContext atribuicoes() throws RecognitionException {
		AtribuicoesContext _localctx = new AtribuicoesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_atribuicoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(ID);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COCH) {
				{
				setState(288);
				multidimensional();
				}
			}

			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOMA:
			case SUB:
				{
				{
				setState(291);
				atribuicoesIncEDec();
				}
				}
				break;
			case ATRIBU:
				{
				{
				setState(292);
				match(ATRIBU);
				setState(293);
				expressao();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	}

	public final AtribuicoesIncEDecContext atribuicoesIncEDec() throws RecognitionException {
		AtribuicoesIncEDecContext _localctx = new AtribuicoesIncEDecContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_atribuicoesIncEDec);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(SOMA);
				setState(297);
				match(SOMA);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(SUB);
				setState(299);
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
	}

	public final TipoComVoidContext tipoComVoid() throws RecognitionException {
		TipoComVoidContext _localctx = new TipoComVoidContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tipoComVoid);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(VOID);
				}
				break;
			case INT:
			case STRING:
			case CHAR:
			case BOOLEAN:
			case FLOAT:
			case DOUBLE:
			case N_BIN:
			case N_HEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
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
		public TerminalNode CHAR() { return getToken(LinguagemParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(LinguagemParser.FLOAT, 0); }
		public TerminalNode N_BIN() { return getToken(LinguagemParser.N_BIN, 0); }
		public TerminalNode N_HEX() { return getToken(LinguagemParser.N_HEX, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << FLOAT) | (1L << DOUBLE) | (1L << N_BIN) | (1L << N_HEX))) != 0)) ) {
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
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << NEGA) | (1L << BIT_NOT))) != 0)) {
				{
				setState(308);
				op_neg();
				}
			}

			{
			setState(311);
			val_final();
			}
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOMA) | (1L << SUB) | (1L << MULT) | (1L << DIV) | (1L << IGUAL) | (1L << MENOQ) | (1L << MAIOQ) | (1L << MENOIG) | (1L << MAIOIG) | (1L << DIF) | (1L << EE) | (1L << OUOU) | (1L << NEGA) | (1L << BIT_PD) | (1L << BIT_PE) | (1L << BIT_NOT))) != 0)) {
				{
				{
				{
				setState(312);
				operations();
				}
				{
				setState(313);
				val_final();
				}
				}
				}
				setState(319);
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
	}

	public final OperationsContext operations() throws RecognitionException {
		OperationsContext _localctx = new OperationsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_operations);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				op_rel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				op_neg();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				op_bitwise();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				op_arit_baixa();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(324);
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

	public static class Op_relContext extends ParserRuleContext {
		public TerminalNode MAIOQ() { return getToken(LinguagemParser.MAIOQ, 0); }
		public TerminalNode MENOQ() { return getToken(LinguagemParser.MENOQ, 0); }
		public TerminalNode MAIOIG() { return getToken(LinguagemParser.MAIOIG, 0); }
		public TerminalNode MENOIG() { return getToken(LinguagemParser.MENOIG, 0); }
		public TerminalNode IGUAL() { return getToken(LinguagemParser.IGUAL, 0); }
		public TerminalNode DIF() { return getToken(LinguagemParser.DIF, 0); }
		public Op_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_rel; }
	}

	public final Op_relContext op_rel() throws RecognitionException {
		Op_relContext _localctx = new Op_relContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_op_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MENOQ) | (1L << MAIOQ) | (1L << MENOIG) | (1L << MAIOIG) | (1L << DIF))) != 0)) ) {
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
	}

	public final Op_negContext op_neg() throws RecognitionException {
		Op_negContext _localctx = new Op_negContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_op_neg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
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
		public Op_bitwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_bitwise; }
	}

	public final Op_bitwiseContext op_bitwise() throws RecognitionException {
		Op_bitwiseContext _localctx = new Op_bitwiseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_op_bitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_la = _input.LA(1);
			if ( !(_la==BIT_PD || _la==BIT_PE) ) {
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
		public TerminalNode MULT() { return getToken(LinguagemParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(LinguagemParser.DIV, 0); }
		public Op_arit_baixaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_arit_baixa; }
	}

	public final Op_arit_baixaContext op_arit_baixa() throws RecognitionException {
		Op_arit_baixaContext _localctx = new Op_arit_baixaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_op_arit_baixa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOMA) | (1L << MULT) | (1L << DIV))) != 0)) ) {
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
	}

	public final Op_logicaContext op_logica() throws RecognitionException {
		Op_logicaContext _localctx = new Op_logicaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_op_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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
		public TerminalNode TRUE() { return getToken(LinguagemParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LinguagemParser.FALSE, 0); }
		public TerminalNode N_DOUBLE() { return getToken(LinguagemParser.N_DOUBLE, 0); }
		public TerminalNode N_FLOAT() { return getToken(LinguagemParser.N_FLOAT, 0); }
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
	}

	public final Val_finalContext val_final() throws RecognitionException {
		Val_finalContext _localctx = new Val_finalContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_val_final);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(N_INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				match(E_STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				match(TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(340);
				match(FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(341);
				match(N_DOUBLE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(342);
				match(N_FLOAT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(343);
				match(ID);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(344);
				chamadaFuncao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(345);
				match(ID);
				setState(346);
				multidimensional();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(347);
				match(PARENTESES);
				setState(348);
				expressao();
				setState(349);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u0164\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\2"+
		"\6\2T\n\2\r\2\16\2U\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4h\n\4\f\4\16\4k\13\4\3\4\3\4\3\4\3\4\5\4q\n\4\5\4s\n"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0080\n\6\3\6\3\6\7"+
		"\6\u0084\n\6\f\6\16\6\u0087\13\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u009e\n\13\f\13"+
		"\16\13\u00a1\13\13\5\13\u00a3\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ac"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b5\n\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00c7\n\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u00e6\n\24\7\24\u00e8\n\24\f\24\16\24\u00eb\13\24\3\25\3\25"+
		"\3\25\3\25\5\25\u00f1\n\25\5\25\u00f3\n\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u00fc\n\26\5\26\u00fe\n\26\3\27\3\27\3\27\6\27\u0103\n\27"+
		"\r\27\16\27\u0104\3\30\3\30\3\30\5\30\u010a\n\30\3\30\3\30\3\30\3\30\3"+
		"\30\5\30\u0111\n\30\3\30\3\30\7\30\u0115\n\30\f\30\16\30\u0118\13\30\3"+
		"\31\3\31\3\31\7\31\u011d\n\31\f\31\16\31\u0120\13\31\3\32\3\32\5\32\u0124"+
		"\n\32\3\32\3\32\3\32\5\32\u0129\n\32\3\33\3\33\3\33\3\33\5\33\u012f\n"+
		"\33\3\34\3\34\5\34\u0133\n\34\3\35\3\35\3\36\5\36\u0138\n\36\3\36\3\36"+
		"\3\36\3\36\7\36\u013e\n\36\f\36\16\36\u0141\13\36\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0148\n\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0162\n%\3%\2\2&\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\b\5\2\7\f\63\63\65\65"+
		"\3\2 %\5\2\33\33((//\3\2+,\4\2\32\32\34\35\3\2&(\2\u0173\2J\3\2\2\2\4"+
		"Z\3\2\2\2\6r\3\2\2\2\bt\3\2\2\2\n\u0085\3\2\2\2\f\u0088\3\2\2\2\16\u008d"+
		"\3\2\2\2\20\u0092\3\2\2\2\22\u0095\3\2\2\2\24\u00a2\3\2\2\2\26\u00ab\3"+
		"\2\2\2\30\u00ad\3\2\2\2\32\u00b6\3\2\2\2\34\u00b9\3\2\2\2\36\u00bc\3\2"+
		"\2\2 \u00c2\3\2\2\2\"\u00cf\3\2\2\2$\u00d7\3\2\2\2&\u00e9\3\2\2\2(\u00f2"+
		"\3\2\2\2*\u00f4\3\2\2\2,\u0102\3\2\2\2.\u0106\3\2\2\2\60\u0119\3\2\2\2"+
		"\62\u0121\3\2\2\2\64\u012e\3\2\2\2\66\u0132\3\2\2\28\u0134\3\2\2\2:\u0137"+
		"\3\2\2\2<\u0147\3\2\2\2>\u0149\3\2\2\2@\u014b\3\2\2\2B\u014d\3\2\2\2D"+
		"\u014f\3\2\2\2F\u0151\3\2\2\2H\u0161\3\2\2\2JK\7\3\2\2KO\7@\2\2LN\5*\26"+
		"\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PS\3\2\2\2QO\3\2\2\2RT\5\4\3"+
		"\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7A\2\2XY\7\4\2"+
		"\2Y\3\3\2\2\2Z[\5\66\34\2[\\\7D\2\2\\]\7>\2\2]^\5\6\4\2^_\7?\2\2_`\5\b"+
		"\5\2`\5\3\2\2\2ab\58\35\2bi\7D\2\2cd\7<\2\2de\58\35\2ef\7D\2\2fh\3\2\2"+
		"\2gc\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jq\3\2\2\2ki\3\2\2\2lm\58\35"+
		"\2mn\7D\2\2no\5,\27\2oq\3\2\2\2pa\3\2\2\2pl\3\2\2\2qs\3\2\2\2rp\3\2\2"+
		"\2rs\3\2\2\2s\7\3\2\2\2tu\7@\2\2uv\5\n\6\2vw\7A\2\2w\t\3\2\2\2x\u0084"+
		"\5\26\f\2y\u0080\5\20\t\2z\u0080\5*\26\2{\u0080\5\62\32\2|\u0080\5\22"+
		"\n\2}\u0080\5\f\7\2~\u0080\5\16\b\2\177y\3\2\2\2\177z\3\2\2\2\177{\3\2"+
		"\2\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\7:\2\2\u0082\u0084\3\2\2\2\u0083x\3\2\2\2\u0083\177\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\13\3\2\2"+
		"\2\u0087\u0085\3\2\2\2\u0088\u0089\7F\2\2\u0089\u008a\7>\2\2\u008a\u008b"+
		"\5:\36\2\u008b\u008c\7?\2\2\u008c\r\3\2\2\2\u008d\u008e\7G\2\2\u008e\u008f"+
		"\7>\2\2\u008f\u0090\5\n\6\2\u0090\u0091\7?\2\2\u0091\17\3\2\2\2\u0092"+
		"\u0093\7E\2\2\u0093\u0094\5:\36\2\u0094\21\3\2\2\2\u0095\u0096\7D\2\2"+
		"\u0096\u0097\7>\2\2\u0097\u0098\5\24\13\2\u0098\u0099\7?\2\2\u0099\23"+
		"\3\2\2\2\u009a\u009f\5:\36\2\u009b\u009c\7<\2\2\u009c\u009e\5:\36\2\u009d"+
		"\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u009a\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\25\3\2\2\2\u00a4\u00ac\5\30\r\2\u00a5\u00ac\5\36"+
		"\20\2\u00a6\u00ac\5 \21\2\u00a7\u00a8\5\"\22\2\u00a8\u00a9\7:\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00ac\5$\23\2\u00ab\u00a4\3\2\2\2\u00ab\u00a5\3\2"+
		"\2\2\u00ab\u00a6\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\27\3\2\2\2\u00ad\u00ae\7\16\2\2\u00ae\u00af\7>\2\2\u00af\u00b0\5:\36"+
		"\2\u00b0\u00b1\7?\2\2\u00b1\u00b4\5\b\5\2\u00b2\u00b5\5\32\16\2\u00b3"+
		"\u00b5\5\34\17\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3"+
		"\2\2\2\u00b5\31\3\2\2\2\u00b6\u00b7\7\20\2\2\u00b7\u00b8\5\b\5\2\u00b8"+
		"\33\3\2\2\2\u00b9\u00ba\7\20\2\2\u00ba\u00bb\5\30\r\2\u00bb\35\3\2\2\2"+
		"\u00bc\u00bd\7\30\2\2\u00bd\u00be\7>\2\2\u00be\u00bf\5:\36\2\u00bf\u00c0"+
		"\7?\2\2\u00c0\u00c1\5\b\5\2\u00c1\37\3\2\2\2\u00c2\u00c3\7\27\2\2\u00c3"+
		"\u00c6\7>\2\2\u00c4\u00c7\5*\26\2\u00c5\u00c7\5\62\32\2\u00c6\u00c4\3"+
		"\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7:\2\2\u00c9"+
		"\u00ca\5:\36\2\u00ca\u00cb\7:\2\2\u00cb\u00cc\5\62\32\2\u00cc\u00cd\7"+
		"?\2\2\u00cd\u00ce\5\b\5\2\u00ce!\3\2\2\2\u00cf\u00d0\7\31\2\2\u00d0\u00d1"+
		"\5\b\5\2\u00d1\u00d2\7\30\2\2\u00d2\u00d3\7>\2\2\u00d3\u00d4\5:\36\2\u00d4"+
		"\u00d5\7?\2\2\u00d5\u00d6\7:\2\2\u00d6#\3\2\2\2\u00d7\u00d8\7\24\2\2\u00d8"+
		"\u00d9\7>\2\2\u00d9\u00da\5:\36\2\u00da\u00db\7?\2\2\u00db\u00dc\7@\2"+
		"\2\u00dc\u00dd\5&\24\2\u00dd\u00de\5(\25\2\u00de\u00df\7A\2\2\u00df%\3"+
		"\2\2\2\u00e0\u00e1\7\25\2\2\u00e1\u00e2\5:\36\2\u00e2\u00e3\7;\2\2\u00e3"+
		"\u00e5\5\n\6\2\u00e4\u00e6\7\5\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e0\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\'\3\2\2\2\u00eb\u00e9\3\2\2\2"+
		"\u00ec\u00ed\7\26\2\2\u00ed\u00ee\7;\2\2\u00ee\u00f0\5\n\6\2\u00ef\u00f1"+
		"\7\5\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00ec\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3)\3\2\2\2\u00f4\u00f5\58\35\2"+
		"\u00f5\u00fd\7D\2\2\u00f6\u00f7\7\37\2\2\u00f7\u00fe\5:\36\2\u00f8\u00fb"+
		"\5,\27\2\u00f9\u00fa\7\37\2\2\u00fa\u00fc\5.\30\2\u00fb\u00f9\3\2\2\2"+
		"\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00f6\3\2\2\2\u00fd\u00f8"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe+\3\2\2\2\u00ff\u0100\7B\2\2\u0100\u0101"+
		"\7\64\2\2\u0101\u0103\7C\2\2\u0102\u00ff\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105-\3\2\2\2\u0106\u0109\7@\2\2\u0107"+
		"\u010a\5\60\31\2\u0108\u010a\5.\30\2\u0109\u0107\3\2\2\2\u0109\u0108\3"+
		"\2\2\2\u010a\u010b\3\2\2\2\u010b\u0116\7A\2\2\u010c\u010d\7<\2\2\u010d"+
		"\u0110\7@\2\2\u010e\u0111\5\60\31\2\u010f\u0111\5.\30\2\u0110\u010e\3"+
		"\2\2\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7A\2\2\u0113"+
		"\u0115\3\2\2\2\u0114\u010c\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117/\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011e"+
		"\5:\36\2\u011a\u011b\7<\2\2\u011b\u011d\5:\36\2\u011c\u011a\3\2\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\61\3\2\2"+
		"\2\u0120\u011e\3\2\2\2\u0121\u0123\7D\2\2\u0122\u0124\5,\27\2\u0123\u0122"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0128\3\2\2\2\u0125\u0129\5\64\33\2"+
		"\u0126\u0127\7\37\2\2\u0127\u0129\5:\36\2\u0128\u0125\3\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0129\63\3\2\2\2\u012a\u012b\7\32\2\2\u012b\u012f\7\32\2\2\u012c"+
		"\u012d\7\33\2\2\u012d\u012f\7\33\2\2\u012e\u012a\3\2\2\2\u012e\u012c\3"+
		"\2\2\2\u012f\65\3\2\2\2\u0130\u0133\7\r\2\2\u0131\u0133\58\35\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133\67\3\2\2\2\u0134\u0135\t\2\2"+
		"\2\u01359\3\2\2\2\u0136\u0138\5@!\2\u0137\u0136\3\2\2\2\u0137\u0138\3"+
		"\2\2\2\u0138\u0139\3\2\2\2\u0139\u013f\5H%\2\u013a\u013b\5<\37\2\u013b"+
		"\u013c\5H%\2\u013c\u013e\3\2\2\2\u013d\u013a\3\2\2\2\u013e\u0141\3\2\2"+
		"\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140;\3\2\2\2\u0141\u013f"+
		"\3\2\2\2\u0142\u0148\5> \2\u0143\u0148\5@!\2\u0144\u0148\5B\"\2\u0145"+
		"\u0148\5D#\2\u0146\u0148\5F$\2\u0147\u0142\3\2\2\2\u0147\u0143\3\2\2\2"+
		"\u0147\u0144\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148=\3"+
		"\2\2\2\u0149\u014a\t\3\2\2\u014a?\3\2\2\2\u014b\u014c\t\4\2\2\u014cA\3"+
		"\2\2\2\u014d\u014e\t\5\2\2\u014eC\3\2\2\2\u014f\u0150\t\6\2\2\u0150E\3"+
		"\2\2\2\u0151\u0152\t\7\2\2\u0152G\3\2\2\2\u0153\u0162\7\64\2\2\u0154\u0162"+
		"\7\66\2\2\u0155\u0162\7)\2\2\u0156\u0162\7*\2\2\u0157\u0162\7\61\2\2\u0158"+
		"\u0162\7\62\2\2\u0159\u0162\7D\2\2\u015a\u0162\5\22\n\2\u015b\u015c\7"+
		"D\2\2\u015c\u0162\5,\27\2\u015d\u015e\7>\2\2\u015e\u015f\5:\36\2\u015f"+
		"\u0160\7?\2\2\u0160\u0162\3\2\2\2\u0161\u0153\3\2\2\2\u0161\u0154\3\2"+
		"\2\2\u0161\u0155\3\2\2\2\u0161\u0156\3\2\2\2\u0161\u0157\3\2\2\2\u0161"+
		"\u0158\3\2\2\2\u0161\u0159\3\2\2\2\u0161\u015a\3\2\2\2\u0161\u015b\3\2"+
		"\2\2\u0161\u015d\3\2\2\2\u0162I\3\2\2\2\"OUipr\177\u0083\u0085\u009f\u00a2"+
		"\u00ab\u00b4\u00c6\u00e5\u00e9\u00f0\u00f2\u00fb\u00fd\u0104\u0109\u0110"+
		"\u0116\u011e\u0123\u0128\u012e\u0132\u0137\u013f\u0147\u0161";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}