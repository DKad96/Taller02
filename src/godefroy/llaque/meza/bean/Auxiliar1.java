/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package godefroy.llaque.meza.bean;

/**
 *
 * @author Administrator
 */
public class Auxiliar1 implements Comparable {
    private String letra;
    private int cantidad;

    public Auxiliar1() {
    }

    public Auxiliar1(String letra, int cantidad) {
        this.letra = letra;
        this.cantidad = cantidad;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cacantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public int compareTo(Object o) {
        Auxiliar1 a = (Auxiliar1) o;
        return this.getCantidad() - a.getCantidad();
    }
    
}
