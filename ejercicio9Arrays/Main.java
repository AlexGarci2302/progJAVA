package inicio.ejercicio9Arrays;

public class Main {
    public static void main(String[] args) {
        Taller t = new Taller();

        t.insertarVehiculo(new Vehiculo("1234ABC", "Volkswagen", "Golf GTI"));
        t.insertarVehiculo(new Vehiculo("4321ZYX", "BMW", "M3"));
        t.insertarVehiculo(new Vehiculo("1111AAA", "Mercedes", "C 63 AMG"));
        t.insertarVehiculo(new Vehiculo("2222BBB", "Skoda", "Octavia RS"));
        t.insertarVehiculo(new Vehiculo("3333CCC", "Toyota", "GR Supra"));

        System.out.println("Buscar vehículo con matrícula 3333CCC: ");

        System.out.println(t.buscarVehiculo("3333CCC").imprimir());

        System.out.println("Listado con todos los vehículos: ");

        t.mostrarVehiculos();
    }
}
