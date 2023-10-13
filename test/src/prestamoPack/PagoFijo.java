package prestamoPack;
/**
 *
 * @author Bruno
 */
public class PagoFijo extends Prestamo{
    private float pago;


    /**
     * Constructor de la clase PagoFijo, subclase de la superclase Prestamo, es decir PagoFijo es-un tipo de Prestamo
     * @param x pago
     * @param v capital
     * @param t tasaInteres
     */
    public PagoFijo(float x, float v, float t) {
       this.pago = x;
       super.prestamo(v, t);
    }
    
    @Override
    public int crearTablaPagos(float[][] mat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
