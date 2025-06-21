package inicio.ejercicio8;

import java.util.Scanner;

public class Main {

    public static void Adivina(){
        JuegoAdivinanza ja = new JuegoAdivinanza();
        int valor;

        do {
            System.out.println("Inserte un número: ");
            Scanner scanner = new Scanner(System.in);
            valor = scanner.nextInt();

            if (valor < ja.getNumero()) {
                System.out.println("Mayor");
            }

            if (valor > ja.getNumero()){
                System.out.println("Menor");
            }
        } while (valor != ja.getNumero());

        System.out.println("Adivinaste el número!");
    }

    public static void main(String[] args) {
        Adivina();
    }
}
