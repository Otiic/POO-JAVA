package ejercicio5.entidades;

import java.util.Scanner;

public class Juego {

    String meses = "enero febrero marzo abril mayo junio julio agosto septiembre octubre noviembre diciembre";
    String mesSecreto;

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public void randomMesSecreto() {
        String[] arrayMeses = meses.split(" ");

        mesSecreto = arrayMeses[(int) (Math.random() * 11)];
    }

    public void jugar() {
        Scanner leer = new Scanner(System.in);
        boolean correcto = false;

        System.out.println("-----------------------------<AdivinaElMes>-----------------------------");

        while (correcto == false) {
            System.out.println("> Ingresa un mes:");
            if (leer.nextLine().equalsIgnoreCase(mesSecreto)) {
                System.out.println("");
                System.out.println("> Haz acertado!");
                
                correcto = true;
            } else {
                System.out.println("");
                System.out.println("> No haz acertado.");
                System.out.println("");
            }
        }
        
        System.out.println("---------------------------<FinAdivinaElMes>----------------------------");
    }
}
