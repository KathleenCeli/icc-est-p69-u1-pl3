  package controllers;

import java.util.List;
import models.Incidente;

public class IncidenteController {
    public List<Incidente> sort(List<Incidente> incidentes) {
        return Incidente.sort(null);
        return incidentes;
    }

    public int busquedaBinaria(List<Incidente> incidentes, Incidente objetivo) {
        int inicio = 0;
        int fin = arreglo.length - 1;

    while (inicio <= fin) {
        
        int medio = inicio + (fin - inicio) / 2;

        if (arreglo[medio] == objetivo) {
            return medio; // Elemento encontrado
        }

        if (arreglo[medio] < objetivo) {
            inicio = medio + 1; // Buscar en la mitad derecha
        } else {
            fin = medio - 1; // Buscar en la mitad izquierda
        }
    }
    return -1;
    }
}
