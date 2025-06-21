package inicio.ejercicio4;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pelota", 12, 5);
        Producto producto2 = new Producto("Manta", 25, 3);

        producto1.imprimir();
        producto1.vender(2);

        producto2.imprimir();
        producto2.vender(10);

    }
}
