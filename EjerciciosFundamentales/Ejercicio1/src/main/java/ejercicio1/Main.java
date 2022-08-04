/*  Ejercicio 1)
 *
 *  Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
 *  Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
 *  constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
 *  luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
 *  numero de páginas.
 *
 */

package ejercicio1;

import ejercicio1.entidades.Libro;
import ejercicio1.servicios.ServicioLibro;

public class Main {

    public static void main(String[] args) {
        ServicioLibro sl = new ServicioLibro();
        Libro lb = sl.cargarLibro();
        sl.verInfoLibro(lb);
    }
}
