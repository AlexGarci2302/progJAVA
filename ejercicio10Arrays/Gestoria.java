package inicio.ejercicio10Arrays;

public class Gestoria {
    private Reserva[] reservas;
    private int indice;
    private static final int CAPACIDAD = 10;

    public Gestoria(){
        this.reservas = new Reserva[CAPACIDAD];
        this.indice = 0;
    }

    public Gestoria(int tamano){
        this.reservas = new Reserva[tamano];
        this.indice = 0;
    }

    public void insertarReserva(Reserva reserva){
        reservas[indice] = reserva;
        indice++;
    }

    public Reserva buscarReserva(String nombre){
        Reserva res = null;
        for (int i = 0; i < indice; i++) {
            Reserva r = reservas[i];
            if (r.getNombreCliente().equals(nombre)){
                return r;
            }
        }
        return res;
    }

    private int buscarPorIndice(int numeroHab){
        int res = -1;
        for (int i = 0; i < indice; i++) {
            Reserva r = reservas[i];
            if (r.getNumeroHabitacion() == numeroHab){
                res = i;
                break;
            }
        }
        return res;
    }

    public void borrarHabPorNum(int numero){
        int indiceABorrar = buscarPorIndice(numero);
        if (indiceABorrar >= 0){
            for (int i = 0; i < indiceABorrar; i++) {
                reservas[i] = reservas[i++];
            }
            indice--;
        }
    }

    public void mostrar(){
        for (int i = 0; i < indice; i++) {
            System.out.println(reservas[i].imprimir());
        }
    }
}
