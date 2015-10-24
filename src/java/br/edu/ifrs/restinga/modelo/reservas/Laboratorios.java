/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.modelo.reservas;

/**
 *
 * @author DTI
 */
public class Laboratorios extends Espacos {
    private String especialidade;
    private String equipamentos;

    /**
     * @return the especialidade
     */
    public String getEspecialidade() {
        return especialidade;
    }

    /**
     * @param especialidade the especialidade to set
     */
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    /**
     * @return the equipamentos
     */
    public String getEquipamentos() {
        return equipamentos;
    }

    /**
     * @param equipamentos the equipamentos to set
     */
    public void setEquipamentos(String equipamentos) {
        this.equipamentos = equipamentos;
    }
}
