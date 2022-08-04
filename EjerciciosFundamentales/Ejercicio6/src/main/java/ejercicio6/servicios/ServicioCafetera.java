package ejercicio6.servicios;

import ejercicio6.entidades.Cafetera;

public class ServicioCafetera {

    public void llenarCafetera(Cafetera cafetera) {
        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("> Llenando cafetera...");
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("> La cafetera ha sido llenada con exito.");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("");
    }

    public void vaciarCafetera(Cafetera cafetera) {
        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("> Vaciando cafetera...");
        cafetera.setCantidadActual(0);
        System.out.println("> La cafetera ha sido vaciada con exito.");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("");
    }

    public void agregarCafe(Cafetera cafetera, int cantidadCafe) {
        System.out.println("");
        System.out.println("------------------------------------------------------------------------");

        if (cafetera.getCantidadActual() + cantidadCafe > cafetera.getCapacidadMaxima()) {
            System.out.println("> La cantidad de cafe solicitada es demasiada.");
            System.out.println("> Agregando cafe hasta llenar cafetera...");
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
            System.out.println("> Se ha llenado la cafetera con exito.");
        } else {
            System.out.println("> Agregando cafe...");
            cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidadCafe);
            System.out.println("> Se ha agregado el cafe exitosamente.");
        }

        System.out.println("------------------------------------------------------------------------");
        System.out.println("");
    }

    public void servirTaza(Cafetera cafetera, int tamañoTaza) {
        System.out.println("");
        System.out.println("------------------------------------------------------------------------");

        if (cafetera.getCantidadActual() >= tamañoTaza) {
            System.out.println("> Sirviendo taza...");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamañoTaza);
            System.out.println("> La taza ha sido servida con exito.");
        } else {
            System.out.println("> No hay suficiente cafe en la cafetera.");
            System.out.println("> Sirviendo hasta acabar cafe...");
            System.out.println("> La taza ha quedado en " + cafetera.getCantidadActual() + "ml.");
            cafetera.setCantidadActual(0);
        }
        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("");
    }

    public void verEstado(Cafetera cafetera) {
        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("> La cantidad actual de la cafetera es: " + cafetera.getCantidadActual());
        System.out.println("> La capacidad maxima de la cafetera es: " + cafetera.getCapacidadMaxima());
        System.out.println("------------------------------------------------------------------------");
        System.out.println("");
    }
}
