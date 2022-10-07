package practicalistaenlazada;

public class Lista <T> implements IListaPractica <T> {
    Nodo<T> primero;
    Nodo<T> ultimo;
    int longitud;

    public Lista() {
    }

    public Lista(Nodo<T> primero) {
        this.primero = primero;
    }

    public Lista(Nodo<T> primero, Nodo<T> ultimo) {
        this.primero = primero;
        this.ultimo = ultimo;
    }

    public Lista(Nodo<T> primero, Nodo<T> ultimo, int longitud) {
        this.primero = primero;
        this.ultimo = ultimo;
        this.longitud = longitud;
    }
    
    public void insertarPrimero(T dato) {
        Nodo<T> nodo = new Nodo<>(dato);
        nodo.siguiente = null;
        primero = nodo;
        ultimo  = nodo;
    }
    
    @Override
    public void insertar(Object dato, int pos) {
        
    }

    @Override
    public void suprimir(int pos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void suprimir(Object dato) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void buscar(Object dato) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void consultar(int pos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void recorrer(int pos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ordenar(Nodo nodo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
}
