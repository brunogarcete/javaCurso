package PuntoPack;
/**
 *
 * @author Bruno
 */
public class Punto3D extends Punto{
    private int z;
    
    Punto3D(){
        fijarZ(0);
    }
    
    public Punto3D(int x1, int y1, int z1){
        super(x1,y1);
        fijarZ(z1);
    }
    
    public void fijarZ(int z){
        this.z = z;
    }
}
