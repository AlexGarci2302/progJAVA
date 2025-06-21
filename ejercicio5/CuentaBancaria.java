package inicio.ejercicio5;


public class CuentaBancaria {
    //atributos

    private int numeroCuenta;
    private String titular;
    private double saldo;

    //Constructor

    public CuentaBancaria(int numeroCuenta, String titular, double saldo){
        setNumeroCuenta(numeroCuenta);
        setTitular(titular);
        setSaldo(saldo);
    }

    //Getters and Setters

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Método depositar

    public void depositar(double dineroDepositado){
        setSaldo(saldo + dineroDepositado);
        imprimir();
    }

    public void retirar(double dineroRetirado){
        if (dineroRetirado > saldo){
            System.out.println("ERROR: No se puede retirar más dinero del que tienes.");
        } else {
            setSaldo(saldo - dineroRetirado);
            imprimir();
        }
    }

    //Método imprimir

    public void imprimir(){
        System.out.println("La cuenta bancaria de " + getTitular() +
                " tiene de saldo " + getSaldo());
    }
}
