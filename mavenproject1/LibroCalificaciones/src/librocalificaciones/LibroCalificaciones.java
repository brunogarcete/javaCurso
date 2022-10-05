package librocalificaciones;
// importando librerias para usar logger
import java.util.logging.Level;
import java.util.logging.Logger;

public class LibroCalificaciones {

    public LibroCalificaciones() {
        
    }
    
    public void LIBROCALIFICACIONES(){
    
    }

    @Override
    public String toString() {
        return "LibroCalificaciones{" + '}';
    }
    
    
    
    public void mostrarMensaje(String nombreDelCurso){
        Logger logger = Logger.getLogger(LibroCalificaciones.class.getName());
        logger.log(Level.INFO, "Bienvenido al libro de calificaciones del curso {0}", nombreDelCurso);
    }
}