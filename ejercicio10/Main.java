package inicio.ejercicio10;

public class Main {

    public static Vehiculo[] vehiculos = new Vehiculo[]{
            new Vehiculo("Volgswagen", "Golf GTI RS", 2023),
            new Vehiculo("BMW", "X5", 2025),
            new Vehiculo("Mercedes", "GLE350D", 2021),
            new Vehiculo("Skoda", "Fabia Montecarlos", 2024),
            new Vehiculo("Dodge", "Challenger", 1970)
    };

    public static Vehiculo buscarMayor2020(){
        for (Vehiculo vehiculo : vehiculos){
            if (vehiculo.getAnioFabricacion() > 2020){
                System.out.println(vehiculo.mostrarDetalles());
            }
        }
        return null;
    }

    public static void main(String[] args) {

        System.out.println("Coches hechos del 2020 para delante: ");
        buscarMayor2020();
    }
}
