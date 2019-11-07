// Generated from .\Linguagem.g4 by ANTLR 4.7.2
package executargramatica.lingaguemmodel;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LinguagemParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LinguagemVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LinguagemParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#funcaoInicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoInicio(LinguagemParser.FuncaoInicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncao(LinguagemParser.FuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(LinguagemParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(LinguagemParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(LinguagemParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(LinguagemParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(LinguagemParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#entradaesaida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntradaesaida(LinguagemParser.EntradaesaidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(LinguagemParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadaFuncao(LinguagemParser.ChamadaFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#parametrosChamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrosChamada(LinguagemParser.ParametrosChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#condicionais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionais(LinguagemParser.CondicionaisContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#ifdes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfdes(LinguagemParser.IfdesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#ifdeselse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfdeselse(LinguagemParser.IfdeselseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#ifdeselseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfdeselseif(LinguagemParser.IfdeselseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#whiledes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhiledes(LinguagemParser.WhiledesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#fordes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFordes(LinguagemParser.FordesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#dodes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDodes(LinguagemParser.DodesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#switchdes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchdes(LinguagemParser.SwitchdesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#switchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCase(LinguagemParser.SwitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#defaultdes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultdes(LinguagemParser.DefaultdesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(LinguagemParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(LinguagemParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#multidimensional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultidimensional(LinguagemParser.MultidimensionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#declaracoesArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoesArray(LinguagemParser.DeclaracoesArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#subArrayDeclaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubArrayDeclaracoes(LinguagemParser.SubArrayDeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#atribuicoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicoes(LinguagemParser.AtribuicoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#atribuicoesIncEDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicoesIncEDec(LinguagemParser.AtribuicoesIncEDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#tipoComVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoComVoid(LinguagemParser.TipoComVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(LinguagemParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(LinguagemParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperations(LinguagemParser.OperationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#op_atr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_atr(LinguagemParser.Op_atrContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#op_rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_rel(LinguagemParser.Op_relContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#op_neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_neg(LinguagemParser.Op_negContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#op_bitwise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_bitwise(LinguagemParser.Op_bitwiseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#op_arit_baixa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_arit_baixa(LinguagemParser.Op_arit_baixaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#op_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logica(LinguagemParser.Op_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#val_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal_final(LinguagemParser.Val_finalContext ctx);
}