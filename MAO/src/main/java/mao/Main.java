package mao;

public class Main {
    
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        
        persona1.setNombre("Franco");
        persona1.setEdad(19);
        persona1.setEstatura(1.83);
        
        persona2.setNombre("Octavio");
        persona2.setEdad(19);
        persona2.setEstatura(1.83);
        
        persona1.mostrarPersona(persona1);
        persona1.mostrarPersona(persona2);
    }
}
