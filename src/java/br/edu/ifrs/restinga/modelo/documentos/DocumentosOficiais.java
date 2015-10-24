/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.modelo.documentos;

import br.edu.ifrs.restinga.modelo.Servidores;
import java.util.Calendar;

/**
 *
 * @author DTI
 */
public class DocumentosOficiais {
    private int numero;
    private int ano;
    private Calendar dataEmissao;
    private String conteudo;
    private Servidores emissor;
    private Object anexos;
    private SolicitacaoDocumentos solicitacaoDocumento;

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the dataEmissao
     */
    public Calendar getDataEmissao() {
        return dataEmissao;
    }

    /**
     * @param dataEmissao the dataEmissao to set
     */
    public void setDataEmissao(Calendar dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    /**
     * @return the conteudo
     */
    public String getConteudo() {
        return conteudo;
    }

    /**
     * @param conteudo the conteudo to set
     */
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    /**
     * @return the emissor
     */
    public Servidores getEmissor() {
        return emissor;
    }

    /**
     * @param emissor the emissor to set
     */
    public void setEmissor(Servidores emissor) {
        this.emissor = emissor;
    }

    /**
     * @return the anexos
     */
    public Object getAnexos() {
        return anexos;
    }

    /**
     * @param anexos the anexos to set
     */
    public void setAnexos(Object anexos) {
        this.anexos = anexos;
    }

    /**
     * @return the solicitacaoDocumento
     */
    public SolicitacaoDocumentos getSolicitacaoDocumento() {
        return solicitacaoDocumento;
    }

    /**
     * @param solicitacaoDocumento the solicitacaoDocumento to set
     */
    public void setSolicitacaoDocumento(SolicitacaoDocumentos solicitacaoDocumento) {
        this.solicitacaoDocumento = solicitacaoDocumento;
    }
}
