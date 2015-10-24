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
public class Usuarios {
    private String cpf;
    private String nome;
    private String telefone;
    private String eamil;

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

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
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the eamil
     */
    public String getEamil() {
        return eamil;
    }

    /**
     * @param eamil the eamil to set
     */
    public void setEamil(String eamil) {
        this.eamil = eamil;
    }
    
    public void validarCPF() throws Exception {
        if (this.cpf.equals("111")) {
            throw new Exception("CPF inválido");
        }
    }
    
    public void inserir() {
        /* Implementar o algoritmo para inserir no BD 
        Usando JDBC
        */
    }
}
