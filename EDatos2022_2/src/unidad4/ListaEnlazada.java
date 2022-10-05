package unidad4;

import unidad4.Excepciones.DatoInexistente;
import unidad4.Excepciones.ListaVacia;
import unidad4.Excepciones.PosicionIncorrecta;

public class ListaEnlazada<T> implements ILista<T>{

    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int longitud;

    public ListaEnlazada() {
        // Primero = ultimo = null
        // longitud = cero
    }
    
    @Override
    public void insertar(T dato) {
        Nodo<T> aux = new Nodo<>(dato);
        
        if(isEmpty()) {
            primero = ultimo = aux;
        } else {
            ultimo.sigte = aux;
            ultimo = aux;
        }
        longitud++;
    }

    @Override
    public void insertar(T dato, int pos) throws PosicionIncorrecta {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T eliminar() throws ListaVacia {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T eliminar(int pos) throws ListaVacia, PosicionIncorrecta {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(T dato) throws ListaVacia, DatoInexistente {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ordenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T consultar(int pos) throws ListaVacia, PosicionIncorrecta {
        if(isEmpty()) throw new ListaVacia();
        if(pos < 1 || pos > longitud) throw new PosicionIncorrecta("La posicion varia entre 1 y longitud");
        
        for (int i = 0; i < pos; i++) {
            // Se implementa la proxima clase
        }
    }

    @Override
    public int buscar(T dato) throws ListaVacia {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        return getLongitud() == 0;
    }

    @Override
    public int getLongitud() {
        return longitud;
    }
       
}
