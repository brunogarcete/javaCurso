
package interfaces;

import java.util.Date;

/**
 * interface que define las operaciones comunes a todos 
 * los trabajadores
 * @author Claudio
 */
public interface Trabajador {
    public Date marcarEntrada(); 
    public Date marcarSalida();
    public void trabajar(); 
    public int cobrarSalario();
}
