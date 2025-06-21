package inicio.ejercicio9;

import java.util.Scanner;

public class Main {

    public static Libro[] libros = new Libro[]{
            new Libro("Don Quijote", "ñañu", false),
            new Libro("Elefante", "uew", true),
            new Libro("aaa", "papa", false)
    };

    public static Libro buscar(Libro libro){
        Libro resultado = null;
        for (Libro l : libros){
            if (l.getTitulo().equals(libro.getTitulo())){
                return l;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("Introduzca el título: ");
        Scanner scanner = new Scanner(System.in);
        String titulo = scanner.next();
        Libro l = buscar(new Libro(titulo, "aaa", true));
        if (l != null){
            l.prestar();
        }
    }
}
