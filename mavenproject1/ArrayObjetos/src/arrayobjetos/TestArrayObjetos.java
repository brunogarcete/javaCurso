package arrayobjetos;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class TestArrayObjetos {
    public static void main(String[] args) {
        // Declaracion de los objetos
        ArrayObjetos[] obj = new ArrayObjetos[3];
        Logger logger = Logger.getLogger(TestArrayObjetos.class.getName());
        Scanner entrada = new Scanner(System.in);
        double suma;
        
        logger.log( Level.INFO, "El tama\u00f1o del array es : {0}", obj.length );
        logger.log( Level.INFO ,"Experimento 1" );
        
        for (int i = 0; i < obj.length; i++) {
            logger.log(Level.INFO, "Escriba la suma {0}", i );
            suma = entrada.nextDouble();
            obj[i] = new ArrayObjetos ( suma , obj.length );
        }
       
        
        // Metodos toString
        logger.log(Level.INFO, obj[0].toString() );
        logger.log(Level.INFO, obj[1].toString() );
        logger.log(Level.INFO, obj[2].toString() );
        
        logger.log(Level.INFO, "Promedio 1: {0}", obj[0].promedio());
        logger.log(Level.INFO, "Promedio 2: {0}", obj[1].promedio());
        logger.log(Level.INFO, "Promedio 3: {0}", obj[2].promedio());
    }
}
