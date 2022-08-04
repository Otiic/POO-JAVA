/*  Ejercicio 10)
 *
 *  Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
 *  de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
 *  programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
 *  Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
 *  ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
 *  0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
 *  20.
 *
 */

package ejercicio10;

import java.util.Arrays;

public class Ejercicio10 {

    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        for (int i = 0; i < 50; i++) {
            arregloA[i] = Math.random() * 10;
        }

        Arrays.sort(arregloA);

        System.arraycopy(arregloA, 0, arregloB, 0, 10);

        for (int i = 10; i < 20; i++) {
            arregloB[i] = Math.random() * 10;
        }

        System.out.println("------------------------------------------------------------------------");
        System.out.print("> Arreglo A: ");

        for (int i = 0; i < 50; i++) {
            System.out.print("[" + arregloA[i] + "] ");
        }

        System.out.println("");
        System.out.print("> Arreglo B: ");

        for (int i = 0; i < 20; i++) {
            System.out.print("[" + arregloB[i] + "] ");
        }

        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
    }
}
