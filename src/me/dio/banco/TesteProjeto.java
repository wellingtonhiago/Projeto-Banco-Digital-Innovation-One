package me.dio.banco;

public class TesteProjeto {
    public static void main(String[] args) {
        System.out.println("********Teste Conta Bancaria********");

        ContaBancaria[] testeConta = new ContaBancaria[2];

        testeConta[0] = new ContaBancaria("Cliente Teste", "242424", 50);
        testeConta[1] = new ContaBancaria("Cliente Teste 2", "454545", 100);

        testeConta[0].setNomeCliente("Cliente Teste modificado");

        System.out.println(testeConta[0]);
        System.out.println("\n" + testeConta[1]);

        testeConta[0].sacar(40);
        System.out.println("\n" + testeConta[0]);

        ContaPoupanca[] poupançaTeste = new ContaPoupanca[2];
        poupançaTeste[0] = new ContaPoupanca("Poupança Teste", "333333", 300, 12 );
        poupançaTeste[1] = new ContaPoupanca("Poupança Teste 2", "444444", 600,12);

        System.out.println(poupançaTeste[0]);
        poupançaTeste[0].calcularNovoSaldoRendimento(0.5);

        System.out.println("Total de contas criadas foram: " + ContaBancaria.getTotalContas());


        poupançaTeste[0].sacar(20);
        System.out.println(poupançaTeste[0].toString());

        ContaEspecial contaEspecial = new ContaEspecial("Teste Conta Especial", "555555", 800, 100);

        System.out.println(contaEspecial.toString());
        contaEspecial.sacar(900);
        System.out.println(contaEspecial.getSaldo());

    }
}
