/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa.mavenproject1;

/**
 *
 * @author brunei
 */
public class ejercicio2 {
    
    public static double division(double x, double y){
        return (x/y);
    }
    
    
    public static void main(String[] args){
        double a = 3;
        double b = 2;
        
        double c = (double) division(a, b);
        System.out.printf("La division de %.1f entre %.1f es %.1f\n",a,b,c);
    }
}
