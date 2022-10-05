
package unidad2;

/**
 * Definicion de la subclase Empleado que hereda de Persona
 * @author Claudio
 */
public abstract class Empleado extends Persona implements Trabajador, Caminante {
    protected int sueldo;
    public static final int SALARIO_MINIMO = 1824000;
    
    public abstract int calcularSalario();
    
    public Empleado() {
        super();    
    }

    public Empleado(int ced, String nom, String ape, 
            byte e, int sueldo) {
        super(ced, nom, ape, e); //setCedula(ced), etc
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + " Sueldo: " + sueldo;
    }
    
}
