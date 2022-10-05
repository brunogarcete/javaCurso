
package unidad3.empleados;

import unidad3.practica2.Persona;

/**
 *
 * @author Claudio
 */
public class Empleado extends Persona{
    int sueldo;

    public Empleado() {
    }

    public Empleado(int ced, String nom, int sueldo) {
        //super(ced, nom);
        cedula = ced;   //propiedades con acceso
        nombre = nom;   //protected en la superclase
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return  super.toString() + " Sueldo: " + sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
}
