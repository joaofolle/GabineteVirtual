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
public class Servidores extends Usuarios {
    private int siape;

    /**
     * @return the siape
     */
    public int getSiape() {
        return siape;
    }

    /**
     * @param siape the siape to set
     */
    public void setSiape(int siape) {
        this.siape = siape;
    }
}
