
package unidad3;

/**
 *
 * @author Claudio
 */
public class Vendedor extends unidad2.Empleado {
    private int montoVendido;
    private float comision;     //% de comision
    public static final float COMISION_MINIMA =2.5f;

    public Vendedor() {
    }

    public Vendedor(int ced, String nom, String ape, byte e,
             int sueldo, int montoVendido, float comision) {
        super(ced, nom, ape, e, sueldo);
        setMontoVendido(montoVendido);
        setComision(comision);
    }
    
    public int getMontoVendido() {
        return montoVendido;
    }

    public void setMontoVendido(int monto) {
        if (monto < 0) monto = 0;
        this.montoVendido = monto;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        //validar que comision no sea menor al minimo
        this.comision = comision;
    }
    
    @Override
    public int calcularSalario() {
        int comision = (int)(montoVendido*this.comision/100);
        return (int)((sueldo + comision) * 0.75);
    }

    @Override
    public String toString() {
        return "Vendedor{" + super.toString() + 
                " monto vendido=" + montoVendido +
                ", comision=" + comision + '}';
    }
    
}
