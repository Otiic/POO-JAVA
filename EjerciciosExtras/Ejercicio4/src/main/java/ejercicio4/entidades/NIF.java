package ejercicio4.entidades;

public class NIF {
    
    private int DNI;
    private char letra;

    public int getDNI() {
        return DNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    public void mostrar() {
        System.out.println("---------------------------------<NIF>----------------------------------");
        System.out.println("> NIF: " + DNI + "-" + letra);
        System.out.println("--------------------------------<FinNIF>--------------------------------");
    }
}
