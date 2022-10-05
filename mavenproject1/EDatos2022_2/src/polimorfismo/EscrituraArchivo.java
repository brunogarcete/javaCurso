/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author cbaru
 */
public class EscrituraArchivo {
    public static void main(String[] args) {

		// Fichero del que queremos leer
		      File fichero = new File("fichero_leer.txt");
                       Scanner s = null;

		try {
			// Leemos el contenido del fichero
			System.out.println("... Leemos el contenido del fichero ...");
			s = new Scanner(fichero);

			// Leemos linea a linea el fichero
			while (s.hasNextLine()) {
				String linea = s.nextLine(); 	// Guardamos la linea en un String
				System.out.println(linea);      // Imprimimos la linea
			}

		} catch (IOException ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
				  s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
	}
}
