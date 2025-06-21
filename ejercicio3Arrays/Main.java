package inicio.ejercicio3Arrays;

public class Main {

    public static void main(String[] args) {
        Secretaria secretaria = new Secretaria();
        secretaria.recuento();
        secretaria.masDe7();
        System.out.println(secretaria.buscarAlumno("77657908H").imprimir());
    }
}
