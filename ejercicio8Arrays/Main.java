package inicio.ejercicio8Arrays;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Gestor g = new Gestor();

        g.agregarTarea(new Tarea("Receta de cocina", LocalDate.now(), false));
        g.agregarTarea(new Tarea("Limpiar habitación", LocalDate.now(), false));
        g.agregarTarea(new Tarea("Echar gasolina al coche", LocalDate.now(), false));
        g.mostrarTareasPendientes();
        System.out.println("Tarea 2");
        g.completarTareaElegida(2);
        System.out.println("Tareas pendientes");
        g.mostrarTareasPendientes();
    }
}
