package practica;

import java.util.Date;

/**
 *
 * @author pyroubuntu
 */
public class Gerente extends Empleado {
    private int sobreSueldo;
    //Agregar Constructores,Setter y Getter , ToString, y luego implementar los metodos abstractos

    public Gerente() {
        
    }

    public Gerente(int sobreSueldo, int cedula, String Nombre, int salario) {
        super(cedula, Nombre, salario);
        this.sobreSueldo = sobreSueldo;
    }

    public Gerente(int cedula, String Nombre, int Estatura, byte Edad, int peso, int salario, String departamento,int sobreSueldo) {
        super(cedula, Nombre, Estatura, Edad, peso, salario, departamento);
        this.sobreSueldo = sobreSueldo;
    }

    public int getSobreSueldo() {
        return sobreSueldo;
    }

    public void setSobreSueldo(int sobreSueldo) {
        this.sobreSueldo = sobreSueldo;
    }

    @Override
    public String toString() {
        return "Gerente{" +super.toString()+"\nsobreSueldo=" + sobreSueldo + '}';
    }
    
    
    //

    public String comer(String comida, float cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int calcularSalario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String cobrarSalario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Date marcarEntrada() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Date marcarSalida() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
