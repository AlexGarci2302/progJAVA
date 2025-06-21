package inicio.ejercicio8Arrays;

import java.time.LocalDate;

public class Tarea {
    private String descripcion;
    private LocalDate fechaLimite;
    private boolean completada;

    public Tarea(String descripcion, LocalDate fechaLimite, boolean completada) {
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.completada = completada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public void completarTarea(){
        this.completada = true;
    }

    public void imprimir(){
        System.out.println("Descripcion: " + getDescripcion() +
                ", fecha fin: " + getFechaLimite() +
                ", ¿completada? " + isCompletada());
    }
}
