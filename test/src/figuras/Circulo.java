/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

import static java.lang.Math.*;

/**
 *
 * @author Bruno
 */
public class Circulo extends ObjGeometrico{
    private double radio;

    public Circulo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }
    
    public double area(){
        return (Math.PI * pow(radio,2));
    }
}
