package unidad2;

/**
 * Clase Persona (TDA), que define a todas las personas en general
 * @author cbaru
 */
public abstract class Persona {
    protected int cedula;
    protected String nombre;
    protected byte edad;
    protected float peso;

    public abstract String comer(String comida, float cant);
    
    public Persona() {
    }

    public Persona(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        edad = 21;
    }
    
    public Persona(int ced, String nom, byte edad, float peso) {
        cedula = ced;
        nombre = nom;
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

    public void setEdad(int edad) {
        this.edad = (byte)edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    //unidad2.Persona@1234ABCD
    @Override
    public String toString() {
        return  "Cedula: " + cedula + " " + nombre + ", " + edad + " anhos, Peso: " + peso + " k.";
    }
    
}//end class
