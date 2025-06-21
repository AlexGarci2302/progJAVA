package inicio.ejercicio6;

public class Main {
    public static void main(String[] args) {

        Tarea[] tareas = new Tarea[]{
                new Tarea("Primera tarea", false),
                new Tarea("Segunda tarea", false),
                new Tarea("Tercera tarea", false),
        };

        System.out.println("----------");

        for (Tarea tarea : tareas){
            tarea.imprimir();
        }

        tareas[1].marcarComoCompletada();
        tareas[1].imprimir();

    }
}
