/*  Ejercicio 1)
 *
 *  Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá definir
 *  además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
 *  otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
 *  definir los métodos getters y setters correspondientes.
 *
 */

package ejercicio1;

import ejercicio1.entidades.Cancion;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cancion cancion = new Cancion();

        System.out.println("-----------------------------<CrearCancion>-----------------------------");
        System.out.println("> Ingresa el titulo de la cancion:");
        cancion.setTitulo(leer.nextLine());

        System.out.println("");
        System.out.println("> Ingresa la letra de la cancion:");
        cancion.setLetra(leer.nextLine());

        System.out.println("");
        System.out.println("> Ingresa el autor de la cancion:");
        cancion.setAutor(leer.nextLine());
        System.out.println("---------------------------<FinCrearCancion>----------------------------");

        System.out.println("");
        
        System.out.println("-------------------------------<Cancion>--------------------------------");
        System.out.println("> Titulo: " + cancion.getTitulo());
        System.out.println("");
        System.out.println("> Letra: " + cancion.getLetra());
        System.out.println("");
        System.out.println("> Autor: " + cancion.getAutor());
        System.out.println("-----------------------------<FinCancion>-------------------------------");
    }
}
