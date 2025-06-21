package inicio.ejercicio6Arrays;

public class Paciente {
    private String nombre;
    private int edad;
    private int nroHistorial;

    public Paciente(String nombre, int edad, int nroHistorial){
        this.nombre = nombre;
        this.edad = edad;
        this.nroHistorial = nroHistorial;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNroHistorial() {
        return nroHistorial;
    }

    public String imprimir(){
        return "Nombre: " + getNombre() +
                ", edad: " + getEdad() +
                ", número del historial: " + getNroHistorial();
    }
}
