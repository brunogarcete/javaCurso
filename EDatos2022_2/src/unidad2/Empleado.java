package unidad2;

import java.util.Date;

/**
 *
 * @author cbaru
 */
public abstract class Empleado extends Persona implements Trabajador {
    public static final int SALARIO_MINIMO = 2300000;
    protected int salario;
    protected String departamento;

    public Empleado() {
        //super();
    }

    public Empleado(int cedula, String nombre, int salario) {
        super(cedula, nombre);
        this.salario = salario;
        departamento = "Ventas";
    }

    public Empleado(int ced, String nom, byte edad, float peso, 
            int salario, String departamento) {
        super(ced, nom, edad, peso);
        this.salario = salario;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nSalario: " + Utilidades.formatearNumero(salario) + ", Dpto: " + departamento;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
      
    @Override
    public Date marcarEntrada() {
        return new Date();
    }

    @Override
    public Date marcarSalida() {
        return new Date();
    }
}
