package unidad2;

import java.util.Date;

/**
 *
 * @author cbaru
 */
public interface Trabajador {
    //public static final int SALARIO_MINIMO = 2500000;
    public int calcularSalario();
    public String cobrarSalario();
    public String trabajar();
    public Date marcarEntrada();
    public Date marcarSalida();    
}
