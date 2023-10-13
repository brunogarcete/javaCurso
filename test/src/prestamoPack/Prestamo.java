package prestamoPack;
/**
 *
 * @author Bruno
 */
public abstract class Prestamo {
    final int MAXTERM = 22;
    protected float capital;
    protected float tasaInteres;
    /**
     * Constructor de la clase abstracta Prestamo que a su vez es clase base para heredar.
     * @param p capital
     * @param r tasaInteres
     */
    public void prestamo(float p, float r){
        this.capital = p;
        this.tasaInteres = r;
    }
    public abstract int crearTablaPagos(float mat[][]);
    
}
