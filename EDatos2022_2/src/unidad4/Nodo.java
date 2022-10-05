/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad4;

/**
 *
 * @author HP
 */
public class Nodo <T> {
    T dato;
    Nodo<T> sigte;

    public Nodo() {
    }

    public Nodo(T dato) {
        this.dato = dato;
    }

    public Nodo(T dato, Nodo<T> sigte) {
        this.dato = dato;
        this.sigte = sigte;
    }
    
    
}
