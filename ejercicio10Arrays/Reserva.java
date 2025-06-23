package inicio.ejercicio10Arrays;

public class Reserva {
    private String nombreCliente;
    private int numeroHabitacion;
    private int diasEstancia;

    public Reserva(String nombreCliente, int numeroHabitacion, int diasEstancia) {
        this.nombreCliente = nombreCliente;
        this.numeroHabitacion = numeroHabitacion;
        this.diasEstancia = diasEstancia;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getDiasEstancia() {
        return diasEstancia;
    }

    public void setDiasEstancia(int diasEstancia) {
        this.diasEstancia = diasEstancia;
    }

    public String imprimir(){
        return "Nombre del cliente: " + getNombreCliente() +
                ", Número de la habitación: " + getNumeroHabitacion() +
                ", Días de la instancia: " + getDiasEstancia();
    }
}
