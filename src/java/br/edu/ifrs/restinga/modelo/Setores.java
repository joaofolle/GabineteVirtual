/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.modelo;

/**
 *
 * @author DTI
 */
public class Setores {
    private String nome;
    private Setores setorPai;
    private Usuarios usuarios[];

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the setorPai
     */
    public Setores getSetorPai() {
        return setorPai;
    }

    /**
     * @param setorPai the setorPai to set
     */
    public void setSetorPai(Setores setorPai) {
        this.setorPai = setorPai;
    }

    /**
     * @return the usuarios
     */
    public Usuarios[] getUsuarios() {
        return usuarios;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(Usuarios[] usuarios) {
        this.usuarios = usuarios;
    }
}
