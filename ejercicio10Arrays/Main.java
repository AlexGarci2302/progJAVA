package inicio.ejercicio10Arrays;

public class Main {
    public static void main(String[] args) {
        Gestoria g = new Gestoria();

        g.insertarReserva(new Reserva("Alex", 2, 3));
        g.insertarReserva(new Reserva("Nerea", 3, 3));
        g.insertarReserva(new Reserva("Antonio", 4, 3));
        g.mostrar();
        System.out.println("Buscamos reserva de Alex: ");
        System.out.println(g.buscarReserva("Alex").imprimir());
        System.out.println("Borramos la reserva Antonio: ");
        g.borrarHabPorNum(4);
        g.mostrar();
    }
}
