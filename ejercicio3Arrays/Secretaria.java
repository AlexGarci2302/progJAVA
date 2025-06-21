package inicio.ejercicio3Arrays;

public class Secretaria {
    private Alumno[] alumnos = new Alumno[]{
            new Alumno("Alex", "77657908H", new int[]{6, 3, 5}),
            new Alumno("Nerea", "12345678A", new int[]{8, 7, 9}),
            new Alumno("Antonio", "87654321B", new int[]{9, 8, 6})
    };

    public Secretaria(){}

    public void recuento(){
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("El alumno: " + alumnos[i].getNombre() +
                    " y tiene una media de " + alumnos[i].calcularPromedio());
        }
    }

    public void masDe7(){
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].calcularPromedio() > 7){
                System.out.println(alumnos[i].imprimir());
            }
        }
    }

    public Alumno buscarAlumno(String dni){
        Alumno res = null;
        for (Alumno a : alumnos){
            if (a.getDni().equals(dni)){
                return a;
            }
        }
        return res;
    }
}
