package inicio.ejercicio3;

public class Estudiante {

    //Atributos

    private String nombre;
    private int edad;
    private int notaPromedio;

    //Constructor

    public Estudiante(String nombre, int edad, int notaPromedio){
        setNombre(nombre);
        setEdad(edad);
        setNotaPromedio(notaPromedio);
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(int notaPromedio) {
        this.notaPromedio = notaPromedio;
    }

    //Método comprobarNota

    public String comprobarNota(){
        if (notaPromedio >= 7){
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }
}
