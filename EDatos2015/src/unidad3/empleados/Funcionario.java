
package unidad3.empleados;
import interfaces.*;
import java.util.Calendar;
import java.util.Date;

public class Funcionario extends Empleado 
        implements Caminante, Trabajador {
    private int beneficio;

    public Funcionario() { }
    
    public Funcionario(int ced, String nom, int suel,
            int beneficio) {
        //super(ced, nom, suel);
        cedula = ced;
        nombre = nom;
        sueldo = suel;
        this.beneficio = beneficio;
    }
    @Override
    public String toString() {
        return super.toString() + " Beneficio: " + 
                beneficio; //To change body of generated methods, choose Tools | Templates.
    }

    public int getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }

    @Override
    public void caminar(int pasos) {
        System.out.println("Funcionario Caminando " + pasos + " pasos");
    }

    @Override
    public void trotar(float km) {
        System.out.println("Funcionario Trotando " + km + "km");
    }

    @Override
    public void correr(float km) {
        System.out.println("Funcionario Corriendo " + km + "km");
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
        System.out.println("Funcionario trabajando");
    }

    @Override
    public int cobrarSalario() {
        return sueldo + beneficio;
    }
    
}
