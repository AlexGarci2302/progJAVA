package inicio.ejercicio6Arrays;

public class Main {
    public static int indice = 0;
    public static Paciente[] pacientes = new Paciente[10];

    public static void insertarPaciente(Paciente paciente){
        pacientes[indice] = paciente;
        indice++;
    }

    public static Paciente buscarPaciente(int numHistorial){
        Paciente res = null;
        for (Paciente p : pacientes){
            if (p.getNroHistorial() == numHistorial){
                return p;
            }
        }
        return res;
    }

    public static void mostrarPacientesMayoresDe65(){
        for (int i = 0; i < pacientes.length; i++) {
            if (pacientes[i] != null && pacientes[i].getEdad() > 65){
                System.out.println(pacientes[i].imprimir());
            }
        }
    }

    public static void mostrarPacientes(){
        for (int i = 0; i < pacientes.length; i++) {
            if (pacientes[i] != null){
                System.out.println(pacientes[i].imprimir());
            }
        }
    }

    public static void main(String[] args) {
        insertarPaciente(new Paciente("Pedro", 70, 1));
        insertarPaciente(new Paciente("Nerea", 26, 2));
        insertarPaciente(new Paciente("Alex", 20, 3));
        mostrarPacientes();
        System.out.println("Buscamos el paciente 2: ");
        System.out.println(buscarPaciente(2).imprimir());
        System.out.println("Imprimimos mayor de 65: ");
        mostrarPacientesMayoresDe65();
    }
}
