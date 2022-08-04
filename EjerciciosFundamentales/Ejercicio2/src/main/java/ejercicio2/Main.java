/*  Ejercicio 2)
 *
 *  Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
 *  tipo real. A continuación, se deben crear los siguientes métodos:
 *
 *  a) Método constructor que inicialice el radio pasado como parámetro.
 *  b) Métodos get y set para el atributo radio de la clase Circunferencia.
 *  c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
 *     objeto.
 *  d) Método area(): para calcular el área de la circunferencia (Área = PI ∗ redio2).
 *  e) Método perimetro(): para calcular el perímetro (Perímetro = 2 ∗ PI ∗ radio).
 *
 */

package ejercicio2;

import ejercicio2.entidades.Circunferencia;
import ejercicio2.servicios.ServicioCircunferencia;

public class Main {

    public static void main(String[] args) {
        ServicioCircunferencia sc = new ServicioCircunferencia();
        Circunferencia cf = sc.crearCircunferencia();
        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("> Area: " + sc.area(cf) + " metros");
        System.out.println("> Perimetro: " + sc.perimetro(cf) + " metros");
        System.out.println("------------------------------------------------------------------------");
    }
}
