package inicio.ejercicio4;

public class Producto {
    //Atributos

    private String nombre;
    private double precio;
    private int cantidadEnStock;

    //Constructor

    public Producto(String nombre, double precio, int cantidadEnStock){
        setNombre(nombre);
        setPrecio(precio);
        setCantidadEnStock(cantidadEnStock);
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    //Método vender

    public void vender(int cantidadVendida){
        if (cantidadVendida > cantidadEnStock){
            System.out.println("ERROR: No se ha podido vender el producto, no hay esa cantidad disponible");
        } else {
            setCantidadEnStock(cantidadEnStock - cantidadVendida);
            imprimir();
        }
    }

    //Método reponer

    public void reponer(int cantidadRepuesta){
        setCantidadEnStock(cantidadEnStock + cantidadRepuesta);
        imprimir();
    }

    //Método imprimir

    public void imprimir(){
        System.out.println("Nombre: " + getNombre() +
                " precio: " + getPrecio() +
                " cantidad: " + getCantidadEnStock());
    }
}
