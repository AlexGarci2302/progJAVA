package inicio.ejercicio5;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(12345678, "Alejandro García", 100);
        cuenta.imprimir();
        cuenta.retirar(50);
        cuenta.depositar(110);
        cuenta.retirar(250);

    }
}
