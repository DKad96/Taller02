package godefroy.llaque.meza.test;

import godefroy.llaque.meza.util.Gestion;
import java.util.List;


/**
 *
 * @author christianempire
 */
public class Test
{

    public static void main(String[] args)
    {
        Test t2 = new Test();
        t2.logica();
    }

    private void logica()
    {
        String archivo = "C:\\ESTEBAN\\1416-TALLER-02-2016-I.txt";
        Gestion g2 = new Gestion(1000);
        g2.leerArchivo(archivo);
        

        //***** SOLUCIONES *****
        System.out.println("***** SOLUCIONES *****");

        //1a
        
    }

}
