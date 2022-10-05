package practica;

public class TestPersona {

    Persona p;
    Persona[] p2;
    
    public TestPersona() {
        p   = new Persona();
        p2  = new Persona[5];
        
        System.out.println(p);
        
        for (int i = 0; i < p2.length; i++) {
            p2[i] = new Persona();
        }
        p2[0] = new Persona(1234567,"Juan Perez");
        p2[1] = new Persona(1234568,"Juana Perez",(byte)26,74.2f);
       
        System.out.println(p2[0]);
        System.out.println(p2[1]);
    }
    
    public static void main(String[] args) {
        new TestPersona();
    }
}
