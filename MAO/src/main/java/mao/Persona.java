package mao;

public class Persona {
    
    private String nombre;
    private int edad;
    private double estatura;

    public Persona() {
    }

    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }
    
    public void mostrarPersona(Persona persona) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Estatura: " + persona.getEstatura());
        System.out.println("------------------------------------------------------------------------");
    }
}
