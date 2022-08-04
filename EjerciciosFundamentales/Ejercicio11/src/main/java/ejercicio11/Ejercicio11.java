/*  Ejercicio 11)
 *
 *  Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
 *  clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
 *  Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
 *  usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
 *  deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
 *  puede conseguir instanciando un objeto Date con constructor vacío.
 *  Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
 *  Ejemplo fecha actual: Date fechaActual = new Date();
 *
 */

package ejercicio11;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dia, mes, anio;
        
        System.out.println("------------------------------<CrearFecha>------------------------------");
        System.out.println("> Ingrsa el dia:");
        dia = leer.nextInt();
        System.out.println("");
        
        System.out.println("> Ingrsa el mes:");
        mes = leer.nextInt();
        System.out.println("");
        
        System.out.println("> Ingrsa el anio:");
        anio = leer.nextInt();
        anio -= 1900;
        System.out.println("------------------------------------------------------------------------");
        
        Date fecha1 = new Date(anio, mes, dia);
        Date fechaActual = new Date();
        
        System.out.println("-------------------------------<Resumen>--------------------------------");
        System.out.println("");
        System.out.println("> Fecha creada: " + fecha1);
        System.out.println("> Fecha actual: " + fechaActual);
        System.out.println("> Diferencia de años entre fechas: " + (Math.abs(fechaActual.getYear() - fecha1.getYear())));
        System.out.println("");
        System.out.println("------------------------------<FinResumen>------------------------------");
    }
}
