/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executargramatica.visitor;

import java.util.List;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import executargramatica.models.AssemblyName;
import executargramatica.models.Identificador;
import executargramatica.lingaguemmodel.LinguagemParser;
import executargramatica.models.Escopo;


/**
 *
 * @author rafael
 */
public class BipGenerator extends VisitorLingaguem {

    private final StringBuilder header = new StringBuilder();
    private final StringBuilder codigo = new StringBuilder();
    private final List<AssemblyName> anlist;
    private int maiorNumTemporariosNecessarios = 0;
    private int numTemporariosNecessarios = 0;
    private int numRotuloAtual = 0;
    private int contEscopo = 1;

    public BipGenerator(List<Identificador> tabelaSimbolos) {
        super(tabelaSimbolos);
        this.anlist = AssemblyName.getMatrix(tabelaSimbolos);
        this.codigo.append(".text\n");
        this.geradorData();
    }

    public String getCodigo() {
        String lines[] = this.codigo.toString().split("\n");
        int lastReturn = -2;
        StringBuilder finalCode = new StringBuilder();
        finalCode.append(this.header);
        for (int i = 1; i <= this.maiorNumTemporariosNecessarios; i++) {
            finalCode.append("\t");
            finalCode.append("temp");
            finalCode.append(i);
            finalCode.append(" : 0\n");
        }
        for (int i = 0; i < lines.length; i++) {
            if (i - 1 == lastReturn && lines[i].contains("RETURN")) {
                lines[i] = "";
            }
            if (lines[i].contains("RETURN")) {
                lastReturn = i;
            }
            finalCode.append(lines[i] + "\n");
        }
//        finalCode.append(this.codigo);
        return finalCode.toString();
    }

    private int getOneTemp() {
        this.numTemporariosNecessarios++;
        if (this.maiorNumTemporariosNecessarios < this.numTemporariosNecessarios) {
            this.maiorNumTemporariosNecessarios = this.numTemporariosNecessarios;
        }
        return this.numTemporariosNecessarios;
    }

    private int releaseTheTemp() {
        this.numTemporariosNecessarios--;
        return this.numTemporariosNecessarios;
    }

    private String getOneRot() {
        this.numRotuloAtual++;
        String rot = "rot" + this.numRotuloAtual;
        return rot;
    }

    private void geradorData() {
        this.header.append(".data\n");
        for (Identificador identificador : tabelaSimbolos) {
            if (!identificador.isFuncao()) {
                if (identificador.getTipo() != Identificador.Tipo.INTEIRO) {
                    throw new ParseCancellationException(identificador.getTipo() + " Não suportado pelo BIP");
                }
                this.header.append("\t");
                this.header.append(AssemblyName.findAN(this.anlist, identificador));
                this.header.append(" : ");
                for (int i = 0; i < identificador.getQtdArmazenada(); i++) {
                    if (i == identificador.getQtdArmazenada() - 1) {
                        this.header.append("0\n");
                    } else {
                        this.header.append("0 , ");
                    }
                }
            }
        }
    }

    @Override
    public Object visitProg(LinguagemParser.ProgContext ctx) {
        escopoAtual = Identificador.getUNSAFEId("main", tabelaSimbolos).getEscopo();
        this.codigo.append("\tCALL main\n");
        return super.visitProg(ctx);
    }

