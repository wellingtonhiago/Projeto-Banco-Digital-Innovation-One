package me.dio.banco;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;


    public ContaPoupanca(String nomeCliente, String numeroConta, double saldo, int diaRendimento) {
        super(nomeCliente, numeroConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public ContaPoupanca(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public ContaPoupanca() {
    }

    public int getDiaRendimento() {

        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {

        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        String s = "\n_________Conta tipo poupança_________" +
                super.toString() +
                "\nDia do Rendimento: " + diaRendimento;
        return s;
    }

    public void calcularNovoSaldoRendimento(double taxaRendimento) {
        Calendar hoje = Calendar.getInstance(); //Retorna o dia
        taxaRendimento = 0.5;
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            super.setSaldo(this.getSaldo() + this.getSaldo() * taxaRendimento);
            System.out.println("Novo saldo com rendimento é de " + getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento");
        }


    }
}
