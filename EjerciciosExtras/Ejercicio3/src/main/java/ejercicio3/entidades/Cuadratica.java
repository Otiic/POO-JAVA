package ejercicio3.entidades;

public class Cuadratica {

    private double a, b, c;
    private String ecuacion;

    public Cuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        
        ecuacion = a + "x^2 + " + b + "x + " + c + " = 0";
        ecuacion = ecuacion.replace("+ -", "- ");
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public String getEcuacion() {
        return ecuacion;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminante() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public boolean tieneDosRaices() {
        return getDiscriminante() > 0;
    }

    public boolean tieneUnaRaiz() {
        return getDiscriminante() == 0;
    }

    public boolean tieneRaicesImaginarias() {
        return getDiscriminante() < 0;
    }

    public void calcular() {
        System.out.println("--------------------------------<Raices>--------------------------------");

        if (tieneDosRaices()) {
            System.out.println("> La ecuacion: " + ecuacion + " tiene dos raices:");
            System.out.println("");
            System.out.println("> x1: " + (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
            System.out.println("> x2: " + (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
        } else if (tieneUnaRaiz()) {
            System.out.println("> La ecuacion: " + ecuacion + " tiene una raiz:");
            System.out.println("");
            System.out.println("> x: " + (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
        } else {
            System.out.println("> La ecuacion: " + ecuacion + " tiene su solucion en los numeros complejos:");
            System.out.println("");
            System.out.println("> Numeros complejos no soportados en este programa.");
        }
        
        System.out.println("------------------------------<FinRaices>-------------------------------");
    }
}
