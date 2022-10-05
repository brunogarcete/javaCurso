/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.util.Scanner;
import javax.swing.JOptionPane;
import unidad2.Persona;

/**
 *
 * @author cbaru
 */
public class MainPolimorfismo {
    Persona p[];
    Alumno a;
    Profesor pf;
    public MainPolimorfismo() {
        p = new Persona[3];
        p[0] = new Alumno(5632146, "Ramona Vera"); 
        //p[0].setCedula(123456);   //se puede leer por teclado
        //p[0].setNombre("Juan Perez");
        //System.out.println(p);
        Scanner sc = new Scanner(System.in);
        int ced = sc.nextInt();
        String nom = JOptionPane.showInputDialog("Ingrese el nombre");
        a = new Alumno(ced, nom);
        p[1] = a;
        pf = new Profesor(852369, "Pedro Acosta");
        p[2] = pf;
        for (int i = 0; i < p.length; i++) {
            //System.out.println(p[i].toString());
            //System.out.println(p[i].comer("Milanesa", 250));
            procesar(p[i]);
        }
        
    }
    private void procesar(Persona p) {
        System.out.println(p);
        System.out.println(p.comer("Milanesa", 250));
    }
    
    public static void main(String[] args) {
        new MainPolimorfismo();
    }
    
}
