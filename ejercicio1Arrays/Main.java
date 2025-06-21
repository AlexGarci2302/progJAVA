package inicio.ejercicio1Arrays;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.insertarContacto(new Contacto("Nerea", "652898474", "nerea@gmail.com"));
        agenda.insertarContacto(new Contacto("Alex", "656880596", "alex@gmail.com"));
        agenda.imprimirContactos();
        System.out.println("Borramos alex: ");
        agenda.borrarContacto("Alex");
        agenda.imprimirContactos();
        System.out.println("Insertamos de nuevo a Alex: ");
        agenda.insertarContacto(new Contacto("Alex", "656880596", "alex@gmail.com"));
        agenda.imprimirContactos();

        System.out.println("buscamos a Nerea");
        System.out.println(agenda.buscarContacto("Nerea").imprimir());
    }
}
