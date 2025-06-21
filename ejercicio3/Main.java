package inicio.ejercicio3;

public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[]{
                new Estudiante("Nerea", 26, 10),
                new Estudiante("Alex", 20, 6)
        };

        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.comprobarNota());
        }

    }
}
