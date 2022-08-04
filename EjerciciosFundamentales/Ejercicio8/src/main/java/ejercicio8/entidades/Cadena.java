package ejercicio8.entidades;

public class Cadena {

    String frase;
    int longitudFrase;

    public String getFrase() {
        return frase;
    }

    public int getLongitudFrase() {
        return longitudFrase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        longitudFrase = frase.length();
    }

    public void mostrarVocales() {
        for (int i = 0; i < longitudFrase; i++) {
            String letra = frase.substring(i, i + 1);

            if (i < longitudFrase - 1) {
                switch (letra.toUpperCase()) {
                    case "A" ->
                        System.out.print(letra + ", ");
                    case "E" ->
                        System.out.print(letra + ", ");
                    case "I" ->
                        System.out.print(letra + ", ");
                    case "O" ->
                        System.out.print(letra + ", ");
                    case "U" ->
                        System.out.print(letra + ", ");
                }
            } else {
                switch (letra.toUpperCase()) {
                    case "A" ->
                        System.out.print(letra);
                    case "E" ->
                        System.out.print(letra);
                    case "I" ->
                        System.out.print(letra);
                    case "O" ->
                        System.out.print(letra);
                    case "U" ->
                        System.out.print(letra);
                }
            }
        }

        System.out.println("");
    }

    public void invertirFrase() {
        for (int i = longitudFrase; i > 0; i--) {
            System.out.print(frase.substring(i - 1, i));
        }

        System.out.println("");
    }

    public int vecesRepetido(String letra) {
        int vecesRepetido = 0;

        for (int i = 0; i < longitudFrase; i++) {
            if (frase.substring(i, i + 1).equals(letra)) {
                vecesRepetido++;
            }
        }

        return vecesRepetido;
    }

    public boolean compararLongitud(String frase) {
        return longitudFrase == frase.length();
    }

    public String unirFrases(String frase) {
        String fraseResultante = this.frase + frase;

        return fraseResultante;
    }

    public String reemplazarAses(String letra) {
        String fraseResultante = "";

        for (int i = 0; i < longitudFrase; i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase("A")) {
                fraseResultante += letra;
            } else {
                fraseResultante += frase.substring(i, i + 1);
            }
        }

        return fraseResultante;
    }

    public boolean contiene(String letra) {
        for (int i = 0; i < longitudFrase; i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase(letra)) {
                return true;
            }
        }

        return false;
    }
}
