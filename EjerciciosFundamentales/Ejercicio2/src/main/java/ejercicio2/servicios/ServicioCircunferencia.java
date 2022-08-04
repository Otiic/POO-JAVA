package ejercicio2.servicios;

import ejercicio2.entidades.Circunferencia;
import java.util.Scanner;

public class ServicioCircunferencia {
    
    public Circunferencia crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        Circunferencia cf = new Circunferencia();
        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("> Ingrese el radio (metros) de la circunferencia:");
        cf.setRadio(leer.nextDouble());
        System.out.println("------------------------------------------------------------------------");
        
        return cf;
    }
    
    public double area(Circunferencia cf) {
        double area;
        
        area = Math.PI * Math.pow(cf.getRadio(), 2);
        
        return area;
    }
    
    public double perimetro(Circunferencia cf) {
        double perimetro;
        
        perimetro = 2 * Math.PI * cf.getRadio();
        
        return perimetro;
    }
}
