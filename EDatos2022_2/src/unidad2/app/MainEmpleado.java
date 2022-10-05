
package unidad2.app;

import unidad2.Empleado;
import unidad2.Gerente;

/**
 *
 * @author cbaru
 */
public class MainEmpleado {
    Empleado e[];
    public MainEmpleado() {
        e = new Empleado[4];
        e[0] = new Gerente();
        e[0].setCedula(1234567);
        System.out.println(e[0]);
    }

    public static void main(String[] args) {
        new MainEmpleado();
    }    
}
