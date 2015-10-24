/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.modelo.reservas;

import br.edu.ifrs.restinga.modelo.Usuarios;
import java.util.Calendar;

/**
 *
 * @author DTI
 */
public class Reservas {
    private String solicitante;
    private String entidadeSolicitante;
    private String emailContato;
    private String telefoneContato;
    private Calendar dataInicioReserva;
    private Calendar dataTerminoReserva;
    private String objetivoReserva;
    private String observacoes;
    private String ocorrencias;
    private String situacao;
    private SolicitacaoReservas solicitacao;
    private Usuarios usuario;

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
     * @return the objetivoReserva
     */
    public String getObjetivoReserva() {
        return objetivoReserva;
    }

    /**
     * @param objetivoReserva the objetivoReserva to set
     */
    public void setObjetivoReserva(String objetivoReserva) {
        this.objetivoReserva = objetivoReserva;
    }

    /**
     * @return the observacoes
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * @param observacoes the observacoes to set
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    /**
     * @return the ocorrencias
     */
    public String getOcorrencias() {
        return ocorrencias;
    }

    /**
     * @param ocorrencias the ocorrencias to set
     */
    public void setOcorrencias(String ocorrencias) {
        this.ocorrencias = ocorrencias;
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
     * @return the solicitacao
     */
    public SolicitacaoReservas getSolicitacao() {
        return solicitacao;
    }

    /**
     * @param solicitacao the solicitacao to set
     */
    public void setSolicitacao(SolicitacaoReservas solicitacao) {
        this.solicitacao = solicitacao;
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
