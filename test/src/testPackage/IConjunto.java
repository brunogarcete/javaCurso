/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package testPackage;

/**
 * Especificacion informal del TAD Conjunto (
 *  Coleccion de elementos sin duplicidades, pueden estar en cualquier orden, se usa para
 *  representar los conjuntos matematicos con sus operaciones.
 * )
 * @author Bruno
 * @param <T>
 */
public interface IConjunto<T> {
    /**
     * Instancia un conjunto vacio
     * @return Un T Conjunto vacio
     */
    public T conjuntoVacio();
    /**
     * Analiza si el conjunto es vacio
     * @param conjunto
     * @return conjunto.equals(null)
     */
    public boolean esVacio(T conjunto);
    /**
     * Comprueba si el elemento forma parte del conjunto; en caso negativo, añadido. La operacion modifica al conjunto
     * @param conjunto
     * @param elemento
     * @return nuevoConjunto 
     */
    public T AñadirUnElemento(T conjunto,T elemento);
    public T retirarUnElemento();
    public T unionConjuntos();
    public T interseccionConjuntos();
}
