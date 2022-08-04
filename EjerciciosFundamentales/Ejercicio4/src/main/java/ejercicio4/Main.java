/*  Ejercicio 4)
 *
 *  Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
 *  base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
 *  los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
 *  superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
 *  tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
 *  altura. Se deberán además definir los métodos getters, setters y constructores
 *  correspondientes.
 *
 *  Superficie = base * altura / Perímetro = (base + altura) * 2.
 *
 */

package ejercicio4;

import ejercicio4.entidades.Rectangulo;
import ejercicio4.servicios.ServicioRectangulo;

public class Main {

    public static void main(String[] args) {
        ServicioRectangulo sr = new ServicioRectangulo();
        Rectangulo rectangulo = sr.crearRectangulo();

        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("> La superficie del rectangulo es: " + sr.superficie(rectangulo));
        System.out.println("> El perimetro del rectangulo es: " + sr.perimetro(rectangulo));
        System.out.println("------------------------------------------------------------------------");
        System.out.println("");
        sr.dibujar(rectangulo);
        System.out.println("");
    }
}
