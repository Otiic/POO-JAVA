package ejercicio12.entidades;

import java.util.Date;

public class Persona {
    
    private String nombre;
    private Date fechaDeNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    public int calcularEdad() {
        Date fechaActual = new Date();
        int edad;
        
        if (fechaActual.getMonth() == fechaDeNacimiento.getMonth()) {
            if (fechaActual.getDate() >= fechaDeNacimiento.getDate()) {
                edad = fechaActual.getYear() - fechaDeNacimiento.getYear();
            } else {
                edad = (fechaActual.getYear() - fechaDeNacimiento.getYear()) - 1;
            }
        } else if (fechaActual.getMonth() > fechaDeNacimiento.getMonth()){
            edad = fechaActual.getYear() - fechaDeNacimiento.getYear();
        } else {
            edad = (fechaActual.getYear() - fechaDeNacimiento.getYear()) - 1;
        }
            
        return edad;
    }
    
    public boolean menorQue(int edad) {
        return calcularEdad() <= edad;
    }
}
