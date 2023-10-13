package SobrecargaEjemplo;
/**
 *
 * @author Bruno
 */
public class BaseSobre {
    public void escribe(int k){
        System.out.println("Metodo clase base, argumento entero: ");
        System.out.println(k);
    }
    
    public void escribe(String a){
        System.out.println("Metodo clase base, argumento cadena: ");
        System.out.println(a);
    }
}