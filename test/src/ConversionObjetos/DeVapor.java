/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConversionObjetos;

/**
 *
 * @author Bruno
 */
public class DeVapor extends Barco{
    public DeVapor(){
        System.out.println("Se crea la parte del barco de vapor. ");
    }
    
    @Override
    public void alarma(){
        System.out.println("\tS.O.S desde un barco de Vapor ");
    }
}