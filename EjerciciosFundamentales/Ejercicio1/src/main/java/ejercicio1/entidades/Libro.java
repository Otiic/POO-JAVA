package ejercicio1.entidades;

public class Libro {

    private int ISBN, num_pags;
    private String titulo, autor;

    public Libro() {
    }

    public Libro(int ISBN, int num_pags, String titulo, String autor) {
        this.ISBN = ISBN;
        this.num_pags = num_pags;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getNum_pags() {
        return num_pags;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setNum_pags(int num_pags) {
        this.num_pags = num_pags;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", num_pags=" + num_pags + ", titulo=" + titulo + ", autor=" + autor + '}';
    }
}
