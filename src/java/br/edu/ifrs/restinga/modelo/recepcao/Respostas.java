/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.modelo.recepcao;

import br.edu.ifrs.restinga.modelo.Servidores;
import java.util.Calendar;

/**
 *
 * @author DTI
 */
public class Respostas {
    private String descricaoResposta;
    private Calendar dataResposta;
    private boolean rascunho;
    private Object anexos;
    private Servidores servidor;

    /**
     * @return the descricaoResposta
     */
    public String getDescricaoResposta() {
        return descricaoResposta;
    }

    /**
     * @param descricaoResposta the descricaoResposta to set
     */
    public void setDescricaoResposta(String descricaoResposta) {
        this.descricaoResposta = descricaoResposta;
    }

    /**
     * @return the dataResposta
     */
    public Calendar getDataResposta() {
        return dataResposta;
    }

    /**
     * @param dataResposta the dataResposta to set
     */
    public void setDataResposta(Calendar dataResposta) {
        this.dataResposta = dataResposta;
    }

    /**
     * @return the rascunho
     */
    public boolean isRascunho() {
        return rascunho;
    }

    /**
     * @param rascunho the rascunho to set
     */
    public void setRascunho(boolean rascunho) {
        this.rascunho = rascunho;
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
     * @return the servidor
     */
    public Servidores getServidor() {
        return servidor;
    }

    /**
     * @param servidor the servidor to set
     */
    public void setServidor(Servidores servidor) {
        this.servidor = servidor;
    }
}
