/*  Ejercicio 2)
 *
 *  Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
 *  atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
 *  usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
 *  los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
 *  que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
 *  calcular la distancia entre dos puntos consulte el siguiente link:
 *
 *  http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 *
 */

package ejercicio2;

import ejercicio2.entidades.Punto;
import ejercicio2.servicios.ServicioPunto;

public class Main {

    public static void main(String[] args) {
        ServicioPunto sp = new ServicioPunto();
        Punto punto1 = sp.crearPunto();
        System.out.println("");
        Punto punto2 = sp.crearPunto();
        
        System.out.println("");
        System.out.println("-------------------------------<Resumen>--------------------------------");
        System.out.println("> Punto 1");
        System.out.println("> X: " + punto1.getX() + "  Y: " + punto1.getY());
        System.out.println("");
        System.out.println("> Punto 2");
        System.out.println("> X: " + punto2.getX() + "  Y: " + punto2.getY());
        System.out.println("");
        System.out.println("> Distancia entre los puntos: " + sp.calcularDistancia(punto1, punto2));
        System.out.println("------------------------------<FinResumen>------------------------------");
    }
}
