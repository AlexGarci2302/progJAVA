package inicio.ejercicio2;

public class Calculadora {
    private int num1;
    private int num2;

    //Constructor

    public Calculadora(int num1, int num2){
        setNum1(num1);
        setNum2(num2);
    }

    //Getters and Setters

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    //Método suma

    public int sumar(){
        return num1 + num2;
    }

    //Método restar
    public int restar(){
        return num1 - num2;
    }

    //Método multiplicar

    public int multiplicar(){
        return num1*num2;
    }

    //Método dividir
    public int dividir(){
        if (num2 == 0){
            return 0;
        } else {
            return num1/num2;
        }
    }
}
