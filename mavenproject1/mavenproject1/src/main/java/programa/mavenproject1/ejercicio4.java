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
public class ejercicio4 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Ingrese su edad : ");
        int edad = entrada.nextInt();
        if (edad == 37){
            System.out.printf("Felicidades... cumples la condicion de tener 37 años\n");
        } else {
            System.out.printf("No cumples la condicion de tener 37 años\n");
        }
        entrada.close();
    }
}
