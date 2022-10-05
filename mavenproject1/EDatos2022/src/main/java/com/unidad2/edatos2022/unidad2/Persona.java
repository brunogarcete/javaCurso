package com.unidad2.edatos2022.unidad2;

public class Persona {
    
    // Propiedades de la clase persona
    // [Modificador de acceso] [Tipo de dato] [Nombre] 
    protected int cedula;
    protected String nombre;
    protected byte edad;
    protected float peso;

    
    /* Hacer los constructores para corregir errores*/

    public Persona() {
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
