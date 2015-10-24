/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.modelo.eventos;

import java.util.Calendar;

/**
 *
 * @author DTI
 */
public class SolicitacaoEventos {
    private String solicitante;
    private String entidadeSolicitante;
    private String emailContato;
    private String telefoneContato;
    private String descricaoEvento;
    private Calendar dataInicioEvento;
    private Calendar dataTerminoEvento;

    /**
     * @return the solicitante
     */
    public String getSolicitante() {
        return solicitante;
    }

    /**
     * @param solicitante the solicitante to set
     */
    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    /**
     * @return the entidadeSolicitante
     */
    public String getEntidadeSolicitante() {
        return entidadeSolicitante;
    }

    /**
     * @param entidadeSolicitante the entidadeSolicitante to set
     */
    public void setEntidadeSolicitante(String entidadeSolicitante) {
        this.entidadeSolicitante = entidadeSolicitante;
    }

    /**
     * @return the emailContato
     */
    public String getEmailContato() {
        return emailContato;
    }

    /**
     * @param emailContato the emailContato to set
     */
    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    /**
     * @return the telefoneContato
     */
    public String getTelefoneContato() {
        return telefoneContato;
    }

    /**
     * @param telefoneContato the telefoneContato to set
     */
    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    /**
     * @return the descricaoEvento
     */
    public String getDescricaoEvento() {
        return descricaoEvento;
    }

    /**
     * @param descricaoEvento the descricaoEvento to set
     */
    public void setDescricaoEvento(String descricaoEvento) {
        this.descricaoEvento = descricaoEvento;
    }

    /**
     * @return the dataInicioEvento
     */
    public Calendar getDataInicioEvento() {
        return dataInicioEvento;
    }

    /**
     * @param dataInicioEvento the dataInicioEvento to set
     */
    public void setDataInicioEvento(Calendar dataInicioEvento) {
        this.dataInicioEvento = dataInicioEvento;
    }

    /**
     * @return the dataTerminoEvento
     */
    public Calendar getDataTerminoEvento() {
        return dataTerminoEvento;
    }

    /**
     * @param dataTerminoEvento the dataTerminoEvento to set
     */
    public void setDataTerminoEvento(Calendar dataTerminoEvento) {
        this.dataTerminoEvento = dataTerminoEvento;
    }
}
