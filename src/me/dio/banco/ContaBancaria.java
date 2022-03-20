package me.dio.banco;

public class ContaBancaria {
    private String nomeCliente;
    private String numeroConta;
    private double saldo;
    private static int totalContas = 0;

    public ContaBancaria(String nomeCliente, String numeroConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        totalContas++;
    }

    public ContaBancaria(){
        totalContas++;
    }

    public String getNomeCliente() {

        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {

        this.nomeCliente = nomeCliente;
    }

    public String getNumeroConta() {

        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {

        this.numeroConta = numeroConta;
    }

    public double getSaldo() {

        return saldo;
    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }
    public static int getTotalContas(){
        return totalContas;
    }

    @Override
    public String toString() {
        return "\nConta Bancária " +
                "\nnome do cliente: " + nomeCliente + '\n' +
                "numero da conta: " + numeroConta + '\n' +
                "saldo: " + saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if ((saldo - valor)>=0){
            saldo -= valor;
            System.out.println("\nQuantia sacada da conta " + getNumeroConta() + "\nSeu novo saldo é de " + getSaldo());
        } else {
            System.out.println("\nImpossível sacar essa quantia da conta " + getNumeroConta());
        }
    }

}
