/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.modelo.documentos;

import br.edu.ifrs.restinga.modelo.Usuarios;
import java.util.Calendar;

/**
 *
 * @author DTI
 */
public class SolicitacaoDocumentos {
    private String objetivo;
    private Calendar dataSolicitacao;
    private Calendar dataDocumento;
    private String conteudoDocumento;
    private String situacao;
    private Object anexos;
    private Usuarios usuario;

    /**
     * @return the objetivo
     */
    public String getObjetivo() {
        return objetivo;
    }

    /**
     * @param objetivo the objetivo to set
     */
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    /**
     * @return the dataSolicitacao
     */
    public Calendar getDataSolicitacao() {
        return dataSolicitacao;
    }

    /**
     * @param dataSolicitacao the dataSolicitacao to set
     */
    public void setDataSolicitacao(Calendar dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    /**
     * @return the dataDocumento
     */
    public Calendar getDataDocumento() {
        return dataDocumento;
    }

    /**
     * @param dataDocumento the dataDocumento to set
     */
    public void setDataDocumento(Calendar dataDocumento) {
        this.dataDocumento = dataDocumento;
    }

    /**
     * @return the conteudoDocumento
     */
    public String getConteudoDocumento() {
        return conteudoDocumento;
    }

    /**
     * @param conteudoDocumento the conteudoDocumento to set
     */
    public void setConteudoDocumento(String conteudoDocumento) {
        this.conteudoDocumento = conteudoDocumento;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
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
     * @return the usuario
     */
    public Usuarios getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}
