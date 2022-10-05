package arrayobjetos;

public class ArrayObjetos {
    private double suma;
    private double taman;

    public ArrayObjetos() {
    }

    public ArrayObjetos(double suma) {
        this.suma = suma;
    }
    
    public ArrayObjetos(double suma, double taman) {
        this.suma = suma;
        this.taman = taman;
    }
    
    // Metodo que calcula el promedio 
    public double promedio(){
       return ( suma / taman );
    } 

    // Sobrescribe el metodo toString de la clase de objetos
    @Override
    public String toString() {
        return "ArrayObjetos{" + "suma=" + suma + ", taman=" + taman + '}';
    }

   
}
    

