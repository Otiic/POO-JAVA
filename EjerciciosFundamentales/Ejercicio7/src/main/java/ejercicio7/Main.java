/*  Ejercicio 7)
 *
 *  Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
 *  ("H" hombre, "M" mujer, "O" otro), peso y altura. Si el alumno desea añadir algún otro
 *  atributo, puede hacerlo. Los métodos que se implementarán son:
 *
 *  - Un constructor por defecto.
 *  - Un constructor con todos los atributos como parámetro.
 *  - Métodos getters y setters de cada atributo.
 *  - Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
 *    usuario y después se le asignan a sus respectivos atributos para llenar el objeto
 *    Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
 *    Si no es correcto se deberá mostrar un mensaje
 *  - Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
 *    kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
 *    que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
 *    fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
 *    está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
 *    fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
 *    función devuelve un 1.
 *  - Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
 *    un booleano.
 *
 *  A continuación, en la clase main hacer lo siguiente:
 *
 *  - Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
 *    los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
 *    sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
 *    mayor de edad.
 *  - Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
 *    distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
 *    cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
 *    también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 *
 */

package ejercicio7;

import ejercicio7.entidades.Persona;
import ejercicio7.servicios.ServicioPersona;

public class Main {

    public static void main(String[] args) {
        int bajoPeso = 0, pesoIdeal = 0, sobrePeso = 0, menorEdad = 0, mayorEdad = 0;
        
        ServicioPersona sp = new ServicioPersona();
        System.out.println("> Persona 1:");
        Persona persona1 = sp.crearPersona();
        System.out.println("> Persona 2:");
        Persona persona2 = sp.crearPersona();
        System.out.println("> Persona 3:");
        Persona persona3 = sp.crearPersona();
        System.out.println("> Persona 4:");
        Persona persona4 = sp.crearPersona();
        
        switch (sp.calcularIMC(persona1)) {
            case -1 -> bajoPeso++;
            case 0 -> pesoIdeal++;
            case 1 -> sobrePeso++;
        }
        
        switch (sp.calcularIMC(persona2)) {
            case -1 -> bajoPeso++;
            case 0 -> pesoIdeal++;
            case 1 -> sobrePeso++;
        }
        
        switch (sp.calcularIMC(persona3)) {
            case -1 -> bajoPeso++;
            case 0 -> pesoIdeal++;
            case 1 -> sobrePeso++;
        }
        
        switch (sp.calcularIMC(persona4)) {
            case -1 -> bajoPeso++;
            case 0 -> pesoIdeal++;
            case 1 -> sobrePeso++;
        }
        
        if (sp.esMayorDeEdad(persona1)) {
            mayorEdad++;
        } else {
            menorEdad++;
        }
        
        if (sp.esMayorDeEdad(persona2)) {
            mayorEdad++;
        } else {
            menorEdad++;
        }
        
        if (sp.esMayorDeEdad(persona3)) {
            mayorEdad++;
        } else {
            menorEdad++;
        }
        
        if (sp.esMayorDeEdad(persona4)) {
            mayorEdad++;
        } else {
            menorEdad++;
        }
        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("> Porcentaje bajos de peso: " + (bajoPeso * 100) / 4);
        System.out.println("> Porcentaje pesos ideales: " + (pesoIdeal * 100) / 4);
        System.out.println("> Porcentaje sobre pesos: " + (sobrePeso * 100) / 4);
        System.out.println("> Porcentaje menores de edad: " + (menorEdad * 100) / 4);
        System.out.println("> Porcentaje mayores de edad: " + (mayorEdad * 100) / 4);
        System.out.println("------------------------------------------------------------------------");
    }
}
