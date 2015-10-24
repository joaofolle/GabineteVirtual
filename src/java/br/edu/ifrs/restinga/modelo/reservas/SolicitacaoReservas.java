/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.modelo.reservas;

import java.util.Calendar;

/**
 *
 * @author DTI
 */
public class SolicitacaoReservas {
    private String solicitante;
    private String entidadeSolicitante;
    private String emailContato;
    private String telefoneContato;
    private Calendar dataInicioReserva;
    private Calendar dataTerminoReserva;
    private String objetivo;

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
     * @return the dataInicioReserva
     */
    public Calendar getDataInicioReserva() {
        return dataInicioReserva;
    }

    /**
     * @param dataInicioReserva the dataInicioReserva to set
     */
    public void setDataInicioReserva(Calendar dataInicioReserva) {
        this.dataInicioReserva = dataInicioReserva;
    }

    /**
     * @return the dataTerminoReserva
     */
    public Calendar getDataTerminoReserva() {
        return dataTerminoReserva;
    }

    /**
     * @param dataTerminoReserva the dataTerminoReserva to set
     */
    public void setDataTerminoReserva(Calendar dataTerminoReserva) {
        this.dataTerminoReserva = dataTerminoReserva;
    }

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
}
