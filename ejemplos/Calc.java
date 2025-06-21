package inicio.ejemplos;

public class Calc {

    //Atributos

    private int n1;
    private int n2;

    //Constructor

    public Calc(int n1, int n2){
        setN1(n1);
        setN2(n2);
    }

    //Setters

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    //Métodos

    public int sum(){
        return n1 + n2;
    }

    public int rest(){
        return n1 - n2;
    }

    public int prod(){
        return n1*n2;
    }

    public int modulo(){
        return n1 % n2;
    }

    public int doble(){
        return n1*2;
    }

    public int triple(){
        return n1*3;
    }

    public int cuadrado(){
        return n1 * n1;
    }

    public int cubo(){
        return n1 * n1 * n1;
    }
}
