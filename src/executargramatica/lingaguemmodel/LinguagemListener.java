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
	 * Enter a parse tree produced by {@link LinguagemParser#funcoes}.
	 * @param ctx the parse tree
	 */
	void enterFuncoes(LinguagemParser.FuncoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#funcoes}.
	 * @param ctx the parse tree
	 */
	void exitFuncoes(LinguagemParser.FuncoesContext ctx);
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
	 * Enter a parse tree produced by {@link LinguagemParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void enterImprimir(LinguagemParser.ImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void exitImprimir(LinguagemParser.ImprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#ler}.
	 * @param ctx the parse tree
	 */
	void enterLer(LinguagemParser.LerContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#ler}.
	 * @param ctx the parse tree
	 */
	void exitLer(LinguagemParser.LerContext ctx);
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
	 * Enter a parse tree produced by {@link LinguagemParser#iffi}.
	 * @param ctx the parse tree
	 */
	void enterIffi(LinguagemParser.IffiContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#iffi}.
	 * @param ctx the parse tree
	 */
	void exitIffi(LinguagemParser.IffiContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#elsese}.
	 * @param ctx the parse tree
	 */
	void enterElsese(LinguagemParser.ElseseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#elsese}.
	 * @param ctx the parse tree
	 */
	void exitElsese(LinguagemParser.ElseseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#elseiffi}.
	 * @param ctx the parse tree
	 */
	void enterElseiffi(LinguagemParser.ElseiffiContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#elseiffi}.
	 * @param ctx the parse tree
	 */
	void exitElseiffi(LinguagemParser.ElseiffiContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#whiles}.
	 * @param ctx the parse tree
	 */
	void enterWhiles(LinguagemParser.WhilesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#whiles}.
	 * @param ctx the parse tree
	 */
	void exitWhiles(LinguagemParser.WhilesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#fors}.
	 * @param ctx the parse tree
	 */
	void enterFors(LinguagemParser.ForsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#fors}.
	 * @param ctx the parse tree
	 */
	void exitFors(LinguagemParser.ForsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#dos}.
	 * @param ctx the parse tree
	 */
	void enterDos(LinguagemParser.DosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#dos}.
	 * @param ctx the parse tree
	 */
	void exitDos(LinguagemParser.DosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#switchs}.
	 * @param ctx the parse tree
	 */
	void enterSwitchs(LinguagemParser.SwitchsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#switchs}.
	 * @param ctx the parse tree
	 */
	void exitSwitchs(LinguagemParser.SwitchsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#cases}.
	 * @param ctx the parse tree
	 */
	void enterCases(LinguagemParser.CasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#cases}.
	 * @param ctx the parse tree
	 */
	void exitCases(LinguagemParser.CasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#defaults}.
	 * @param ctx the parse tree
	 */
	void enterDefaults(LinguagemParser.DefaultsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#defaults}.
	 * @param ctx the parse tree
	 */
	void exitDefaults(LinguagemParser.DefaultsContext ctx);
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