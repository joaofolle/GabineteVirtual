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
                 String CPF              = this.cpf;                                                                                       //STRING CPF
                                                    
        int primeira_soma = 0, primeiro_peso = 10, numero_percorrido = 0;                                                               //INT primeira_soma e primeiro_peso
        
        for(int i = 0; i <= 8; i++){                    
            numero_percorrido = Integer.parseInt(String.valueOf(CPF.charAt(i)));       
            primeira_soma += numero_percorrido * primeiro_peso;                
            primeiro_peso--;                                                   
        }//Fecha o for
        
        int resto_primeira_soma = primeira_soma % 11;                                                                                   //INT resto da primeira soma
        int pdv = Integer.parseInt(String.valueOf(CPF.charAt(9)));                                                                      //INT primeiro digito verificador
        
        if (resto_primeira_soma < 2 && pdv == 0 || 11 - resto_primeira_soma == pdv) {
            int segunda_soma = 0, segundo_peso = 11;                                                                                    //INT segunda_soma e  segundo_peso
            
            for(int i = 0; i <= 9; i++){
                numero_percorrido = Integer.parseInt(String.valueOf(CPF.charAt(i)));    
                segunda_soma += numero_percorrido * segundo_peso;               
                segundo_peso--;                                                 
            }//Fecha o for
            
            int resto_segunda_soma = segunda_soma % 11;                                                                                 //INT resto da segunda soma
            int sdv = Integer.parseInt(String.valueOf(CPF.charAt(10)));                                                                 //INT segundo dígitoo verificador

            if(resto_segunda_soma <2 && sdv == 0 || 11 - resto_segunda_soma == sdv){
                throw new Exception("Usuário cadastrado com sucesso!"); //Valida o CPF
            }else {
                throw new Exception("CPF inválido"); //Retorna a falha da segunda verificação;                   
            }
        }else {                
            throw new Exception("CPF inválido");//Retorna a falha da primeira verificação;
        }

    }
    
    public void inserir() {
        /* Implementar o algoritmo para inserir no BD 
        Usando JDBC
        */
    }
}
