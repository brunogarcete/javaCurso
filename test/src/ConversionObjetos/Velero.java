/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConversionObjetos;

/**
 *
 * @author Bruno
 */
public class Velero extends Barco{

    public Velero() {
        System.out.println("Se crea la parte del velero. ");
    }
    
    @Override
    public void alarma(){
        System.out.println("\tS.O.S desde un Velero");
    }
}