package inicio.ejercicio10;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anioFabricacion;

    //Constructor

    public Vehiculo(String marca, String modelo, int anioFabricacion){
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    //Getter

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    //Método

    public String mostrarDetalles(){
        return "Marca: " + marca +
                ", modelo: " + modelo +
                ", año de fabricación: " + anioFabricacion;
    }
}
