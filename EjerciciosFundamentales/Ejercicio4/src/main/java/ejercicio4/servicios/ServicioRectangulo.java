package ejercicio4.servicios;

import ejercicio4.entidades.Rectangulo;
import java.util.Scanner;

public class ServicioRectangulo {

    public Rectangulo crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo();

        System.out.println("------------------------------------------------------------------------");
        System.out.println("> Ingresa la base del rectangulo:");
        rectangulo.setBase(leer.nextInt());
        System.out.println("");
        System.out.println("> Ingresa la altura del rectangulo:");
        rectangulo.setAltura(leer.nextInt());
        System.out.println("------------------------------------------------------------------------");

        return rectangulo;
    }

    public int superficie(Rectangulo rectangulo) {
        int superficie;

        superficie = rectangulo.getBase() * rectangulo.getAltura();

        return superficie;
    }

    public int perimetro(Rectangulo rectangulo) {
        int perimetro;

        perimetro = (rectangulo.getBase() + rectangulo.getAltura()) * 2;

        return perimetro;
    }

    public void dibujar(Rectangulo rectangulo) {
        int base = rectangulo.getBase(), altura = rectangulo.getAltura();

        for (int i = 0; i < base; i++) {
            System.out.print("* ");
        }

        System.out.println("");

        for (int i = 0; i < altura - 2; i++) {
            System.out.print("*");

            for (int j = 0; j < base - 2; j++) {
                System.out.print("  ");
            }

            System.out.print(" ");
            System.out.println("*");
        }

        for (int i = 0; i < base; i++) {
            System.out.print("* ");
        }

        System.out.println("");
    }
}
