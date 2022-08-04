/*  Ejercicio 8)
 *
 *  Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
 *  y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
 *  que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
 *  través de los métodos set, se guardará la frase y la longitud de manera automática según
 *  la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
 *
 *  a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
 *     ingresada.
 *  b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
 *     ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
 *  c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
 *     contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
 *  d) Entrada: frase = "casa blanca". Salida: El carácter "a" se repite 4 veces.
 *  e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
 *     compone la clase con otra nueva frase ingresada por el usuario.
 *  f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
 *     una nueva frase ingresada por el usuario y mostrar la frase resultante.
 *  g) Método reemplazar(String letra), deberá reemplazar todas las letras "a" que se
 *     encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
 *     frase resultante.
 *  h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
 *     ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 *
 */

package ejercicio8;

import ejercicio8.entidades.Cadena;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cadena cadena = new Cadena();
        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("> Ingrese una frase:");
        cadena.setFrase(leer.nextLine());
        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        
        System.out.print("> Vocales: ");
        cadena.mostrarVocales();
        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        
        System.out.print("> Frase invertida: ");
        cadena.invertirFrase();
        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        
        System.out.println("> Ingrese una letra a contabilizar: ");
        String letra = leer.nextLine();
        System.out.println("");
        
        System.out.println("> La letra " + letra + " se encuentra " + cadena.vecesRepetido(letra) + " veces en la frase.");
        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        
        System.out.println("> Ingrese una frase para comparar longitudes:");
        String frase = leer.nextLine();
        System.out.println("");
        
        if (cadena.compararLongitud(frase)) {
            System.out.println("> Las frases tienen la misma longitud.");
        } else {
            System.out.println("> Las frases no tienen la misma longitud.");
        }
        
        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        
        System.out.println("> Ingrese una frase para unir:");
        String frase2 = leer.nextLine();
        System.out.println("");
        
        System.out.println("> Frase resultante: " + cadena.unirFrases(frase2));
        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        
        System.out.println("> Ingrese una letra a reemplazar por todas las a de la frase:");
        String letra2 = leer.nextLine();
        System.out.println("");
        
        System.out.println("> Frase resultante: " + cadena.reemplazarAses(letra2));
        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        
        System.out.println("> Ingrese una letra a comprobar si esta contenida en la frase:");
        String letra3 = leer.nextLine();
        System.out.println("");
        
        if (cadena.contiene(letra3)) {
            System.out.println("> La letra esta contenida en la frase.");
        } else {
            System.out.println("> La letra no esta contenida en la frase.");
        }
        
        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
    }
}
