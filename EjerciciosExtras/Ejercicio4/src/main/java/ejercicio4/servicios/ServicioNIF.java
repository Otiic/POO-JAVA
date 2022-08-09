package ejercicio4.servicios;

import ejercicio4.entidades.NIF;
import java.util.Scanner;

public class ServicioNIF {
    
    public NIF crearNIF () {
        Scanner leer = new Scanner(System.in);
        NIF nif = new NIF();
        String strTabla = "TRWAGMYFPDXBNJZSQVHLCKE";
        char[] arrayTabla = new char[23];
        
        for (int i = 0; i < 23; i++) {
            arrayTabla[i] = strTabla.charAt(i);
        }
        
        System.out.println("-------------------------------<CrearNIF>-------------------------------");
        System.out.println("> Ingresa el DNI:");
        nif.setDNI(leer.nextInt());
        
        System.out.println("> Calculando NIF...");
        nif.setLetra(arrayTabla[nif.getDNI() % 23]);
        System.out.println("> Calculo exitoso.");
        System.out.println("-----------------------------<FinCrearNIF>------------------------------");
        
        return nif;
    }
}
