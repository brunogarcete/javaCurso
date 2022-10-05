
package polimorfismo;

import java.awt.Graphics;

/**
 *
 * @author cbaru
 */
public abstract class FiguraGeometrica implements Dibujable {
      public abstract float calcularArea();
}

class Cuadrado extends FiguraGeometrica {
    private float lado;

     public float calcularArea() {
         return lado * lado;
     }

    @Override
    public void dibujar(Graphics g) {
        //algun proceso donde dibuje en pantalla
    }
     
     
}