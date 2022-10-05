
package unidad2;

import unidad2.Empleado;
import unidad2.Trabajador;

public class MainEmpleado { //begin class
    Trabajador T;
    Gerente g;
    Empleado[] emp;
    
    public MainEmpleado() {
        emp = new Empleado[3];
        g= new Gerente(612312,"Juan Perez", 500000, "Produccion",Empleado.SALARIO_MINIMO*2);
        emp[0]= g;
        emp[1]= new Limpiador(213123,"Lucia Albarenga",2000,125);
        emp[2]= new Vendedor(123123,"Pepe Perez", 1231231,5000000,2.5f);
        for (Empleado e : emp){
            procesar(e); 
        }
        
    }
    
    private void imprimirTrabajador (Trabajador t){
        System.out.println(t.marcarEntrada());
        System.out.println(t.trabajar());
        System.out.println(t.cobrarSalario());
        System.out.println(t.marcarSalida());
    }
    
    
    private void procesar (Empleado e){
        System.out.println(e);
        imprimirTrabajador(e);
        /*System.out.println(e.marcarEntrada());
        System.out.println(e.trabajar());
        System.out.println(e.cobrarSalario());
        System.out.println(e.marcarSalida());
        if(e instanceof Vendedor)System.out.println("Ventas: " + ((Vendedor)e).getVentas());
        System.out.println("---------------------------");*/
    }
    
    public static void main(String[] args) {
        new MainEmpleado();
    }
    
} //end class