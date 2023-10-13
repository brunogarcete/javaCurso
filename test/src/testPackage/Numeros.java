package testPackage;
/**
 * Numeros es-un tipo de conjunto
 * Ejemplo de herencia o relacion es-un
 * @author Bruno
 */
public class Numeros extends Conjunto{
    private int[] numero;

    public Numeros(int[] numero, int cardinalidad) {
        super(cardinalidad);
        this.numero = numero;
    }
    
    public Numeros(int cardinalidad) {
        super(cardinalidad);
    }
    
}
