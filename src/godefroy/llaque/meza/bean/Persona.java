
package godefroy.llaque.meza.bean;

public class Persona {
    private String nombre;
    private String telef;
    private String correo;
    private String empresa;
    private int pin;
    private String pais;
    private float ahorro;
    private String clave;

    public Persona() {
    }

    public Persona(String nombre, String telef, String correo, String empresa, int pin, String pais, float ahorro, String clave) {
        this.nombre = nombre;
        this.telef = telef;
        this.correo = correo;
        this.empresa = empresa;
        this.pin = pin;
        this.pais = pais;
        this.ahorro = ahorro;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelef() {
        return telef;
    }

    public void setTelef(String telef) {
        this.telef = telef;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public float getAhorro() {
        return ahorro;
    }

    public void setAhorro(float ahorro) {
        this.ahorro = ahorro;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
