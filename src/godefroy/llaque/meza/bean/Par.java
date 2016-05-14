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
public class Par extends Persona{
    private int key;

    public Par() {
    }

    public Par(int key, String nombre, String telef, String correo, String empresa, int pin, String pais, float ahorro, String clave) {
        super(nombre, telef, correo, empresa, pin, pais, ahorro, clave);
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
