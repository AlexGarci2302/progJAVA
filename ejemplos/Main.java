package inicio.ejemplos;

public class Main {
    public static void main(String[] args) {
        //Ejemplo 1

        System.out.println("----------EJ_EJEMPLO_1----------");

        Coche coche1 = new Coche("blanco", "C3 aircross", 2022);
        System.out.println("El coche es un " + coche1.getModelo() + " de color " +
                coche1.getColor() + " del año " + coche1.getAnyo());

        Coche coche2 = new Coche();
        System.out.println("El coche es un " + coche2.getModelo() + " de color " +
                coche2.getColor() + " del año " + coche2.getAnyo());

        //Ejemplo 2

        System.out.println("----------EJ_EJEMPLO_2----------");

        Calc calculator = new Calc(5, 3);
        System.out.println("La suma es " + calculator.sum() +
                ", la resta es " + calculator.rest() +
                ", el producto es " + calculator.prod() +
                ", el módulo es " + calculator.modulo() +
                ", el doble del primer numero es " + calculator.doble() +
                ", su triple " + calculator.triple() +
                ", su cuadrado " + calculator.cuadrado() +
                ", su cubo " + calculator.cubo());

    }

}