    @Override
    public Object visitTipoComVoid(LinguagemParser.TipoComVoidContext ctx) {
        return super.visitTipoComVoid(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitExpressao(LinguagemParser.ExpressaoContext ctx) {
        this.primeiraOperacao(ctx);
        int tempNum;
        LinguagemParser.Op_relContext rel = null;
        for (int i = 1; i < ctx.val_final().size(); i++) {
            if (ctx.operations(i - 1).op_rel() != null) {
                tempNum = this.getOneTemp();
                this.comando("STO", "temp" + tempNum);
                rel = ctx.operations(i - 1).op_rel();
                if (ctx.val_final(i).ID() != null) {
                    this.comando("LD", findAN(ctx.val_final(i).ID().getText()).toString());
                } else {
                    this.comando("LDI", ctx.val_final(i).getText());
                }
            }
            resolveValFinalEOperando(ctx.operations(i - 1), ctx.val_final(i));
        }
        if (rel != null) {
            tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            comando("LD", "temp" + (tempNum - 1));
            comando("SUB", "temp" + tempNum);
            releaseTheTemp();
            releaseTheTemp();

        }
        return null;
    }

    private void resolveSalto(LinguagemParser.Op_relContext rel, boolean anti_form, String rot) {
        if (rel.DIF() != null) {
            if (anti_form) {
                comando("BEQ", rot);
            } else {
                comando("BNE", rot);
            }
        }
        if (rel.IGUAL() != null) {
            if (anti_form) {
                comando("BNE", rot);
            } else {
                comando("BEQ", rot);
            }
        }
        if (rel.MAIOIG() != null) {
            if (anti_form) {
                comando("BLT", rot);
            } else {
                comando("BGE", rot);
            }
        }
        if (rel.MAIOQ() != null) {
            if (anti_form) {
                comando("BLE", rot);
            } else {
                comando("BGT", rot);
            }
        }
        if (rel.MENOQ() != null) {
            if (anti_form) {
                comando("BGT", rot);
            } else {
                comando("BLE", rot);
            }
        }
        if (rel.MENOQ() != null) {
            if (anti_form) {
                comando("BGE", rot);
            } else {
                comando("BLT", rot);
            }
        }
    }

    private void resolveValFinalEOperando(LinguagemParser.OperationsContext opctx, LinguagemParser.Val_finalContext valctx) {
//        System.out.println("Entrou resolve");
        if (opctx.op_arit_baixa() != null) {
            if (opctx.op_arit_baixa().SOMA() != null) {
                resolveOpAritmeticaMaisOuNegacaoMenos(valctx, true);
            }
        }
        if (opctx.op_bitwise() != null) {
            resolveOpBitwise(opctx.op_bitwise(), valctx);
        }
        if (opctx.op_neg() != null) {
            if (opctx.op_neg().SUB() != null) {
                resolveOpAritmeticaMaisOuNegacaoMenos(valctx, false);
            }
        }
    }

    private void resolveOpBitwise(LinguagemParser.Op_bitwiseContext opBit, LinguagemParser.Val_finalContext valctx) {
//        System.out.println("Entrou " + valctx.getText());
        if (valctx.N_INT() != null) {
            if (opBit.BIT_AND() != null) {
                comando("ANDI", valctx.N_INT().getSymbol().getText());
            } else if (opBit.BIT_OR() != null) {
                comando("ORI", valctx.N_INT().getSymbol().getText());
            } else if (opBit.BIT_XOR() != null) {
                comando("XORI", valctx.N_INT().getSymbol().getText());
            } else if (opBit.BIT_PE() != null) {
                comando("SLL", valctx.N_INT().getSymbol().getText());
            } else if (opBit.BIT_PD() != null) {
                comando("SRL", valctx.N_INT().getSymbol().getText());
            } else if (opBit.BIT_NOT() != null) {
                comando("NOT", "0");
            }
            return;
        }
        //Carrega valor de um ID
        if (valctx.ID() != null) {
            if (valctx.multidimensional() != null) {
                //Carregar valor de vetor
                int tempNum = getOneTemp();
                comando("STO", "temp" + tempNum);
                for (LinguagemParser.ExpressaoContext exp : valctx.multidimensional().expressao()) {
                    visitExpressao(exp);
                }
                comando("STO", "$indr");
                comando("LDV", findAN(valctx.ID().getSymbol().getText()).toString());
                tempNum = getOneTemp();
                comando("STO", "temp" + tempNum);
                comando("LD", "temp" + (tempNum - 1));
                if (opBit.BIT_AND() != null) {
                    comando("AND", "temp" + tempNum);
                } else if (opBit.BIT_NOT() != null) {
                    comando("NOT", "0");
                } else if (opBit.BIT_OR() != null) {
                    comando("OR", "temp" + tempNum);
                } else if (opBit.BIT_PE() != null) {
                    comando("SLL", "temp" + tempNum);
                } else if (opBit.BIT_PD() != null) {
                    comando("SRL", "temp" + tempNum);
                } else if (opBit.BIT_XOR() != null) {
                    comando("XOR", "temp" + tempNum);
                }
                releaseTheTemp();
                releaseTheTemp();
                return;

            } else {
                //Carregar valor de variavel
                String varName = findAN(valctx.ID().getText()).toString();
                if (opBit.BIT_AND() != null) {
                    comando("AND", varName);
                } else if (opBit.BIT_NOT() != null) {
                    comando("NOT", "0");
                } else if (opBit.BIT_OR() != null) {
                    comando("OR", varName);
                } else if (opBit.BIT_PE() != null) {
                    comando("SLL", varName);
                } else if (opBit.BIT_PD() != null) {
                    comando("SRL", varName);
                } else if (opBit.BIT_XOR() != null) {
                    comando("XOR", varName);
                }
                return;
            }
        }

        //Chama função
        if (valctx.chamadaFuncao() != null) {
            int tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            visitChamadaFuncao(valctx.chamadaFuncao());
            tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            comando("LD", "temp" + (tempNum - 1));
            if (opBit.BIT_AND() != null) {
                comando("AND", "temp" + tempNum);
            } else if (opBit.BIT_NOT() != null) {
                comando("NOT", "0");
            } else if (opBit.BIT_OR() != null) {
                comando("OR", "temp" + tempNum);
            } else if (opBit.BIT_PE() != null) {
                comando("SLL", "temp" + tempNum);
            } else if (opBit.BIT_PD() != null) {
                comando("SRL", "temp" + tempNum);
            } else if (opBit.BIT_XOR() != null) {
                comando("XOR", "temp" + tempNum);
            }
            releaseTheTemp();
            releaseTheTemp();
            return;
        }

        //Resolve outra expressão
        if (valctx.expressao() != null) {
            int tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            visitExpressao(valctx.expressao());
            tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            comando("LD", "temp" + (tempNum - 1));
            if (opBit.BIT_AND() != null) {
                comando("AND", "temp" + tempNum);
            } else if (opBit.BIT_NOT() != null) {
                comando("NOT", "0");
            } else if (opBit.BIT_OR() != null) {
                comando("OR", "temp" + tempNum);
            } else if (opBit.BIT_PE() != null) {
                comando("SLL", "temp" + tempNum);
            } else if (opBit.BIT_PD() != null) {
                comando("SRL", "temp" + tempNum);
            } else if (opBit.BIT_XOR() != null) {
                comando("XOR", "temp" + tempNum);
            }
            releaseTheTemp();
            releaseTheTemp();
            return;
        }
        throw new ParseCancellationException("Outras operações não identificadas" + valctx.getText());

    }

    private void resolveOpAritmeticaMaisOuNegacaoMenos(LinguagemParser.Val_finalContext valctx, boolean operacaoMais) {
        //ADD ou SUB valor inteiro imediato

//        System.out.println("Exp " + valctx.getText());
        if (valctx.N_INT() != null) {
            if (operacaoMais) {
                comando("ADDI", valctx.N_INT().getSymbol().getText());
            } else {
                comando("SUBI", valctx.N_INT().getSymbol().getText());
            }
            return;
        }

        //Carrega valor de um ID
        if (valctx.ID() != null) {
            if (valctx.multidimensional() != null) {
                //Carregar valor de vetor
                int tempNum = getOneTemp();
                comando("STO", "temp" + tempNum);
                for (LinguagemParser.ExpressaoContext exp : valctx.multidimensional().expressao()) {
                    visitExpressao(exp);
                }
                comando("STO", "$indr");
                comando("LDV", findAN(valctx.ID().getSymbol().getText()).toString());
                tempNum = getOneTemp();
                comando("STO", "temp" + tempNum);
                comando("LD", "temp" + (tempNum - 1));
                if (operacaoMais) {
                    comando("ADD", "temp" + tempNum);
                } else {
                    comando("SUB", "temp" + tempNum);
                }
                releaseTheTemp();
                releaseTheTemp();
                return;

            } else {
                //Carregar valor de variavel
                String varName = findAN(valctx.ID().getText()).toString();
                if (operacaoMais) {
                    comando("ADD", varName);
                } else {
                    comando("SUB", varName);
                }
                return;
            }
        }

        //Chama função
        if (valctx.chamadaFuncao() != null) {
            int tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            visitChamadaFuncao(valctx.chamadaFuncao());
            tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            comando("LD", "temp" + (tempNum - 1));
            if (operacaoMais) {
                comando("ADD", "temp" + tempNum);
            } else {
                comando("SUB", "temp" + tempNum);
            }
            releaseTheTemp();
            releaseTheTemp();
            return;
        }

        //Resolve outra expressão
        if (valctx.expressao() != null) {
            int tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            visitExpressao(valctx.expressao());
            tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            comando("LD", "temp" + (tempNum - 1));
            if (operacaoMais) {
                comando("ADD", "temp" + tempNum);
            } else {
                comando("SUB", "temp" + tempNum);
            }
            releaseTheTemp();
            releaseTheTemp();
            return;
        }
        throw new ParseCancellationException("Outras operações não identificadas " + valctx.getText());

    }

    private void primeiraOperacao(LinguagemParser.ExpressaoContext ctx) {
        System.out.println("FirstOp: " + ctx.getText());
        LinguagemParser.Val_finalContext valctx = ctx.val_final(0);
        //Carregar valor inteiro imediato
        if (valctx.N_INT() != null) {
            comando("LDI", valctx.N_INT().getSymbol().getText());
        }
        //Carrega valor de um ID
        if (valctx.ID() != null) {
            //Carregar valor de variavel
            String varName = findAN(valctx.ID().getText()).toString();
            comando("LD", varName);
        } else if (valctx.multidimensional() != null) {
            //Carregar valor de vetor
            for (LinguagemParser.ExpressaoContext exp : valctx.multidimensional().expressao()) {
                visitExpressao(exp);
            }
            comando("STO", "$indr");
            comando("LDV", findAN(valctx.ID().getSymbol().getText()).toString());
        }

        //Chama função
        if (valctx.chamadaFuncao() != null) {
            visitChamadaFuncao(valctx.chamadaFuncao());
        }

        //Resolve outra expressão
        if (valctx.expressao() != null) {
//            System.out.println("exp");
            visitExpressao(valctx.expressao());
        }

        if (ctx.op_neg() != null) {
            if (ctx.op_neg().BIT_NOT() != null) {
                comando("NOT", "0");
            } else if (ctx.op_neg().SUB() != null) {
                reverteSinalAcc();
            }
        }
        System.out.println("Saiu");
    }

    @Override
    public Object visitVal_final(LinguagemParser.Val_finalContext ctx) {
        return super.visitVal_final(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitParametrosChamada(LinguagemParser.ParametrosChamadaContext ctx) {
        for (LinguagemParser.ExpressaoContext expressao : ctx.expressao()) {
            visitExpressao(expressao);
            int tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
        }
        for (LinguagemParser.ExpressaoContext expressao : ctx.expressao()) {
            releaseTheTemp();
        }
        return null;
    }

    @Override
    public Object visitFuncao(LinguagemParser.FuncaoContext ctx) {
        if (ctx.ID() == null) {
            return null;
        }
        AssemblyName an = findAN(ctx.ID().getText());
        escopoAtual = vaiEscopoFilho(an.getId().getNome());
        this.codigo.append(an.toString());
        this.codigo.append(" : \n");
        for (LinguagemParser.ParametroContext par : ctx.parametros().parametro()) {
            AssemblyName variavel = findAN(par.ID().getText());
            int tempNum = getOneTemp();
            comando("LD", "temp" + tempNum);
            comando("STO", variavel.toString());
        }
        for (LinguagemParser.ParametroContext par : ctx.parametros().parametro()) {
            releaseTheTemp();
        }

        visitBloco(ctx.bloco());
        if (an.toString().equals("main")) {
            this.codigo.append("\tHLT\n");
        } else {
            this.codigo.append("\tRETURN\n");
        }
        retornaEscopoPai();

        return null;
    }

    @Override
    public Object visitAtribuicoes(LinguagemParser.AtribuicoesContext ctx) {
        AssemblyName variavel = findAN(ctx.ID().getText());
      if(ctx.atribuicoesIncEDec()!= null){
            if(ctx.atribuicoesIncEDec().SOMA().size()>0)
            {
                comando("LD", variavel.toString());
                comando("ADDI", ""+1);
                comando("STO", variavel.toString());
            }
            else if(ctx.atribuicoesIncEDec().SUB().size()>0)
            {
                comando("LD", variavel.toString());
                comando("SUBI", ""+1);
                comando("STO", variavel.toString());
            }            
        }
        else if (variavel.getId().getDimensoes() == 0) {
            visitExpressao(ctx.expressao());
            comando("STO", variavel.toString());
        } else {
            visitExpressao(ctx.expressao());
            int tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            for(LinguagemParser.ExpressaoContext exp : ctx.multidimensional().expressao()){
                visitExpressao(exp);
            }
            //tempNum = getOneTemp();
            //comando("LDI", "temp"+tempNum);
            comando("STO", "$indr");
            comando("LD", "temp" + tempNum);
            releaseTheTemp();
            comando("STOV", variavel.toString());
        }
        return null;
    }

    @Override
    public Object visitChamadaFuncao(LinguagemParser.ChamadaFuncaoContext ctx) {
        visitParametrosChamada(ctx.parametrosChamada());
        if (ctx.ID() == null) {
            System.out.println("???? " + ctx.getText());
        } else {
            String funName = findAN(ctx.ID().getText()).toString();
            comando("CALL", funName);
        }
        return null;
    }

   

    @Override
    public Object visitComandos(LinguagemParser.ComandosContext ctx) {
         return super.visitComandos(ctx);
    }

    @Override
    public Object visitComando(LinguagemParser.ComandoContext ctx) {
        return super.visitComando(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitCondicionais(LinguagemParser.CondicionaisContext ctx) {
        return super.visitCondicionais(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDeclaracoes(LinguagemParser.DeclaracoesContext ctx) {
       
        visitTipo(ctx.tipo());
        for (LinguagemParser.DeclaracaoContext declaracaoContext : ctx.declaracao()) {  
            if(declaracaoContext.ATRIBU()!= null){
                AssemblyName variavel = findAN(declaracaoContext.ID().getText());
                if (declaracaoContext.multidimensional() == null) {
                    visitExpressao(declaracaoContext.expressao());
                    comando("STO", variavel.toString());
                } else {
                    int iMax = Integer.parseInt(declaracaoContext.multidimensional().expressao(0).getText());
                    for (int i = 0; i < iMax; i++) {
                        visitExpressao(declaracaoContext.declaracoesArray().subArrayDeclaracoes(0).expressao(i));
                        int tempNum = getOneTemp();
                        comando("STO", "temp" + tempNum);
                        comando("LDI", String.valueOf(i));
                        comando("STO", "$indr");
                        comando("LD", "temp" + tempNum);
                        comando("STOV", variavel.toString());
                        releaseTheTemp();
                    }
                }
            }
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDeclaracao(LinguagemParser.DeclaracaoContext ctx) {
        if (ctx.ATRIBU() != null) {
            AssemblyName variavel = findAN(ctx.ID().getText());
            visitExpressao(ctx.expressao());
            comando("STO", variavel.toString());
        }
        return null;
    }

    @Override
    public Object visitFordes(LinguagemParser.FordesContext ctx) {
  escopoAtual = Escopo.criaEVaiEscopoNovo("for_" + contEscopo++, escopoAtual);
        if(ctx.declaracoes() != null){
            visitDeclaracoes(ctx.declaracoes());
        }else{
            visitAtribuicoes(ctx.atribuicoes(0));
        }
        String rotRest = getOneRot();
        String rotQuit = getOneRot();
        comando(rotRest+" : ", "");
        
        visitExpressao(ctx.expressao());
        
        List<LinguagemParser.OperationsContext> operacoes = ctx.expressao().operations();
        for (LinguagemParser.OperationsContext operacao : operacoes) {
            if (operacao.op_rel() != null) {
                resolveSalto(operacao.op_rel(), true, rotQuit);
            }
        }
        
        visitBloco(ctx.bloco());
        visitAtribuicoes(ctx.atribuicoes(ctx.atribuicoes().size() - 1));
//        List<MemelangParser.AtribuicoesContext> atris = ctx.atribuicoes();
//        for (MemelangParser.AtribuicoesContext atri : atris) {
//            visitAtribuicoes(atri);
//        }
        
        comando("JMP", rotRest);
        comando(rotQuit+" : ", "");
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitIfdes(LinguagemParser.IfdesContext ctx) {
       escopoAtual = Escopo.criaEVaiEscopoNovo("if_" + contEscopo++, escopoAtual);
        String rot = getOneRot();
        String rot2 = null;
        visitExpressao(ctx.expressao());
        List<LinguagemParser.OperationsContext> operacoes = ctx.expressao().operations();
        for (LinguagemParser.OperationsContext operacao : operacoes) {
            if (operacao.op_rel() != null) {
                resolveSalto(operacao.op_rel(), true, rot);
            }
        }
        visitBloco(ctx.bloco());
        if (ctx.ifdeselse() != null || ctx.ifdeselseif() != null) {
            rot2 = getOneRot();
            comando("JMP", rot2);
        }
        comando(rot + " : ", "");

        if (ctx.ifdeselse() != null) {
            visitIfdeselse(ctx.ifdeselse());
            comando(rot2 + " : ", "");
        }
        if (ctx.ifdeselseif() != null) {
            visitIfdeselseif(ctx.ifdeselseif());
            comando(rot2 + " : ", "");
        }
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitIfdeselse(LinguagemParser.IfdeselseContext ctx) {
         escopoAtual = Escopo.criaEVaiEscopoNovo("else_" + contEscopo++, escopoAtual);
        return super.visitIfdeselse(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitIfdeselseif(LinguagemParser.IfdeselseifContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("else_if_" + contEscopo++, escopoAtual);
        return super.visitIfdeselseif(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDodes(LinguagemParser.DodesContext ctx) {
         escopoAtual = Escopo.criaEVaiEscopoNovo("doWhile_" + contEscopo++, escopoAtual);
        String rotRest = getOneRot();
        String rotQuit = getOneRot();
        comando(rotRest+" : ", "");
        
        visitBloco(ctx.bloco());
        
        visitExpressao(ctx.expressao());
        
        List<LinguagemParser.OperationsContext> operacoes = ctx.expressao().operations();
        for (LinguagemParser.OperationsContext operacao : operacoes) {
            if (operacao.op_rel() != null) {
                resolveSalto(operacao.op_rel(), true, rotQuit);
            }
        }     
        comando("JMP", rotRest);
        comando(rotQuit+" : ", "");
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitWhiledes(LinguagemParser.WhiledesContext ctx) {
          escopoAtual = Escopo.criaEVaiEscopoNovo("while_" + contEscopo++, escopoAtual);
        String rotRest = getOneRot();
        String rotQuit = getOneRot();
        comando(rotRest+" : ", "");
        
        visitExpressao(ctx.expressao());
        
        List<LinguagemParser.OperationsContext> operacoes = ctx.expressao().operations();
        for (LinguagemParser.OperationsContext operacao : operacoes) {
            if (operacao.op_rel() != null) {
                resolveSalto(operacao.op_rel(), true, rotQuit);
            }
        }
        
        visitBloco(ctx.bloco());
        
        comando("JMP", rotRest);
        comando(rotQuit+" : ", "");
        retornaEscopoPai();
        return null;
    }

  
    
    


    @Override
    public Object visitEntradaesaida(LinguagemParser.EntradaesaidaContext ctx) {
        LinguagemParser.ExpressaoContext expGeralAtual;
        for (int i = 0; i < ctx.parametrosChamada().expressao().size(); i++) {
            expGeralAtual = ctx.parametrosChamada().expressao().get(i);
//            System.out.println("TEST " + expGeralAtual.val_final(0).getText());
            if (ctx.CIN()!= null) {       
                if(expGeralAtual.val_final(0).multidimensional() != null){
                    for(  LinguagemParser.ExpressaoContext exp : expGeralAtual.val_final(0).multidimensional().expressao() ){
                        visitExpressao(exp);
                    }
                    comando("STO", "$indr");
                    comando("LD", "$in_port");
                    comando("STOV", findAN(expGeralAtual.val_final(0).ID().getText()).toString());
                }else{
                    comando("LD", "$in_port");
                    comando("STO", findAN(expGeralAtual.getText()).toString());
                }


            } else if (ctx.COUT()!= null) {
                int tempNum = getOneTemp();
                if(expGeralAtual.val_final(0).multidimensional() != null){
                    for(  LinguagemParser.ExpressaoContext exp : expGeralAtual.val_final(0).multidimensional().expressao() ){
                        visitExpressao(exp);
                    }
                    comando("STO", "$indr");
                    comando("LDV", findAN(expGeralAtual.val_final(0).ID().getText()).toString());
                }else{
                    visitExpressao(expGeralAtual);
                }
                comando("STO", "$out_port");
                releaseTheTemp();
            }
        }

        return null;
    }

    private void reverteSinalAcc() {
        int tempNum = getOneTemp();
        comando("STO", "temp" + tempNum);
        comando("LDI", "0");
        comando("SUB", "temp" + tempNum);
        releaseTheTemp();
    }

    private AssemblyName findAN(String name) {
        System.out.println(escopoAtual);
        return AssemblyName.findAN(this.anlist, Identificador.getId(name, tabelaSimbolos, escopoAtual));
    }

    private void comando(String comando, String operador) {
        if (!comando.contains(":")) {
            this.codigo.append("\t");
        }
        this.codigo.append(comando);
        this.codigo.append(" ");
        this.codigo.append(operador);
        this.codigo.append("\n");
    }
}
