package inicio.ejercicio6Arrays;

public class Salud {
    private Paciente[] pacientes;
    private int indice;
    private static final int CAPACIDAD = 10;

    public Salud(){
        this.pacientes = new Paciente[CAPACIDAD];
        this.indice = 0;
    }

    public Salud(int tamano){
        this.pacientes = new Paciente[tamano];
        this.indice = 0;
    }

    public void insertarPaciente(Paciente paciente){
        pacientes[indice] = paciente;
        indice++;
    }

    public Paciente buscarPaciente(int numeroPac){
        Paciente res = null;
        for (int i = 0; i < indice; i++) {
            Paciente p = pacientes[i];
            if (p.getNroHistorial() == numeroPac){
                return p;
            }
        }
        return res;
    }

    public void mostrarPacientesMayorDe65(){
        int contador = 0;
        for (int i = 0; i < indice; i++) {
            Paciente p = pacientes[i];
            if (p.getEdad() > 65) {
                System.out.println(p.imprimir());
                contador++;
            }
        }
        if (contador == 0){
            System.out.println("No hay pacientes con esa edad.");
        }
    }

    public void mostrarPacientes(){
        for (int i = 0; i < indice; i++) {
            System.out.println(pacientes[i].imprimir());
        }
    }
}
