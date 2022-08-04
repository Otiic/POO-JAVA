package ejercicio5.servicios;

import ejercicio5.entidades.Cuenta;
import java.util.Scanner;

public class ServicioCuenta {

    public Cuenta abrirCuenta() {
        Cuenta cuenta = new Cuenta();
        Scanner leer = new Scanner(System.in);

        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("> Ingresa el numero de la cuenta:");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("");
        System.out.println("> Ingresa tu DNI:");
        cuenta.setDNI(leer.nextInt());
        System.out.println("");
        System.out.println("> Ingresa el saldo inicial de la cuenta:");
        cuenta.setSaldo(leer.nextDouble());
        System.out.println("------------------------------------------------------------------------");
        System.out.println("");

        return cuenta;
    }

    public void depositarDinero(Cuenta cuenta) {
        Scanner leer = new Scanner(System.in);

        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("> Ingresa el monto a depositar:");
        double deposito = leer.nextDouble();

        if (deposito < 0) {
            System.out.println("");
            System.out.println("> El monto a depositar no puede ser negativo.");
            System.out.println("> Por favor, vuelve a intentar.");
        } else {
            cuenta.setSaldo(cuenta.getSaldo() + deposito);

            System.out.println("");
            System.out.println("> Deposito efectuado con exito.");
        }

        System.out.println("------------------------------------------------------------------------");
        System.out.println("");
    }

    public void retirarDinero(Cuenta cuenta) {
        Scanner leer = new Scanner(System.in);

        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("> Ingresa el monto a retirar:");
        double retiro = leer.nextDouble();

        if (retiro > cuenta.getSaldo()) {
            System.out.println("");
            System.out.println("> El monto a retirar no puede ser mayor al saldo actual.");
            System.out.println("> Por favor, vuelve a intentar.");
        } else if (retiro < 0) {
            System.out.println("");
            System.out.println("> El monto a retirar no puede ser negativo.");
            System.out.println("> Por favor, vuelve a intentar.");
        } else {
            cuenta.setSaldo(cuenta.getSaldo() - retiro);

            System.out.println("");
            System.out.println("> Retiro efectuado con exito.");
        }

        System.out.println("------------------------------------------------------------------------");
        System.out.println("");
    }

    public void extraccionRapida(Cuenta cuenta) {
        Scanner leer = new Scanner(System.in);

        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("> Ingresa el monto a extraer:");
        double retiro = leer.nextDouble();

        if ((retiro * 100) / cuenta.getSaldo() > 20) {
            System.out.println("");
            System.out.println("> El monto a retirar no puede ser mayor al 20% del saldo actual en una extraccion rapida.");
            System.out.println("> Por favor, vuelve a intentar.");
        } else if (retiro < 0) {
            System.out.println("");
            System.out.println("> El monto a retirar no puede ser negativo.");
            System.out.println("> Por favor, vuelve a intentar.");
        } else {
            cuenta.setSaldo(cuenta.getSaldo() - retiro);

            System.out.println("");
            System.out.println("> Extraccion rapida efectuada con exito.");
        }

        System.out.println("------------------------------------------------------------------------");
        System.out.println("");
    }

    public void consultarSaldo(Cuenta cuenta) {
        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("> El saldo actual es: " + cuenta.getSaldo() + "$");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("");
    }

    public void consultarDatos(Cuenta cuenta) {
        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("> El numero de la cuenta es: " + cuenta.getNumeroCuenta());
        System.out.println("> El DNI de la cuenta es: " + cuenta.getDNI());
        System.out.println("> El saldo de la cuenta es: " + cuenta.getSaldo() + "$");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("");
    }
}
