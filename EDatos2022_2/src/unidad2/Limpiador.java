package unidad2;

/**
 *
 * @author cbaru
 */
public class Limpiador extends Empleado {
    private int montoHora;
    private float cantHoras;

    public Limpiador() {
    }

    public Limpiador(int cedula, String nombre,
            int montoHora, float cantHoras ) {
        super(cedula, nombre, (int)(montoHora * cantHoras));
        this.montoHora = montoHora;
        this.cantHoras = cantHoras;
    }
    public Limpiador(int ced, String nom, int edad, float peso,
            int montoHora, float cantHoras ) {
        super(ced, nom, (byte)edad, peso, (int)(montoHora * cantHoras), 
                "Mantenimiento");
        this.montoHora = montoHora;
        this.cantHoras = cantHoras;
    }
    @Override
    public String toString() {
        return "Limpiador{" + super.toString() + 
               "\nMontoHora: " + montoHora + ", Horas Trab: " + cantHoras + '}';
    }

    @Override
    public int calcularSalario() {
        return Math.round((cantHoras * montoHora) * 0.91f);
    }

    @Override
    public String comer(String comida, float cant) {
       return "Limpiado comiendo " + cant + " grs de " + comida;
    }
    @Override
    public String cobrarSalario() {
        return "Limpiador cobra en Gs: " + calcularSalario();
    }
    @Override
    public String trabajar() {
        return "Limpiando las oficinas";
    }    
    
    public int getMontoHora() {
        return montoHora;
    }

    public void setMontoHora(int montoHora) {
        this.montoHora = montoHora;
    }

    public float getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(float cantHoras) {
        this.cantHoras = cantHoras;
    }
    
}
