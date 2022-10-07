package practicalistaenlazada;

public class Nodo <T> {
        T dato;
        Nodo siguiente;

    public Nodo() {
    }

    public Nodo(T dato) {
        this.dato = dato;
    }
        
    public Nodo(T dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
}
