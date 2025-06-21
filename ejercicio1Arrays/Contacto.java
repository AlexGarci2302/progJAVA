package inicio.ejercicio1Arrays;

public class Contacto {
    private String nombre;
    private String  telefono;
    private String correo;

    //Constructor

    public Contacto(String nombre, String telefono, String correo){
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    //Método imprimir

    public String imprimir(){
        return "Nombre: " + getNombre() +
                ", Teléfono: " + getTelefono() +
                ", Correo: " + getCorreo();
    }
}
