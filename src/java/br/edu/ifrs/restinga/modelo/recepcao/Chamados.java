     /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.modelo.recepcao;

import br.edu.ifrs.restinga.modelo.Recepcionistas;
import br.edu.ifrs.restinga.modelo.Usuarios;
import java.util.Calendar;

/**
 *
 * @author DTI
 */
public class Chamados {
    private String nomeSolicitante;
    private String perfilSolicitante;
    private String email;
    private String telefoneContato;
    private String descricaoSolicitacao;
    private String situacao;
    private Calendar dataAbertura;
    private Object anexos;
    private Recepcionistas recepcionista;
    private Usuarios usuario;
    private Respostas respostas[];

    /**
     * @return the nomeSolicitante
     */
    public String getNomeSolicitante() {
        return nomeSolicitante;
    }

    /**
     * @param nomeSolicitante the nomeSolicitante to set
     */
    public void setNomeSolicitante(String nomeSolicitante) {
        this.nomeSolicitante = nomeSolicitante;
    }

    /**
     * @return the perfilSolicitante
     */
    public String getPerfilSolicitante() {
        return perfilSolicitante;
    }

    /**
     * @param perfilSolicitante the perfilSolicitante to set
     */
    public void setPerfilSolicitante(String perfilSolicitante) {
        this.perfilSolicitante = perfilSolicitante;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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
     * @return the descricaoSolicitacao
     */
    public String getDescricaoSolicitacao() {
        return descricaoSolicitacao;
    }

    /**
     * @param descricaoSolicitacao the descricaoSolicitacao to set
     */
    public void setDescricaoSolicitacao(String descricaoSolicitacao) {
        this.descricaoSolicitacao = descricaoSolicitacao;
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
     * @return the dataAbertura
     */
    public Calendar getDataAbertura() {
        return dataAbertura;
    }

    /**
     * @param dataAbertura the dataAbertura to set
     */
    public void setDataAbertura(Calendar dataAbertura) {
        this.dataAbertura = dataAbertura;
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
     * @return the recepcionista
     */
    public Recepcionistas getRecepcionista() {
        return recepcionista;
    }

    /**
     * @param recepcionista the recepcionista to set
     */
    public void setRecepcionista(Recepcionistas recepcionista) {
        this.recepcionista = recepcionista;
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

    /**
     * @return the respostas
     */
    public Respostas[] getRespostas() {
        return respostas;
    }

    /**
     * @param respostas the respostas to set
     */
    public void setRespostas(Respostas[] respostas) {
        this.respostas = respostas;
    }
}
