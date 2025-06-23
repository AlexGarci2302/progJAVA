package inicio.ejercicio6Arrays;

public class Main {
    public static void main(String[] args) {
        Salud salud = new Salud();
        salud.insertarPaciente(new Paciente("Pedro", 70, 1));
        salud.insertarPaciente(new Paciente("Nerea", 26, 2));
        salud.insertarPaciente(new Paciente("Alex", 20, 3));
        salud.mostrarPacientes();
        System.out.println("Buscamos el paciente 2: ");
        System.out.println(salud.buscarPaciente(2).imprimir());
        System.out.println("Imprimimos mayor de 65: ");
        salud.mostrarPacientesMayorDe65();
    }
}
