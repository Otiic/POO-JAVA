package ejercicio6.entidades;

import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {

    String[] palabra, strLetrasEncontradas;
    int letrasEncontradas = 0, intentos;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int intentos) {
        this.palabra = palabra;
        this.intentos = intentos;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public String[] getStrLetrasEncontradas() {
        return strLetrasEncontradas;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public void setStrLetrasEncontradas(String[] strLetrasEncontradas) {
        this.strLetrasEncontradas = strLetrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public void setUpJuego() {
        Scanner leer = new Scanner(System.in);
        String palabraAux;

        System.out.println("------------------------------<SetUpJuego>------------------------------");
        System.out.println("> Ingresa la palabra:");
        palabraAux = leer.nextLine();

        System.out.println("");
        System.out.println("> Ingresa la cantidad maxima de intentos:");
        intentos = leer.nextInt();

        palabra = new String[palabraAux.length()];
        strLetrasEncontradas = new String[palabraAux.length()];

        for (int i = 0; i < palabra.length; i++) {
            palabra[i] = palabraAux.substring(i, i + 1);
        }

        Arrays.fill(strLetrasEncontradas, "_");

        System.out.println("----------------------------<FinSetUpJuego>-----------------------------");
    }

    public void longitud() {
        System.out.println("> Longitud de la palabra: " + palabra.length);
    }

    public int buscar(String letra) {
        int vecesEncontrada = 0;

        for (int i = 0; i < palabra.length; i++) {
            if (letra.equalsIgnoreCase(palabra[i])) {
                vecesEncontrada++;
                strLetrasEncontradas[i] = palabra[i];
            }
        }

        return vecesEncontrada;
    }

    public void encontradasYFaltantes() {
        System.out.print("> Letras encontradas: " + letrasEncontradas + " | ");

        for (int i = 0; i < strLetrasEncontradas.length; i++) {
            System.out.print(strLetrasEncontradas[i]);
        }

        System.out.println("");
        System.out.println("> Letras faltantes: " + (palabra.length - letrasEncontradas));
    }

    public void intentos() {
        System.out.println("> Intentos: " + intentos);
    }

    public void jugar() {
        Scanner leer = new Scanner(System.in);
        String letrasUsadas = "", letra;
        int vecesEncontrada = 0;

        System.out.println("-------------------------------<Ahorcado>-------------------------------");
        System.out.println("");

        setUpJuego();

        while (letrasEncontradas != palabra.length && intentos > 0) {
            System.out.println("");
            System.out.println("-----------------------------<Juego>--------------------------------");
            System.out.println("");
            intentos();
            intentos--;

            System.out.println("");
            longitud();

            System.out.println("");
            System.out.println("> Ingresa una letra a buscar:");

            letra = leer.next().substring(0, 1);

            for (int i = 0; i < letrasUsadas.length(); i++) {
                if (letrasUsadas.substring(i, i + 1).equalsIgnoreCase(letra)) {
                    boolean bandera = true;

                    while (bandera == true) {
                        System.out.println("> Ingresa una letra que no hayas usado ya:");
                        letra = leer.next().substring(0, 1);

                        boolean bandera2 = true;

                        for (int j = 0; j < letrasUsadas.length(); j++) {
                            if (letrasUsadas.substring(j, j + 1).equalsIgnoreCase(letra)) {
                                bandera2 = false;
                            }
                        }

                        bandera = bandera2 == false;
                    }
                }
            }

            letrasUsadas += letra;
            vecesEncontrada = buscar(letra);

            System.out.println("");
            System.out.println("-----------------------------<Juego>--------------------------------");

            if (vecesEncontrada > 0) {
                System.out.println("");
                if (vecesEncontrada > 1) {
                    System.out.println("> La letra se ha encontrado " + vecesEncontrada + " veces en la palabra!");
                } else {
                    System.out.println("> La letra se ha encontrado " + vecesEncontrada + " vez en la palabra!");
                }

                letrasEncontradas += vecesEncontrada;
            } else {
                System.out.println("");
                System.out.println("> La letra no pertenece a la palabra.");
            }

            System.out.println("");
            encontradasYFaltantes();
        }

        System.out.println("");
        System.out.println("-------------------------------<FinJuego>-------------------------------");
        System.out.println("");

        if (letrasEncontradas == palabra.length) {
            System.out.println("> Felicitaciones, haz encontrado todas las letras!");
            System.out.println("> Haz ganado!");
        } else {
            System.out.println("> Lo siento, no te quedan mas intentos.");
            System.out.println("> Haz perdido.");
        }

        System.out.println("");
        System.out.println("-----------------------------<FinAhorcado>------------------------------");
    }
}
