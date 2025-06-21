package inicio.ejercicio3Arrays;

import java.util.Arrays;

public class Alumno {
    private String nombre;
    private String dni;
    private int[] notas = new int[3];

    //Constructor

    public Alumno(String nombre, String dni, int[] notas){
        this.nombre = nombre;
        this.dni = dni;
        this.notas = notas;
    }

    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int[] getNotas() {
        return notas;
    }

    //Método calcularPromedio

    public double calcularPromedio(){
        double total = 0;
        int recuento = 0;
        for (int i = 0; i < notas.length; i++) {
            recuento+=notas[i];
            total++;
        }
        return recuento / total;
    }

    //Método imprimir

    public String imprimir(){
        return "Nombre: " + getNombre() +
                ", dni: " + getDni() +
                ", notas: " + Arrays.toString(getNotas());
    }
}
