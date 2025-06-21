package inicio.ejercicio8Arrays;

public class Gestor {
    private Tarea[] tareas;
    private static final int CAPACIDAD = 10;
    private int indice;

    public Gestor(){
        this.tareas =new Tarea[CAPACIDAD];
        this.indice = 0;
    }

    public Gestor(int capacidad){
        this.tareas = new Tarea[capacidad];
        this.indice = 0;
    }

    public void agregarTarea(Tarea tarea){
        tareas[indice] = tarea;
        indice++;
    }

    public void completarTareaElegida(int seleccion){
        seleccion--;
        if (seleccion > indice){
            System.out.println("Error: No existe");
        } else {
            tareas[seleccion].completarTarea();
            System.out.println("Tarea " + tareas[seleccion].getDescripcion() + " completada con éxito.");
        }
    }

    public void mostrarTareasPendientes(){
        for (int i = 0; i < indice; i++) {
            if (!tareas[i].isCompletada()){
                tareas[i].imprimir();
            }
        }
    }
}
