package ejercicio1.entidades;

public class Cancion {

    private String titulo, letra, autor;

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getLetra() {
        return letra;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
