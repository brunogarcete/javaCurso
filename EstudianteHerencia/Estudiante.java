public abstract class Estudiante extends Persona 
{
  private int nota;
  
  public Estudiante (int ced, int nota) {
    super(ced);
    setNota(nota);
  }
  
  public Estudiante(int ced, String n, String apellido, int nota)
  {
     super(ced, n, apellido);
     setNota(nota);
  }
  
  public void setNota(int nota) {
    //validar
		if (nota < 0 || nota > 5) { 
		  System.out.println("La nota debe estar entre 1 y 5. Se asignó 0");
			this.nota = 0;
		}
		else this.nota = nota;
  }
	
  public int getNota() { return nota; }
  
  public abstract void estudiar();
  
  public void darExamen() {
    System.out.println("Dando examen...");
		nota = (int) Math.round(Math.random() * 5);
  }
  
  public String toString() {
     return "Estudiante " + super.toString() + ", Nota: " + nota;
  }
  
}
