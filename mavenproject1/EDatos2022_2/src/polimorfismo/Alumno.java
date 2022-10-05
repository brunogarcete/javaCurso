/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import unidad2.Persona;

/**
 *
 * @author cbaru
 */
public class Alumno extends Persona {
    public String institucion;
    
    public Alumno(int cedula, String nombre) {
        super(cedula, nombre);  //constructor de la superclase
    }
    
    @Override
    public String comer(String comida, float cant) {
        return "Alumno comiendo "+cant + "grs de "+comida;
    }

    @Override
    public String toString() {
        return "Alumno " + super.toString() + "  " + institucion; //To change body of generated methods, choose Tools | Templates.
    }
    
}
