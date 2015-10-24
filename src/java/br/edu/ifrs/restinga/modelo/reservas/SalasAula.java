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
public class SalasAula extends Espacos {
    private boolean projetor;
    private boolean internet;
    private boolean quadro;

    /**
     * @return the projetor
     */
    public boolean isProjetor() {
        return projetor;
    }

    /**
     * @param projetor the projetor to set
     */
    public void setProjetor(boolean projetor) {
        this.projetor = projetor;
    }

    /**
     * @return the internet
     */
    public boolean isInternet() {
        return internet;
    }

    /**
     * @param internet the internet to set
     */
    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    /**
     * @return the quadro
     */
    public boolean isQuadro() {
        return quadro;
    }

    /**
     * @param quadro the quadro to set
     */
    public void setQuadro(boolean quadro) {
        this.quadro = quadro;
    }
}
