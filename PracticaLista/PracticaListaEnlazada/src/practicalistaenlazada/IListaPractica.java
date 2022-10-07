package practicalistaenlazada;

public interface IListaPractica <T> {
    /**
     * Recibe un dato T y crea el primer nodo
     * @param dato 
     */
    void insertarPrimero(T dato);
    
    /**
     * insertar dato [TDA] en la posicion p de la lista
     * @param dato
     * @param pos 
     */
    void insertar(T dato,int pos);
    
    /**
     * suprime el elemento de la posicion [P] de la lista
     * @param pos 
     */
    void suprimir(int pos);
    
    /**
     * suprime el dato de la lista
     * @param dato 
     */
    void suprimir(T dato);
    
    /**
     * devuelve la posicion del dato en la lista
     * @param dato 
     */
    void buscar(T dato);
    
    /**
     * devuelve el dato x que esta en la posicion [ pos ] de la lista
     * @param pos 
     */
    void consultar(int pos);
    
    /**
     * recorre desde el primer nodo hasta el nodo que se encuentra en la posicion [pos]
     * @param pos 
     */
    void recorrer(int pos);
    
    /**
     * Ordena la lista
     * @param nodo 
     */
    void ordenar(Nodo nodo);
}