package figuras;
/**
 *
 * @author Bruno
 */
public class ObjGeometrico {
    protected double px;
    protected double py;
    
    public ObjGeometrico(double x, double y){
        px = x;
        py = y;
    }
    
    public ObjGeometrico(){ px = py = 0; }
    
    public void imprimirCentro(){
        System.out.println("(" + px + "," + py + ")");
    }
}