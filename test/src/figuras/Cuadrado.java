/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author Bruno
 */
public class Cuadrado extends ObjGeometrico{
        private double x1;
        private double y1;
    
    public Cuadrado(double xc, double yc, double t1, double t2){
        super(xc,yc);
        this.x1 = t1;
        this.y1 = t2;
    }
    
    public double area(){
        double a, b;
        
        a = px - x1;
        b = py - y1;
        
        return  2 * ( Math.pow(a,2) + Math.pow(b,2) );
    }
}
