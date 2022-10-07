package practicalistaenlazada;

public class Libro {
    private String nombre;
    private String autor;
    private String isbn;

    public Libro() {
    }

    public Libro(String nombre) {
        this.nombre = nombre;
    }

    public Libro(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
    }

    public Libro(String nombre, String autor, String isbn) {
        this.nombre = nombre;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
