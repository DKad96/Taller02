package godefroy.llaque.meza.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import godefroy.llaque.meza.bean.*;


/**
 *
 * @author christianempire
 */
public class Gestion
{

    private List<Persona> personas;

    public Gestion()
    {
    }

    public Gestion(int tam)
    {
        this.personas = new ArrayList();
    }

    private void agregarReferencia(Persona p)
    {
        this.personas.add(p);
    }

    public void leerArchivo(String archivo)
    {
        File f = new File(archivo);
        Scanner sc;
        try
        {
            sc = new Scanner(f);
            while (sc.hasNext())
            {
                String linea = sc.nextLine();
                String[] datos = linea.split("::");
                String nombre = datos[0];
                String telef = datos[1];
                String correo = datos[2];
                String empresa = datos[3];
                int pin = Integer.parseInt(datos[4]);
                String pais = datos[5];
                
                String x = datos[6].replace("$", "");
                String y = x.replace(",", "");
                float ahorro = Float.parseFloat(y);
                
                
                String clave = datos[7];
                String texto = datos[8];
                int secuencia = Integer.parseInt(datos[9]);
                
                int largo = String.valueOf(pin).length();
                
                if ( largo%2== 0) {
                    Par par= new Par(secuencia, nombre, telef, correo, empresa, pin, pais, ahorro, clave);
                    this.agregarReferencia(par);
                }else{
                    Impar impar = new Impar(secuencia, nombre, telef, correo, empresa, pin, pais, ahorro, clave);
                    this.agregarReferencia(impar);
                }

                

            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Tu archivo no se ha leido " + ex.getMessage());
        }
    }

    public void imprimirDatos()
    {
        for (Persona p : this.personas)
        {
            System.out.println(p);
        }
    }

    //***** EJERCICIOS *****
    public Set<String> pregunta1() {
        Map<String, Integer> mapa = new HashMap();
        for (Persona p : personas) {            
            String pais = p.getPais();
            if (mapa.containsKey(pais)) {
                
                int valor = mapa.get(pais);
                mapa.put(pais, valor + 1);
                
            } else {                
                mapa.put(pais, 1);
            }
        }
        List<Auxiliar1> preg1 = new ArrayList();        
        Set llaves = mapa.keySet();        
        Iterator it = llaves.iterator();
        while (it.hasNext()) {            
            String k = (String) it.next();
            int valor = (int) mapa.get(k);
            Auxiliar1 a = new Auxiliar1(k, valor);
            preg1.add(a);
        }
        for (int i = 0; i < preg1.size(); i++) {
            for (int j = i+1; j < preg1.size(); j++) {
                if (true) {
                    
                }
            }
        }
    }
    public List<Persona> pregunta2(String flag) { 
    
    
    }
    public List pregunta3( ) { 
    
    
    }
    public Persona pregunta4( ) { 
    
    
    }

    
}
