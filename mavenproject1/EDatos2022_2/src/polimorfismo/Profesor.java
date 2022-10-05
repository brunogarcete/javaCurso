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
public class Profesor extends Persona {

    public Profesor(int cedula, String nombre) {
        super(cedula, nombre);
    }

    @Override
    public String comer(String comida, float cant) {
        return "Profesor comiendo "+cant + "grs de "+comida;
    }

    @Override
    public String toString() {
        return "Profesor " + super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
