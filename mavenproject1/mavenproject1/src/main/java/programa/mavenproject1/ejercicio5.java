/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author brunei
 */
public class ejercicio5 {
    
    public static boolean boolBisiesto(int anio){
       return (anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)); 
    }
    
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Ingrese el año : ");
        int aaaa = entrada.nextInt();
        
        if (boolBisiesto(aaaa)){
           System.out.println("El año es bisiesto");
        } else {
           System.out.println("El año no es bisiesto"); 
        }
        
        entrada.close();
    }
}
