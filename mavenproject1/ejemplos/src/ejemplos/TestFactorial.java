package ejemplos;

import java.util.logging.Level;
import java.util.logging.Logger;


public class TestFactorial {
    public static void main(String[] args) {
        
        Logger logger;
        logger = Logger.getLogger(TestFactorial.class.getName());
        
        Factorial f = new Factorial();
        f.setN(10);
        logger.log(Level.INFO, "El numero sin procesar es : {0}", f.getN());
        logger.log(Level.INFO, "El numero procesado es : {0}", f.factorial(f.getN()));
        logger.log(Level.INFO , "{0}", f.toString());
    }
}