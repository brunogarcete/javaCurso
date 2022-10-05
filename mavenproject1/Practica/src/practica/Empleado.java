package practica;

public abstract class Empleado extends Persona implements Trabajador{
    
    public static final int SALARIO_MINIMO = 2300000;
    protected int salario; 
    protected String departamento; 
    
    
    
    
    protected Empleado() {
        super();
    }

    protected Empleado(int cedula, String Nombre,int salario) {
        super(cedula, Nombre);
        this.salario = salario;
        departamento = "Ventas";
    }

    protected Empleado(int cedula, String Nombre, int Estatura, byte Edad, int peso,int salario
            , String departamento ) {
        super();
        this.salario = salario;
        this.departamento = departamento;
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
    public String toString() {
        return "Empleado{" + super.toString() + 
                "\nSalario = " + salario + ", Departamento = " + departamento + '}';
        
    }

}
