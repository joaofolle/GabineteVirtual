/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.modelo.eventos;

import br.edu.ifrs.restinga.modelo.Usuarios;
import java.util.Calendar;

/**
 *
 * @author DTI
 */
public class Eventos {
    private String solicitante;
    private String entidadeSolicitante;
    private String emailContato;
    private String telefoneContato;
    private String descricaoEvento;
    private String situacao;
    private String observacoes;
    private Calendar dataInicio;
    private Calendar dataTermino;
    private Calendar dataAgendamento;
    private SolicitacaoEventos solicitacaoEvento;
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
     * @return the dataInicio
     */
    public Calendar getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return the dataTermino
     */
    public Calendar getDataTermino() {
        return dataTermino;
    }

    /**
     * @param dataTermino the dataTermino to set
     */
    public void setDataTermino(Calendar dataTermino) {
        this.dataTermino = dataTermino;
    }

    /**
     * @return the dataAgendamento
     */
    public Calendar getDataAgendamento() {
        return dataAgendamento;
    }

    /**
     * @param dataAgendamento the dataAgendamento to set
     */
    public void setDataAgendamento(Calendar dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    /**
     * @return the solicitacaoEvento
     */
    public SolicitacaoEventos getSolicitacaoEvento() {
        return solicitacaoEvento;
    }

    /**
     * @param solicitacaoEvento the solicitacaoEvento to set
     */
    public void setSolicitacaoEvento(SolicitacaoEventos solicitacaoEvento) {
        this.solicitacaoEvento = solicitacaoEvento;
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
