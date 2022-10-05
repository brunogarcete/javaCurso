/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package programa.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Bruno Garcete : 5378939
 * 
 */
public class ejercicio1 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Tabla de ? :");
        int tabla = entrada.nextInt();
        
        for(int i = 1; i <= 12; i++){
            if(i < 10) {
                System.out.printf("%d x 0%d = %d\n",tabla,i,(tabla*i));
            } else {
                System.out.printf("%d x %d = %d\n",tabla,i,(tabla*i));
            }
        
        }
        
        entrada.close();
    }
}
