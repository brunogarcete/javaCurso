package piece;
import javax.swing.JOptionPane;
/**
 *  clase piece para la prueba de los modificadores de acesso
 * @author brunei
 */
public class Piece implements Ipiece{
    int dato;

    public Piece(int dato) {
        this.dato = dato;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    
    
    @Override
    public void imprime() {
       JOptionPane.showMessageDialog(null, "Este es un dato visible o no "+getDato());
    }
    
}
