
package unidad3.practica2;

/**
 *
 * @author Claudio
 */
public abstract class Persona {
    protected int cedula;
    protected String nombre;

    public Persona() {
        nombre = "NN";
    }
    
    public Persona(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "CI: " + cedula + ", Nombre: " + nombre;
    }
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
