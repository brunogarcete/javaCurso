package SobrecargaEjemplo;
/**
 *
 * @author Bruno
 */
public class DerivSobre extends BaseSobre{
    public void escribe(String a, int n){
        System.out.println("Metodo de la clase derivada, dos argumentos: ");
        System.out.println(a + " " + n);
    }
}
