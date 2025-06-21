package inicio.ejercicio2Arrays;

public class Articulo {
    private int codigo;
    private String nombre;
    private double precio;

    //Constructor

    public Articulo(int codigo, String nombre, double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getters

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    //Método imprimir

    public String imprimir(){
        return "Código: " + getCodigo() +
                ", nombre: " + getNombre() +
                ", precio: " + getPrecio();
    }
}
