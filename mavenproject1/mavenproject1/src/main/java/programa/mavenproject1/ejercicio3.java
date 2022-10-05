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
public class ejercicio3 {
    
    public static void semanaDIA(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Escriba el dia de la semana");
        int dia = entrada.nextInt();
        
        do {
            switch (dia) {
                case 1 -> System.out.println("Domingo");
                case 2 -> System.out.println("Lunes");
                case 3 -> System.out.println("Martes");
                case 4 -> System.out.println("Miercoles");
                case 5 -> System.out.println("jueves");
                case 6 -> System.out.println("Viernes");
                case 7 -> System.out.println("Sabado");
                default -> {
                    System.err.println("Number out of range try again");
                    System.out.println("Escriba el dia de la semana");
                    dia = entrada.nextInt();
                }
            }
        }while(!(dia > 0 && 8 >= dia));
        
        entrada.close();
    }
    
    public static void main (String[] args){
        semanaDIA();
    }
}
