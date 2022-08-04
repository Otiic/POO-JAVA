package ejercicio5.entidades;

public class Cuenta {
    
    private int numeroCuenta, DNI;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(int numero_cuenta, int DNI, double saldo) {
        this.numeroCuenta = numero_cuenta;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroCuenta(int numero_cuenta) {
        this.numeroCuenta = numero_cuenta;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
