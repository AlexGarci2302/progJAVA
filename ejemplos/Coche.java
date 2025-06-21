package inicio.ejemplos;

public class Coche{
    private String color;
    private String modelo;
    private int anyo;

    public Coche(){
        this.color = "Azul";
        this.modelo = "Toyota";
        this.anyo = 2009;
    }

    public Coche(String color, String modelo, int anyo){
        setColor(color);
        setModelo(modelo);
        this.anyo = anyo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnyo() {
        return anyo;
    }
}