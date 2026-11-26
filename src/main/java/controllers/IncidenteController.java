  package controllers;

import java.util.List;
import java.util.Objects;

import models.Incidente;

public class IncidenteController {

    public List<Incidente> sort(List<Incidente> incidentes) {
        incidentes.sort(null); // Ordena usando el compareTo de Incidente
        return incidentes;
    }

    public int busquedaBinaria(List<Incidente> incidentes, Incidente objetivo) {
        Objects.requireNonNull(incidentes, "La lista no puede ser null");
        Objects.requireNonNull(objetivo, "El objetivo no puede ser null");
        int inicio = 0;
        int fin = incidentes.size() - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            int comparacion = incidentes.get(medio).compareTo(objetivo);

            if (comparacion == 0) {
                return medio; // Elemento encontrado
            }

            if (comparacion < 0) {
                inicio = medio + 1; // Buscar en la mitad derecha
            } else {
                fin = medio - 1; // Buscar en la mitad izquierda
            }
        }

        return -1; // El elemento no está en la lista
    }
}
