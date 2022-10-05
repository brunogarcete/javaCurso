package unidad4.Excepciones;
public class PosicionIncorrecta extends Exception{

    public PosicionIncorrecta() {
        super("La Posicion es incorrecta");
    }

    public PosicionIncorrecta(String message) {
        super(message);
    }
}
