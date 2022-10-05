package practica;

public class Persona {
    
    private int cedula;
    private String nombre;
    private byte edad;
    private float peso;

    public Persona() {
    }

    public Persona(int cedula) {
        this.cedula = cedula;
    }

    public Persona(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public Persona(int cedula, String nombre, byte edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(int cedula, String nombre, byte edad, float peso) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
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

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + '}';
    }
    
} /* end of class*/
