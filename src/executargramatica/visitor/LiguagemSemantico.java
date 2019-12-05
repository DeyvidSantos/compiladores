/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executargramatica.visitor;

import executargramatica.lingaguemmodel.LinguagemParser;
import executargramatica.models.Escopo;

import executargramatica.models.Identificador;
import executargramatica.models.Identificador.Tipo;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author Deyvid Santos
 */
public class LiguagemSemantico extends VisitorLingaguem {

    List<String> warnings = new ArrayList<>();
    List<ParseCancellationException> semanticErrors = new ArrayList<ParseCancellationException>();
    Stack<Identificador.Tipo> pilhaTipoExpressao = new Stack<>();
    Stack<Operation> pilhaOperacao = new Stack<>();
    boolean temRetorno = false;
    Tipo tipoFuncao = null;
    int contEscopo = 1;
    
    
    public List<String> getWarnings() {
        return warnings;
    }

    public LiguagemSemantico(List<Identificador> tabelaSimbolos) {
        super(tabelaSimbolos);
    }

    public List<Identificador> getTabelaSimbolos() {
        return tabelaSimbolos;
    }

    @Override
    public Object visitProg(LinguagemParser.ProgContext ctx) {
        escopoAtual = new Escopo("programa");
        markAllFunctions(ctx);
        visitChildren(ctx);
        return tabelaSimbolos; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAtribuicoes(LinguagemParser.AtribuicoesContext ctx) {
        Identificador id = Identificador.getId(ctx.ID().getSymbol().getText(), tabelaSimbolos, escopoAtual);
        if (id == null) {
            throw new ParseCancellationException("Váriavel " + ctx.ID() + " não existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
        }
        if (ctx.atribuicoesIncEDec() != null && !id.isInicializada()) {
            throw new ParseCancellationException("Váriavel " + ctx.ID() + " não inicializada Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
        }

        boolean usada = id.isUsada();
        visitExpressao(ctx.expressao());
        id.setUsada(usada);

        id.setInicializada(true);

        return super.visitAtribuicoes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAtribuicoesIncEDec(LinguagemParser.AtribuicoesIncEDecContext ctx) {
        return super.visitAtribuicoesIncEDec(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitBloco(LinguagemParser.BlocoContext ctx) {
        return super.visitBloco(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitChamadaFuncao(LinguagemParser.ChamadaFuncaoContext ctx) {
        Identificador id = Identificador.getUNSAFEId(ctx.ID().getText(), tabelaSimbolos);

        //Vê se a função existe
        if (id == null) {
            throw new ParseCancellationException("Chamada de função inexistente na " + ctx.start.getLine() + " coluna " + ctx.start.getCharPositionInLine() + ".");
        }

        //Captura os parametros da função e numeros
        Escopo escopoFuncao = getEscopoDaFuncao(id.getNome());
        int qtdParametrosNaFuncao;
        if (escopoFuncao != null) {
            List<Identificador> idListParametros = Identificador.getParametrosFuncao(escopoFuncao, tabelaSimbolos);
            qtdParametrosNaFuncao = idListParametros.size();
        } else {
            qtdParametrosNaFuncao = 0;
        }
        int qtdParametrosChamada = ctx.parametrosChamada().expressao().size();

        //Valida se os numeros de parametros bate
        if (qtdParametrosChamada != qtdParametrosNaFuncao) {
            throw new ParseCancellationException("Chamada de função na linha " + ctx.start.getLine() + " coluna " + ctx.start.getCharPositionInLine() + " com numero incorreto de parametros. Esperado: " + qtdParametrosNaFuncao + " Encontrado: " + qtdParametrosChamada);
        }
        visitChildren(ctx);
        return null;
    }


    
    @Override
    public Object visitComandos(LinguagemParser.ComandosContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitComando(LinguagemParser.ComandoContext ctx) {
        visitChildren(ctx);
        return null;
    }

    
    @Override
    public Object visitCondicionais(LinguagemParser.CondicionaisContext ctx) {
        return super.visitCondicionais(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDeclaracoes(LinguagemParser.DeclaracoesContext ctx) {
        visitTipo(ctx.tipo());
        List<LinguagemParser.DeclaracaoContext> declaracao = ctx.declaracao();
        for (LinguagemParser.DeclaracaoContext declaracaoContext : declaracao) {

            if (declaracaoContext.multidimensional() != null) {
                visitMultidimensional(declaracaoContext.multidimensional());
            } else {
                multidimensional = 0;
                qtdMultidimensional = 1;
            }
            boolean inicializada;
            if (declaracaoContext.ATRIBU() == null) {
                inicializada = false;
            } else {
                inicializada = true;
            }
            if (Escopo.verificaSeExisteNoEscopo(declaracaoContext.ID().getSymbol().getText(), tabelaSimbolos, escopoAtual)) {
                throw new ParseCancellationException("Declaração de Váriavel " + declaracaoContext.ID() + " já existe neste escopo Linha: " + declaracaoContext.start.getLine() + " Coluna: " + declaracaoContext.start.getCharPositionInLine());
            }
            Identificador id = new Identificador(
                    declaracaoContext.ID().getSymbol().getText(),
                    tipoAtual,
                    inicializada,
                    false,
                    escopoAtual,
                    false,
                    false,
                    0,
                    multidimensional,
                    qtdMultidimensional,
                    false);
            tabelaSimbolos.add(id);
            visitChildren(declaracaoContext);
        }

        return null;
    }

    @Override
    public Object visitDeclaracoesArray(LinguagemParser.DeclaracoesArrayContext ctx) {
        return super.visitDeclaracoesArray(ctx); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public Object visitExpressao(LinguagemParser.ExpressaoContext ctx) {

        if (ctx == null) {
            return null;
        }
        for (int i = 0; i < ctx.val_final().size(); i++) {
            if (ctx.val_final(i).ID() != null) {
                TerminalNode tn = ctx.val_final(i).ID();
                Identificador id = Identificador.getId(tn.getSymbol().getText(), tabelaSimbolos, escopoAtual);
                if (ctx.val_final(i).multidimensional() != null) {
                    visitMultidimensional(ctx.val_final(i).multidimensional());
                } else {
                    multidimensional = 0;
                }
                if (id == null) {
                    throw new ParseCancellationException("Váriavel " + ctx.val_final(i).ID() + " não existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
                } else if (!id.isInicializada()) {
                    this.warnings.add("Váriavel " + ctx.val_final(i).ID() + " não inicializada Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
                } else if (id.getDimensoes() != multidimensional) {
                    throw new ParseCancellationException("Dimensões incorreta do vetor " + ctx.val_final(i).ID() + " . Ele possui " + id.getDimensoes() + " dimensões e foi usada " + multidimensional + " Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
                } else {
                    id.setUsada(true);
                    return null;
                }
            }
        }
        return super.visitExpressao(ctx); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public Object visitFuncao(LinguagemParser.FuncaoContext ctx) {
        if (ctx.ID() == null) {
            return null;
        }

        //criaEVaiEscopoNovo(ctx.ID().getText());
        escopoAtual = getEscopoDaFuncao(ctx.ID().getText());
        visitBloco(ctx.bloco());
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitMultidimensional(LinguagemParser.MultidimensionalContext ctx) {
        multidimensional = ctx.COCH().size();
        qtdMultidimensional = 1;
        return null; //To change body of generated methods, choose Tools | Templates.
    }

     public Object visitMultidimensional(LinguagemParser.MultidimensionalContext ctx, Tipo tipo) {
        multidimensional = ctx.COCH().size();
        qtdMultidimensional = 1;
        for (int i = 0; i < multidimensional; i++) {
            String item = ctx.expressao(i).getText();
//            qtdMultidimensional *= Integer.parseInt(item);
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public Object visitOp_arit_baixa(LinguagemParser.Op_arit_baixaContext ctx) {
        return super.visitOp_arit_baixa(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOp_bitwise(LinguagemParser.Op_bitwiseContext ctx) {
        return super.visitOp_bitwise(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOp_logica(LinguagemParser.Op_logicaContext ctx) {
        return super.visitOp_logica(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitVal_final(LinguagemParser.Val_finalContext ctx) {
        return super.visitVal_final(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOp_neg(LinguagemParser.Op_negContext ctx) {
        return super.visitOp_neg(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOp_rel(LinguagemParser.Op_relContext ctx) {
        return super.visitOp_rel(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOperations(LinguagemParser.OperationsContext ctx) {
        return super.visitOperations(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTipo(LinguagemParser.TipoContext ctx) {
        if (ctx.N_BIN() != null) {
            tipoAtual = Tipo.BINARIO;
        } else if (ctx.BOOLEAN() != null) {
            tipoAtual = Tipo.LOGICO;
        } else if (ctx.DOUBLE() != null) {
            tipoAtual = Tipo.REAL;
        } else if (ctx.N_HEX() != null) {
            tipoAtual = Tipo.HEXADECIMAL;
        } else if (ctx.INT() != null) {
            tipoAtual = Tipo.INTEIRO;
        } else if (ctx.STRING() != null) {
            tipoAtual = Tipo.STRING;
        }
        return null;
    }

    @Override
    public Object visitTipoComVoid(LinguagemParser.TipoComVoidContext ctx) {
        if (ctx.VOID() != null) {
            tipoAtual = Identificador.Tipo.VOID;
        } else {
            visitTipo(ctx.tipo());
        }
        return null;
    }

    @Override
    public Object visitSubArrayDeclaracoes(LinguagemParser.SubArrayDeclaracoesContext ctx) {
        return super.visitSubArrayDeclaracoes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

  
    @Override
    public Object visitParametrosChamada(LinguagemParser.ParametrosChamadaContext ctx) {
        return super.visitParametrosChamada(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    public Tipo visitExpressaoLoop(LinguagemParser.ExpressaoContext ctx){
        if (ctx == null) {
            return null;
        }
        Stack<Identificador.Tipo> pilhaTipoExpressaoLoop = new Stack<>();
        Stack<Operation> pilhaOperacaoLoop = new Stack<>();
        
        
        for (LinguagemParser.OperationsContext opCont : ctx.operations()) {
            pilhaOperacaoLoop.push(verificarTipoOperacao(opCont));
        }
        for (int i = 0; i < ctx.val_final().size(); i++) {
            String valFinal = ctx.val_final(i).getText();            
            Tipo tipoExpParenteses = null;
            if(ctx.val_final(i).multidimensional() != null){
                valFinal =  ctx.val_final(i).ID().getText();
            }
            if(ctx.val_final(i).chamadaFuncao() != null){
                valFinal = ctx.val_final(i).chamadaFuncao().ID().getText();
            }
            if(ctx.val_final(i).PARENTESES()!= null){
                pilhaTipoExpressaoLoop.push(visitExpressaoLoop(ctx.val_final(i).expressao()));
                
                continue;
            }
            if (Identificador.getId(valFinal, tabelaSimbolos, escopoAtual) != null) {
                Identificador id = Identificador.getId(valFinal, tabelaSimbolos, escopoAtual);
                if (ctx.val_final(i).multidimensional() != null) {
                    Tipo posicaoVetor = visitExpressaoLoop(ctx.val_final(i).multidimensional().expressao(0));
                    if(posicaoVetor != Tipo.INTEIRO){
                        this.semanticErrors.add(new ParseCancellationException("Tentando acessar posição de vetor com tipo não inteiro na Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
                    }
                    
                    visitMultidimensional(ctx.val_final(i).multidimensional(), posicaoVetor);
                } else {
                    multidimensional = 0;
                }
                if (!id.isInicializada()) {
                    this.semanticErrors.add(new ParseCancellationException("Váriavel " + id.getNome() + " não inicializada Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
                   }
                if (id.getDimensoes() != multidimensional) {
                    this.semanticErrors.add(new ParseCancellationException("Dimensões incorreta do vetor " + id.getNome() + " . Ele possui " + id.getDimensoes() + " dimensões e foi usada " + multidimensional + " Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
                }
                id.setUsada(true);
                
                pilhaTipoExpressaoLoop.push(id.getTipo());
                
            }else if(verificarTipoConstante(ctx.val_final(i)) == null && tipoExpParenteses == null){
                this.semanticErrors.add(new ParseCancellationException("Váriavel " + valFinal + " não existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
            }else{
                if(tipoExpParenteses != null){
                    pilhaTipoExpressaoLoop.push(tipoExpParenteses);
                }
                pilhaTipoExpressaoLoop.push(verificarTipoConstante(ctx.val_final(i)));
            }
        }
        verificarCompatibilidadeOperacao(ctx, pilhaTipoExpressaoLoop, pilhaOperacaoLoop);
        if(pilhaTipoExpressaoLoop.empty())
        {
            return null;
        }
        return pilhaTipoExpressaoLoop.peek();
    }
    
     public void verificarCompatibilidadeOperacao(LinguagemParser.ExpressaoContext ctx, Stack<Tipo> pilhaTipoExpressao, Stack<Operation> pilhaOperacao){
        if(pilhaOperacao.empty() || pilhaTipoExpressao.size() != pilhaOperacao.size() + 1){
            
            return;
        }
        int resultExp;
        Tipo tipo1, tipo2;
        Operation op;
        while(!pilhaOperacao.empty()) {
            tipo1 = pilhaTipoExpressao.pop();
            tipo2 = pilhaTipoExpressao.pop();
            
            op = pilhaOperacao.pop();
            int resulExp = SemanticTable.resultType(tipo1, tipo2, op);
            if(resulExp == SemanticTable.ERR){
                this.semanticErrors.add(new ParseCancellationException("Tentando realizar uma " + op.name() + " entre " + tipo1.name() + " e " + tipo2.name() + " na linha " + ctx.start.getLine()));
                return;
            }
            pilhaTipoExpressao.push(SemanticTable.getCodeType(resulExp));
        }
    }
    
    
      public Tipo verificarTipoConstante(LinguagemParser.Val_finalContext val){
        if (val.N_BIN()!= null) {
            return Tipo.BINARIO;
        } else if (val.CONSTLOGICO() != null) {
            return Tipo.LOGICO;
        } else if (val.N_DOUBLE()!= null) {
            return Tipo.REAL;
        } else if (val.N_HEX()!= null) {
            return Tipo.HEXADECIMAL;
        } else if (val.N_INT()!= null) {
            return Tipo.INTEIRO;
        } else if (val.E_STRING()!= null) {
            return Tipo.STRING;
        }else if(val.E_CHAR()!= null){
            return Tipo.STRING;
        }
        return null;
    }
    
     public Operation verificarTipoOperacao(LinguagemParser.OperationsContext opContext){
        if(opContext.op_arit_baixa() != null){
            if(opContext.op_arit_baixa().DIV()!= null){
                return Operation.DIV;
            }
            if(opContext.op_arit_baixa().SOMA()!= null){
                return Operation.MAIS;
            }
            if(opContext.op_arit_baixa().MULT()!= null){
                return Operation.MULT;
            }
            if(opContext.op_arit_baixa().RESTO()!= null){
                return Operation.RESTO;
            }
        }
        if(opContext.op_bitwise() != null){
            if(opContext.op_bitwise().BIT_PE()!= null){
                return Operation.BITSHIFTLEFT;
            }
            if(opContext.op_bitwise().BIT_PD()!= null){
                return Operation.BITSHIFTRIGHT;
            }
        }
        if(opContext.op_logica() != null){
            if(opContext.op_logica().EE()!= null){
                return Operation.AND;
            }
            if(opContext.op_logica().NEGA()!= null){
                return Operation.NOT;
            }
            if(opContext.op_logica().OUOU()!= null){
                return Operation.OR;
            }
        }
        if(opContext.op_neg() != null){
            if(opContext.op_neg().BIT_NOT()!= null){
                return Operation.BITNOT;
            }
            if(opContext.op_neg().SUB()!= null){
                return Operation.MENOS;
            }
            if(opContext.op_neg().NEGA()!= null){
                return Operation.NOT;
            }
        }
        if(opContext.op_rel() != null){
            if(opContext.op_rel().DIF()!= null){
                return Operation.DIFERENTE;
            }
            if(opContext.op_rel().IGUAL()!= null){
                return Operation.IDENTICO;
            }
            if(opContext.op_rel().MAIOIG()!= null){
                return Operation.MAIOROUIGUAL;
            }
            if(opContext.op_rel().MAIOQ()!= null){
                return Operation.MAIORQUE;
            }
            if(opContext.op_rel().MENOQ()!= null){
                return Operation.MENOROUIGUAL;
            }
            if(opContext.op_rel().MENOQ()!= null){
                return Operation.MENORQUE;
            }
        }
        return null;
    }
    
    @Override
    public Object visitRetorno(LinguagemParser.RetornoContext ctx) {
       Tipo tipoExpressao = visitExpressaoLoop(ctx.expressao());
        if (tipoExpressao == tipoFuncao) {
            temRetorno = true;
        }
        return null;
    }
    
   
    
    
    
    
    @Override
    public Object visitParametros(LinguagemParser.ParametrosContext ctx) {

        for (int i = 0; i < ctx.parametro().size(); i++) {

            String idName = ctx.parametro(i).ID().getSymbol().getText();
            if (Escopo.verificaSeExisteNoEscopo(idName, tabelaSimbolos, escopoAtual)) {
                throw new ParseCancellationException("Declaração de Váriavel " + idName + " já existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
            }
            visitTipo(ctx.parametro(i).tipo());
            Identificador id = new Identificador(
                    idName,
                    tipoAtual,
                    true,
                    false,
                    escopoAtual,
                    true,
                    ctx.parametro(i).BIT_AND() != null,
                    i + 1,
                    multidimensional,
                    false);
            tabelaSimbolos.add(id);

        }
        return null;
    }

    private Escopo getEscopoDaFuncao(String idName) {
        Escopo escopo = null;
        for (Identificador identificador : tabelaSimbolos) {
            if (identificador.getNome().equals(idName)) {
                escopo = identificador.getEscopo();
                break;
            }
        }
        if (escopo == null) {
            throw new ParseCancellationException("Escopo não encontrado");
        }

        for (Escopo subEscopo : escopo.getSubEscopos()) {
            if (subEscopo.getNome().equals(idName)) {
                return subEscopo;
            }
        }
        return null;
    }

    private void markAllFunctions(LinguagemParser.ProgContext ctxProg) {
        List<LinguagemParser.FuncaoContext> fctx = ctxProg.funcaoInicio().funcao();
        for (LinguagemParser.FuncaoContext ctx : fctx) {
            visitTipoComVoid(ctx.tipoComVoid());
            if (Escopo.verificaSeExisteNoEscopo(ctx.ID().getSymbol().getText(), tabelaSimbolos, escopoAtual)) {
                new ParseCancellationException("Declaração da Função " + ctx.ID().getSymbol().getText() + " já existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
            }
            boolean usada = false;
            if (ctx.ID().getSymbol().getText().equals("divideByZero")) {
                usada = true;
            }
            Identificador id = new Identificador(
                    ctx.ID().getSymbol().getText(),
                    tipoAtual,
                    true,
                    usada,
                    escopoAtual,
                    false,
                    false,
                    0,
                    0,
                    true);
            tabelaSimbolos.add(id);

            escopoAtual = Escopo.criaEVaiEscopoNovo(ctx.ID().getText(), escopoAtual);
            visitParametros(ctx.parametros());
            retornaEscopoPai();
        }
    }
    
    
  @Override
    public Object visitWhiledes(LinguagemParser.WhiledesContext ctx) {
       escopoAtual = Escopo.criaEVaiEscopoNovo("doWhile_" + contEscopo++, escopoAtual);
        visitChildren(ctx);
        retornaEscopoPai();
        return null;
    }

    
        @Override
    public Object visitDodes(LinguagemParser.DodesContext ctx) {
      escopoAtual = Escopo.criaEVaiEscopoNovo("doWhile_" + contEscopo++, escopoAtual);
        visitChildren(ctx);
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitIfdes(LinguagemParser.IfdesContext ctx) {
escopoAtual = Escopo.criaEVaiEscopoNovo("if_" + contEscopo++, escopoAtual);
        visitChildren(ctx);
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitIfdeselseif(LinguagemParser.IfdeselseifContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("else_if_" + contEscopo++, escopoAtual);
        visitChildren(ctx);
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitIfdeselse(LinguagemParser.IfdeselseContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("else_" + contEscopo++, escopoAtual);
        visitChildren(ctx);
        retornaEscopoPai();
        return null;
    }

    
        @Override
    public Object visitFordes(LinguagemParser.FordesContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("for_" + contEscopo++, escopoAtual);
        visitChildren(ctx);
        retornaEscopoPai();
        return null;
    }

        @Override
    public Object visitEntradaesaida(LinguagemParser.EntradaesaidaContext ctx) {
     for (LinguagemParser.ExpressaoContext exp : ctx.parametrosChamada().expressao()) {
            visitExpressao(exp);
            if(ctx.CIN()!= null && exp.val_final(0).ID() == null){
                this.semanticErrors.add(new ParseCancellationException("Tentando ler uma entrada em uma constante na Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
            }
        }
        return null;
    }

    
    
    
    
    
    
            }
