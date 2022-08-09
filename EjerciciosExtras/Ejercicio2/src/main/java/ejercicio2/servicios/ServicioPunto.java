package ejercicio2.servicios;

import ejercicio2.entidades.Punto;
import java.util.Scanner;

public class ServicioPunto {
    
    public Punto crearPunto() {
        Scanner leer = new Scanner(System.in);
        Punto punto = new Punto();
        
        System.out.println("------------------------------<CrearPunto>------------------------------");
        System.out.println("> Ingresa valor X:");
        punto.setX(leer.nextDouble());
        
        System.out.println("");
        System.out.println("> Ingresa valor Y:");
        punto.setY(leer.nextDouble());
        System.out.println("----------------------------<FinCrearPunto>-----------------------------");
        
        return punto;
    }
    
    public double calcularDistancia(Punto punto1, Punto punto2) {
        return Math.sqrt(Math.pow(punto2.getX() - punto1.getX(), 2) + Math.pow(punto2.getY() - punto1.getY(), 2));
    }
}
