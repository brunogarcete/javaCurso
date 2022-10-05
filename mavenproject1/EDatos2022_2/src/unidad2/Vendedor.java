package unidad2;

/**
 *
 * @author cbaru
 */
public class Vendedor extends Empleado{
    private int ventas;
    private float comision;  //en %
    public Vendedor() {
    }
    @Override
    public int calcularSalario() {
        return Math.round((salario + calcularComision()) * 0.91f);
    }
    public int calcularComision() {
        return Math.round((ventas * comision) / 100);
    }
    @Override
    public String comer(String comida, float cant) {
       return "Vendedor comiendo por la calle " + cant + " grs de " + comida;
    }
    @Override
    public String cobrarSalario() {
        return "Vendedor cobra con tarjeta: " + calcularSalario();
    }
    @Override
    public String trabajar() {
        return "Vendiendo productos";
    }
    @Override
    public String toString() {
        return "Vendedor{" + super.toString() + 
               "\nVentas: " + ventas + ", Comision: " + comision + '}';
    }
    public Vendedor(int cedula, String nombre, int salario,
            int ventas, float comision ) {
        super(cedula, nombre, salario);
        departamento = "Ventas";
        this.ventas = ventas;
        this.comision = comision;
    }

    public Vendedor(int ced, String nom, int edad, float peso, 
            int salario, int ventas, float comision ) {
        super(ced, nom, (byte)edad, peso, salario, "Ventas");
        this.ventas = ventas;
        this.comision = comision;
    }
    
    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }
    
    
}
