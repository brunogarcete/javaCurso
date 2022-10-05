public class Persona 
{
private int cedula;
private String nombre;
private String apellido;

  public Persona(int c){
    setCedula(c);
    nombre = new String("Desconocido");
    apellido = new String("Desconocido");
  }
  
  public Persona(int c, String n, String a)
  {
     setCedula(c);
     setNombre(n);
     setApellido(a);
  }

  public void setCedula(int c) {
     if (c > 0) cedula = c;
     else c = 0;   //pida la cedula en una cuadro de dialogo
  }

  public void setNombre(String n) {
     if (n.equals(""))   //si esta mal nombre
     {
       System.out.println("Nombre no valido, se asignó Desconocido");
       nombre = "Desconocido";
     }
     else nombre = n;
  }
  public void setApellido(String a) {
     if (a.equals(""))  //si esta mal apellido
     {
       System.out.println("Apellido no valido, se asignó Desconocido");
       apellido = new String("Desconocido");
     }
     else apellido = a;
  }  
  public int getCedula(){ return cedula; }
  public String getNombre(){ return nombre; }
  public String getApellido(){ return apellido; }
  
  public void comer(){
     System.out.println("Comiendo...");
  }
  
  public void dormir(){
     System.out.println("Durmiendo...");
  }
  
  public String toString() {
     return nombre + " " + apellido + ", Cedula: " + cedula;
  }
}
