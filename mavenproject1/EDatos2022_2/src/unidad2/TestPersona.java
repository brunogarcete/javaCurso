
package unidad2;

/**
 *
 * @author cbaru
 */
public class TestPersona { //begin class
    Persona p, p2[];
    Empleado e;
    public TestPersona() {
        e = new Gerente(123456, "Juan Perez", 5000000, "Produccion", 4000000);
        e.setEdad(30);
        //procesar(e);
        System.out.println(e.toString());
        Gerente g = new Gerente(234567, "Ramona Vazquez", 4000000, "Ventas", 5000000);
        procesar(g);
     /*
       p = new Persona();
       p.edad = 10;
       p2 = new Persona[5];
       System.out.println(p);
        for (int i = 0; i < p2.length; i++) {    
            p2[i] = new Persona();
        }
        p2[0] = new Persona(1234567, "Juan Perez");
        p2[1] = new Persona(1235555, "Luisa Acosta", (byte)28, 70.5f);
        p2[0].setEdad(24);
        p.setEdad((byte)30);
        p.setNombre("Alipio Alvarenga");
        p.setPeso(60);
        p.setCedula(852369);
        //p.comer("Lasagna", 300);
        System.out.println(p);
        //p2[3].setEdad((byte)20);
        System.out.println(p2[0]);
        System.out.println(p2[1]);
        */
    }
    
    public static void main(String[] args) {
        new TestPersona();
    }

    private void procesar(Empleado e) {
        System.out.println(e.toString());
        //e.algo();
    }
} //end class