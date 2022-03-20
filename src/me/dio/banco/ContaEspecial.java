package me.dio.banco;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public double getLimite() {
        return limite;
    }

    public ContaEspecial(String nomeCliente, String numeroConta, double saldo, double limite) {
        super(nomeCliente, numeroConta, saldo);
        this.limite = limite;
    }

    public ContaEspecial(int diaRendimento) {

        this.limite = limite;
    }

    public ContaEspecial() {
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        String s = "\n_________Conta tipo especial_________" +
                super.toString() +
                "\nlimite: " + limite;
        return s;
    }

    public void sacar(double valor) {
        double saldoComLimite = this.getSaldo() + limite;
        if ((saldoComLimite - valor) >= 0) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("\nQuantia sacada da conta " + getNumeroConta() + "\nSeu novo saldo é de " + getSaldo());
        } else {
            System.out.println("\nImpossível sacar essa quantia da conta " + getNumeroConta());
        }
    }
}
