package unidad2;

public class TestPersona
{ 
    public TestPersona()
    {
        probarPersona();
        probarEmpleado();
    }

    public static void main(String[] args) {
        new TestPersona();
    }

    private void probarPersona() {
        //Caminante c = new Persona();
        //c.correr();
        Persona p = new Persona();
        System.out.println(p);
        p.setCedula (1123234);
        p.setNombre("Luisa");
        p.setApellido("Acosta");
        p.setEdad((byte)24); 
        System.out.println(p.toString());
        
        Persona p1 = new Persona(123456, "Juan", "Vera", 
                (byte)34);
        System.out.println(p1);
    }

    private void probarEmpleado() {
        /*Empleado e = new Jefe();
        System.out.println(e);
        Empleado e1 = new Empleado(12345678, "Ruben", 
                "Aquino", (byte)25, 2000000);
        System.out.println(e1);
        */
    }

    
}
