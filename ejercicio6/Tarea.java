package inicio.ejercicio6;

import java.util.Scanner;

public class Tarea {
    //Atributos

    private String descripcion;
    private boolean completada;

    //Constructor

    public Tarea(String descripcion, boolean completada){
        this.descripcion = descripcion;
        this.completada = completada;
    }

    //Getters

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    //Método marcarComoComlpetada

    public void marcarComoCompletada(){
        completada = true;
    }

    //Método imprimir

    public void imprimir(){
        System.out.println("Tarea: " + getDescripcion() + ", estado: " + isCompletada());
    }
}
