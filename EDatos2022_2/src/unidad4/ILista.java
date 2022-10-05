package unidad4;

import unidad4.Excepciones.DatoInexistente;
import unidad4.Excepciones.ListaVacia;
import unidad4.Excepciones.PosicionIncorrecta;

public interface ILista <T> {
    /**
     * Inserta el dato que se encuentra al frente de la lista
     * @param dato 
     */
    public void insertar(T dato);
    // Tarea
    public void insertar(T dato, int pos) throws PosicionIncorrecta;
    
    /**
     * Elimina el dato que se encuentra al frente de la lista 
     * @return el dato eliminado
     * @throws ListaVacia lanza ListaVacia si la lista no tiene elementos
     */
    public T eliminar() throws ListaVacia;
    public T eliminar(int pos) throws ListaVacia, PosicionIncorrecta;
    public void eliminar(T dato) throws ListaVacia, DatoInexistente;
    // Tarea
    public void ordenar();
    public T consultar(int pos) throws ListaVacia, PosicionIncorrecta;
    /**
     * Busca el dato dentro de la lista si tiene
     * @param dato
     * @return
     * @throws ListaVacia 
     */
    public int buscar (T dato) throws ListaVacia;
    public boolean isEmpty ();
    public int getLongitud();
}
