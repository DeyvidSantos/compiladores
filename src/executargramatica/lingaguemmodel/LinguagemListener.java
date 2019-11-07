// Generated from .\Linguagem.g4 by ANTLR 4.7.2
package executargramatica.lingaguemmodel;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LinguagemParser}.
 */
public interface LinguagemListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LinguagemParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LinguagemParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#funcaoInicio}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoInicio(LinguagemParser.FuncaoInicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#funcaoInicio}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoInicio(LinguagemParser.FuncaoInicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(LinguagemParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(LinguagemParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(LinguagemParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(LinguagemParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(LinguagemParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(LinguagemParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(LinguagemParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(LinguagemParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(LinguagemParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(LinguagemParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(LinguagemParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(LinguagemParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#entradaesaida}.
	 * @param ctx the parse tree
	 */
	void enterEntradaesaida(LinguagemParser.EntradaesaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#entradaesaida}.
	 * @param ctx the parse tree
	 */
	void exitEntradaesaida(LinguagemParser.EntradaesaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(LinguagemParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(LinguagemParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void enterChamadaFuncao(LinguagemParser.ChamadaFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void exitChamadaFuncao(LinguagemParser.ChamadaFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#parametrosChamada}.
	 * @param ctx the parse tree
	 */
	void enterParametrosChamada(LinguagemParser.ParametrosChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#parametrosChamada}.
	 * @param ctx the parse tree
	 */
	void exitParametrosChamada(LinguagemParser.ParametrosChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#condicionais}.
	 * @param ctx the parse tree
	 */
	void enterCondicionais(LinguagemParser.CondicionaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#condicionais}.
	 * @param ctx the parse tree
	 */
	void exitCondicionais(LinguagemParser.CondicionaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#ifdes}.
	 * @param ctx the parse tree
	 */
	void enterIfdes(LinguagemParser.IfdesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#ifdes}.
	 * @param ctx the parse tree
	 */
	void exitIfdes(LinguagemParser.IfdesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#ifdeselse}.
	 * @param ctx the parse tree
	 */
	void enterIfdeselse(LinguagemParser.IfdeselseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#ifdeselse}.
	 * @param ctx the parse tree
	 */
	void exitIfdeselse(LinguagemParser.IfdeselseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#ifdeselseif}.
	 * @param ctx the parse tree
	 */
	void enterIfdeselseif(LinguagemParser.IfdeselseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#ifdeselseif}.
	 * @param ctx the parse tree
	 */
	void exitIfdeselseif(LinguagemParser.IfdeselseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#whiledes}.
	 * @param ctx the parse tree
	 */
	void enterWhiledes(LinguagemParser.WhiledesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#whiledes}.
	 * @param ctx the parse tree
	 */
	void exitWhiledes(LinguagemParser.WhiledesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#fordes}.
	 * @param ctx the parse tree
	 */
	void enterFordes(LinguagemParser.FordesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#fordes}.
	 * @param ctx the parse tree
	 */
	void exitFordes(LinguagemParser.FordesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#dodes}.
	 * @param ctx the parse tree
	 */
	void enterDodes(LinguagemParser.DodesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#dodes}.
	 * @param ctx the parse tree
	 */
	void exitDodes(LinguagemParser.DodesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#switchdes}.
	 * @param ctx the parse tree
	 */
	void enterSwitchdes(LinguagemParser.SwitchdesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#switchdes}.
	 * @param ctx the parse tree
	 */
	void exitSwitchdes(LinguagemParser.SwitchdesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(LinguagemParser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(LinguagemParser.SwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#defaultdes}.
	 * @param ctx the parse tree
	 */
	void enterDefaultdes(LinguagemParser.DefaultdesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#defaultdes}.
	 * @param ctx the parse tree
	 */
	void exitDefaultdes(LinguagemParser.DefaultdesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(LinguagemParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(LinguagemParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(LinguagemParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(LinguagemParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#multidimensional}.
	 * @param ctx the parse tree
	 */
	void enterMultidimensional(LinguagemParser.MultidimensionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#multidimensional}.
	 * @param ctx the parse tree
	 */
	void exitMultidimensional(LinguagemParser.MultidimensionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#declaracoesArray}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoesArray(LinguagemParser.DeclaracoesArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#declaracoesArray}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoesArray(LinguagemParser.DeclaracoesArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#subArrayDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void enterSubArrayDeclaracoes(LinguagemParser.SubArrayDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#subArrayDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void exitSubArrayDeclaracoes(LinguagemParser.SubArrayDeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#atribuicoes}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicoes(LinguagemParser.AtribuicoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#atribuicoes}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicoes(LinguagemParser.AtribuicoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#atribuicoesIncEDec}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicoesIncEDec(LinguagemParser.AtribuicoesIncEDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#atribuicoesIncEDec}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicoesIncEDec(LinguagemParser.AtribuicoesIncEDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#tipoComVoid}.
	 * @param ctx the parse tree
	 */
	void enterTipoComVoid(LinguagemParser.TipoComVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#tipoComVoid}.
	 * @param ctx the parse tree
	 */
	void exitTipoComVoid(LinguagemParser.TipoComVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(LinguagemParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(LinguagemParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(LinguagemParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(LinguagemParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterOperations(LinguagemParser.OperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitOperations(LinguagemParser.OperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#op_atr}.
	 * @param ctx the parse tree
	 */
	void enterOp_atr(LinguagemParser.Op_atrContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#op_atr}.
	 * @param ctx the parse tree
	 */
	void exitOp_atr(LinguagemParser.Op_atrContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#op_rel}.
	 * @param ctx the parse tree
	 */
	void enterOp_rel(LinguagemParser.Op_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#op_rel}.
	 * @param ctx the parse tree
	 */
	void exitOp_rel(LinguagemParser.Op_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#op_neg}.
	 * @param ctx the parse tree
	 */
	void enterOp_neg(LinguagemParser.Op_negContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#op_neg}.
	 * @param ctx the parse tree
	 */
	void exitOp_neg(LinguagemParser.Op_negContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#op_bitwise}.
	 * @param ctx the parse tree
	 */
	void enterOp_bitwise(LinguagemParser.Op_bitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#op_bitwise}.
	 * @param ctx the parse tree
	 */
	void exitOp_bitwise(LinguagemParser.Op_bitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#op_arit_baixa}.
	 * @param ctx the parse tree
	 */
	void enterOp_arit_baixa(LinguagemParser.Op_arit_baixaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#op_arit_baixa}.
	 * @param ctx the parse tree
	 */
	void exitOp_arit_baixa(LinguagemParser.Op_arit_baixaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#op_logica}.
	 * @param ctx the parse tree
	 */
	void enterOp_logica(LinguagemParser.Op_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#op_logica}.
	 * @param ctx the parse tree
	 */
	void exitOp_logica(LinguagemParser.Op_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#val_final}.
	 * @param ctx the parse tree
	 */
	void enterVal_final(LinguagemParser.Val_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#val_final}.
	 * @param ctx the parse tree
	 */
	void exitVal_final(LinguagemParser.Val_finalContext ctx);
}