package unidad4;

import unidad4.Excepciones.ListaVacia;
import unidad4.Excepciones.PosicionIncorrecta;

public class MainLista {
    ListaEnlazada <String> lista;
    
    
    public MainLista() {
        lista = new ListaEnlazada<>();
        lista.insertar("Hola");
        
        try{
            System.out.println(lista.consultar(1));
        } catch (ListaVacia | PosicionIncorrecta exc){
            System.out.println(exc.getMessage());
        }
    }
    public static void main(String[] args) {
        new MainLista();
    }
}
