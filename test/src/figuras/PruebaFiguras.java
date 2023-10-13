package figuras;

/**
 *
 * @author Bruno
 */
public class PruebaFiguras {
    public static void main(String[] args) {
        Circulo cr = new Circulo(2.0 ,2.5, 2.0);
        Cuadrado cd = new Cuadrado(3.0, 3.5, 4.37, 3.85); 
        
        System.out.println("Centro del circulo : ");
        cr.imprimirCentro();
        
        System.out.println("Centro del cuadrado : ");
        cd.imprimirCentro();
        
        System.out.println("Area del circulo : " + cr.area());
        System.out.println("Area del cuadrado" + cd.area());
    }
}
