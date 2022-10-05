package unidad2;

public class Gerente extends Empleado {
    private int sobreSueldo;
    //private Empleado[] empleadosACargo;
    
    public Gerente() {
        //empleadosACargo = new Empleado[10];
        //salario = 3000000;
    }

    public Gerente(int cedula, String nombre, int salario, String dpto, 
            int sobreSueldo) {
        super(cedula, nombre, salario);
        departamento = dpto;
        this.sobreSueldo = sobreSueldo;
    }

    public Gerente(int ced, String nom, byte edad, float peso, 
            int salario, String departamento, int sobreSueldo) {
        super(ced, nom, edad, peso, salario, departamento);
        this.sobreSueldo = sobreSueldo;
    }

    @Override
    public String comer(String comida, float cant) {
        return "Gerente comiendo en el restaurant: "+ cant +"grs de "+ comida;
    }

    @Override
    public int calcularSalario() {
        return Math.round((salario + sobreSueldo) * 0.91f);   //se descuenta 9% para IPS
    }

    @Override
    public String cobrarSalario() {
        return "Gerente cobrando en cheque: " + calcularSalario();
    }

    @Override
    public String trabajar() {
        return "Gerenciando la empresa...";
    }

    @Override
    public String toString() {
        return "Gerente{ " + super.toString() + 
               "\nSobre Sueldo: " + Utilidades.formatearNumero(sobreSueldo) + '}';
    }

    public int getSobreSueldo() {
        return sobreSueldo;
    }

    public void setSobreSueldo(int sobreSueldo) {
        this.sobreSueldo = sobreSueldo;
    }
}
