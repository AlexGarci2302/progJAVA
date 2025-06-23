package inicio.ejercicio9Arrays;

public class Taller {
    private Vehiculo[] vehiculos;
    private int indice;
    private static final int CAPACIDAD = 10;

    public Taller(){
        this.vehiculos = new Vehiculo[CAPACIDAD];
        this.indice = 0;
    }

    public Taller(int tamano){
        this.vehiculos = new Vehiculo[tamano];
        this.indice = 0;
    }

    public void insertarVehiculo(Vehiculo vehiculo){
        vehiculos[indice] = vehiculo;
        indice++;
    }

    public Vehiculo buscarVehiculo(String matriculaBuscada){
        Vehiculo res = null;
        for (int i = 0; i < indice; i++) {
            Vehiculo v = vehiculos[i];
            if (v.getMatricula().equals(matriculaBuscada)){
                return v;
            }
        }
        return res;
    }

    public void mostrarVehiculos(){
        for (int i = 0; i < indice; i++) {
            System.out.println(vehiculos[i].imprimir());
        }
    }
}
