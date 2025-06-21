package inicio.ejercicio1;

public class Empleado {
    //Atributos

    private String nombre;
    private double salario;
    private int id;

    //Constructor

    public Empleado(String nombre, double salario, int id){
        setNombre(nombre);
        setSalario(salario);
        setId(id);
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        if (salario > 2000){
            return salario*10/100 + salario;
        } else {
            return salario;
        }
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Método imprimir

    public String imprimir(){
        return "El empleado se llama " + getNombre() +
                ", su salario ronda los " + getSalario() + " €";
    }
}
