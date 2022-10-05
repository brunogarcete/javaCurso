
package unidad3.aplicacion;

import interfaces.Caminante;
import interfaces.Trabajador;
import unidad3.empleados.Empleado;
import unidad3.empleados.Funcionario;
import unidad3.empleados.Gerente;

public class TestInterfaces {

    public TestInterfaces() {
        Funcionario f = new Funcionario(123456,
                "Juan", 2000000, 100000);
        mostrarDatos(f);
        probarCaminante(f);
        probarTrabajador(f);
        Gerente g = new Gerente(666456,
                "Luis", 5000000, 1000000);
        mostrarDatos(g);
        probarCaminante(g);
        probarTrabajador(g);
        
    }
    
    void mostrarDatos(Empleado e) {
        System.out.println( e.toString() );
    }
    
    void probarTrabajador (Trabajador t) {
        System.out.println("Entrada: " +
                t.marcarEntrada() );
        t.trabajar();
        System.out.println("Salario: " +
        t.cobrarSalario() );
        System.out.println("Salida: " +t.marcarSalida() );
    }
    void probarCaminante(Caminante c) {
        c.caminar(100);
        c.trotar(10);
        c.correr(2);
    }
    public static void main(String[] args) {
        new TestInterfaces();
    }
}
