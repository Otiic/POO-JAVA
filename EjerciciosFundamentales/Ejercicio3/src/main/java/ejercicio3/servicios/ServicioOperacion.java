package ejercicio3.servicios;

import ejercicio3.entidades.Operacion;
import java.util.Scanner;

public class ServicioOperacion {

    public Operacion crearOperacion() {
        Scanner leer = new Scanner(System.in);
        Operacion operacion = new Operacion();

        System.out.println("------------------------------------------------------------------------");
        System.out.println("> Ingrese el numero 1:");
        operacion.setNum1(leer.nextDouble());
        System.out.println("");
        System.out.println("> Ingrese el numero 2:");
        operacion.setNum2(leer.nextDouble());
        System.out.println("------------------------------------------------------------------------");

        return operacion;
    }

    public double sumar(Operacion operacion) {
        double suma;

        suma = operacion.getNum1() + operacion.getNum2();

        return suma;
    }

    public double restar(Operacion operacion) {
        double resta;

        resta = operacion.getNum1() - operacion.getNum2();

        return resta;
    }

    public double multiplicar(Operacion operacion) {
        double muliplicacion;

        muliplicacion = operacion.getNum1() * operacion.getNum2();

        return muliplicacion;
    }

    public double dividir(Operacion operacion) {
        double division;

        if (operacion.getNum2() == 0) {
            System.out.println("> ERROR: Division por 0 detectada.");
            return 0;
        } else {
            division = operacion.getNum1() / operacion.getNum2();
            return division;
        }
    }
}
