package SobrecargaEjemplo;
/**
 *
 * @author Bruno
 */
public class PruebaSobre {
    public static void main(String[] args) {
        DerivSobre dr = new DerivSobre();
        dr.escribe("Cadena constante ", 50);
        dr.escribe("Cadena constante ");
        dr.escribe(50);
    }
}
