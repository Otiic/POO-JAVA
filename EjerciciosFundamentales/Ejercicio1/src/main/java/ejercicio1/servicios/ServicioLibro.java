package ejercicio1.servicios;

import ejercicio1.entidades.Libro;
import java.util.Scanner;

public class ServicioLibro {
    
    public Libro cargarLibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro lb = new Libro();
        
        System.out.println("> Ingrese el ISBN del libro:");
        lb.setISBN(leer.nextInt());
        
        System.out.println("> Ingrese el numero de paginas del libro:");
        lb.setNum_pags(leer.nextInt());
        
        System.out.println("> Ingrese el titulo del libro:");
        lb.setTitulo(leer.next());
        
        System.out.println("> Ingrese el autor del libro:");
        lb.setAutor(leer.next());
        
        return lb;
    }
    
    public void verInfoLibro(Libro lb) {
        System.out.println(lb.toString());
    }
}
