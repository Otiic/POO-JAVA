package ejercicio12.servicios;

import ejercicio12.entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class ServicioPersona {
    
    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in);
        Persona persona = new Persona();
        int dia, mes, anio;
        
        System.out.println("-------------------------------<CrearPersona>-------------------------------");
        System.out.println("> Ingresa el nombre:");
        persona.setNombre(leer.nextLine());
        
        System.out.println("");
        System.out.println(">-----Fecha de nacimiento----->");
        
        System.out.println("");
        System.out.println("> Ingresa el dia:");
        dia = leer.nextInt();
        
        System.out.println("");
        System.out.println("> Ingresa el mes:");
        mes = leer.nextInt();
        mes--;
        
        System.out.println("");
        System.out.println("> Ingresa el anio:");
        anio = leer.nextInt();
        anio -= 1900;
        
        Date fechaDeNacimiento = new Date(anio, mes, dia);
        System.out.println(fechaDeNacimiento);
        persona.setFechaDeNacimiento(fechaDeNacimiento);
        
        System.out.println("-----------------------------<FinCrearPersona>------------------------------");
        
        return persona;
    }
    
    public void mostrarPersona(Persona persona) {
        Date fechaDeNacimiento = persona.getFechaDeNacimiento();
        
        System.out.println("---------------------------------<Persona>----------------------------------");
        System.out.println("> Nombre: " + persona.getNombre());
        System.out.println("> Fecha de nacimiento: " + fechaDeNacimiento.getDate() + "/" + (fechaDeNacimiento.getMonth() + 1) + "/" + (fechaDeNacimiento.getYear() + 1900));
        System.out.println("> Edad: " + persona.calcularEdad());
        System.out.println("-------------------------------<FinPersona>---------------------------------");
    }
}
