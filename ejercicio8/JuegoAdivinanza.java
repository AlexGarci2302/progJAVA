package inicio.ejercicio8;

import java.util.Random;

public class JuegoAdivinanza {
    private int numero;

    //Constructor

    public JuegoAdivinanza(){
        this.numero = randomAdivina();
    }

    //Método random

    public int randomAdivina(){
        Random random = new Random();
        return random.nextInt(100);
    }

    //Getter

    public int getNumero() {
        return numero;
    }
}
