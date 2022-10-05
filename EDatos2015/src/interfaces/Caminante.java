
package interfaces;

/**
 * Interface que define operaciones comunes a todos los
 * caminantes
 * @author Claudio
 */
public interface Caminante {
    public void caminar(int pasos); 
    public void trotar(float km); 
    public void correr(float km);
}
