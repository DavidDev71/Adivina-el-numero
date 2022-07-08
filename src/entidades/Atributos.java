/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Noelia Dominguez
 */
public class Atributos {
    
    private int numAleatorio;
    private int numUser;
    private int valor;

    public Atributos() {
    }

    public Atributos(int numAleatorio, int numUser, int valor) {
        this.numAleatorio = numAleatorio;
        this.numUser = numUser;
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    
    
    public int getNumAleatorio() {
        return numAleatorio;
    }

    public void setNumAleatorio(int numAleatorio) {
        this.numAleatorio = numAleatorio;
    }

    public int getNumUser() {
        return numUser;
    }

    public void setNumUser(int numUser) {
        this.numUser = numUser;
    }
    
    
    
    
    
}
