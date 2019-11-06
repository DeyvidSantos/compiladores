/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executargramatica.visitor;
import executargramatica.lingaguemmodel.LinguagemBaseVisitor;

import java.util.ArrayList;
import java.util.List;
import executargramatica.models.*;

/**
 *
 * @author Deyvid Santos
 */
public abstract class VisitorLingaguem extends LinguagemBaseVisitor<Object> {
     
    protected final List<Identificador> tabelaSimbolos;
    protected Escopo escopoAtual;
    protected Identificador.Tipo tipoAtual;
    protected int multidimensional;
    protected int qtdMultidimensional;
    protected enum Operation{
        OR,AND,OR2,NOT,AND2,
        MAIORQUE,MENORQUE,MAIOROUIGUAL,MENOROUIGUAL,IDENTICO,DIFERENTE,
        BITSHIFTLEFT,BITSHIFTRIGHT,BITNOT,
        MENOS,
        MAIS
    };
    protected Operation operacao;
    /**
     * Construtor do analisador semantico, Pode aceitar uma tabela de simbolos
     * pré iniciada.
     *
     * @param tabelaSimbolos pode ser NULL
     */
    //DEIXAR IGUAL ALTERRA PRO NOME
    protected VisitorLingaguem(List<Identificador> tabelaSimbolos)
    {
        if (tabelaSimbolos != null)
        {
            this.tabelaSimbolos = tabelaSimbolos;
        } else
        {
            this.tabelaSimbolos = new ArrayList();
        }
    }
    protected Escopo vaiEscopoFilho(String nome){
        List<Escopo> subs = escopoAtual.getSubEscopos();
        for (Escopo sub : subs) {
            if(sub.getNome().equals(nome)){
                return sub;
            }
        }
        return null;
    }
    protected void retornaEscopoPai()
    {
        escopoAtual = escopoAtual.getPai();
    }
}
