
package unidad3.empleados;

import interfaces.Caminante;
import interfaces.Trabajador;
import java.util.Calendar;
import java.util.Date;

public class Gerente extends Empleado 
        implements Caminante, Trabajador{
    private int responCargo;
    public Gerente() { }
    public Gerente(int ced, String nom, int suel,
            int responCargo) {
        //super(ced, nom, sueldo);
        cedula = ced;  //protected en Persona
        nombre = nom;  //protected en Persona
        sueldo = suel; //friendly en Empleado
        this.responCargo = responCargo;
    }

    @Override
    public String toString() {
        return super.toString() + 
                " Adicional por responsab. "+ responCargo;
    }

    public int getResponCargo() {
        return responCargo;
    }

    public void setResponCargo(int responCargo) {
        this.responCargo = responCargo;
    }

    @Override
    public void caminar(int pasos) {
       System.out.println("Gerente Caminando " + pasos + " pasos");
    }

    @Override
    public void trotar(float km) {
        System.out.println("Gerente trotando " + km + "km");
    }

    @Override
    public void correr(float km) {
        System.out.println("Gerente corriendo " + km + "km");
    }

    @Override
    public Date marcarEntrada() {
        Calendar c = Calendar.getInstance();
        return c.getTime();
    }

    @Override
    public Date marcarSalida() {
        Calendar c = Calendar.getInstance();
        return c.getTime();
    }

    @Override
    public void trabajar() {
        System.out.println("Gerente trabajando");
    }

    @Override
    public int cobrarSalario() {
        return sueldo + responCargo;
    }
    
}
