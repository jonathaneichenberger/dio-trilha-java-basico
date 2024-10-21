package br.com.santander.application;

import br.com.santander.entities.Cliente;
import br.com.santander.entities.Santander;
import br.com.santander.models.Banco;
import br.com.santander.models.Conta;
import br.com.santander.models.ContaCorrente;
import br.com.santander.models.ContaPoupanca;

public class Program {

    public static void main(String[] args) {

        Banco banco1 = new Santander();
        Banco banco2 = new Santander();
        Banco banco3 = new Santander();
        Banco banco4 = new Santander();
        Banco banco5 = new Santander();

        Conta ccjonathan = new ContaCorrente(new Cliente("Jonathan", "123.234.345-02", "jonathan@email.com", "(47)98765-3256", "Rua das palmeiras, 458"), banco1);
        Conta ccMaria = new ContaCorrente(new Cliente("Maria Silva", "345.567.789-00", "maria.silva@email.com", "(11)95678-1234", "Avenida Paulista, 123"),banco2);
        Conta ccPedro = new ContaCorrente(new Cliente("Pedro Souza", "456.678.890-11", "pedro.souza@email.com", "(21)98765-4321", "Rua das Laranjeiras, 45"),banco3);
        Conta ccAna = new ContaCorrente(new Cliente("Ana Oliveira", "567.789.901-22", "ana.oliveira@email.com", "(31)97654-5678", "Praça da Liberdade, 987"), banco4);
        Conta ccCarlos = new ContaCorrente(new Cliente("Carlos Pereira", "678.890.012-33", "carlos.pereira@email.com", "(41)96543-6789", "Rua XV de Novembro, 25"), banco5);
        Conta ccJulia = new ContaCorrente(new Cliente("Julia Santos", "789.901.123-44", "julia.santos@email.com", "(51)95432-7890", "Rua Sete de Setembro, 789"), banco1);
        Conta ccRoberto = new ContaCorrente(new Cliente("Roberto Costa", "890.012.234-55", "roberto.costa@email.com", "(61)94321-8901", "Avenida Brasil, 456"),banco3);
        Conta ccMariana = new ContaCorrente(new Cliente("Mariana Ribeiro", "901.123.345-66", "mariana.ribeiro@email.com", "(71)93210-9012", "Rua do Comércio, 234"),banco3);
        Conta ccFelipe = new ContaCorrente(new Cliente("Felipe Almeida", "012.234.456-77", "felipe.almeida@email.com", "(81)92109-0123", "Avenida Rio Branco, 101"), banco5);
        Conta ccFernanda = new ContaCorrente(new Cliente("Fernanda Lima", "123.345.567-88", "fernanda.lima@email.com", "(91)91098-1234", "Rua das Flores, 77"), banco5);
        Conta ccRicardo = new ContaCorrente(new Cliente("Ricardo Faria", "234.456.678-99", "ricardo.faria@email.com", "(85)90876-5432", "Rua dos Pinheiros, 333"), banco5);
        Conta cpJulia = new ContaPoupanca(new Cliente("Julia Souza", "345.567.678-00", "julia.souza@email.com", "(61)93210-7654", "Rua das Acácias, 256"),banco2);
        Conta cpRafael = new ContaPoupanca(new Cliente("Rafael Martins", "456.678.789-11", "rafael.martins@email.com", "(71)94321-6543", "Avenida Getúlio Vargas, 98"),banco2);
        Conta cpIsabela = new ContaPoupanca(new Cliente("Isabela Ferreira", "567.789.890-22", "isabela.ferreira@email.com", "(81)95432-5432", "Rua dos Jasmins, 564"),banco2);
        Conta cpLucas = new ContaPoupanca(new Cliente("Lucas Carvalho", "678.890.901-33", "lucas.carvalho@email.com", "(91)96543-4321", "Rua Dom Pedro II, 321"),banco2);
        Conta cpAmanda = new ContaPoupanca(new Cliente("Amanda Costa", "789.901.012-44", "amanda.costa@email.com", "(31)97654-3210", "Avenida Afonso Pena, 120"),banco2);
        Conta cpGustavo = new ContaPoupanca(new Cliente("Gustavo Lopes", "890.012.123-55", "gustavo.lopes@email.com", "(41)98765-2109", "Rua Barão de Mauá, 456"),banco2);
        Conta cpCarla = new ContaPoupanca(new Cliente("Carla Medeiros", "901.123.234-66", "carla.medeiros@email.com", "(51)99876-1098", "Rua Tiradentes, 90"),banco2);
        Conta cpEduardo = new ContaPoupanca(new Cliente("Eduardo Mendes", "012.234.345-77", "eduardo.mendes@email.com", "(21)90987-0987", "Avenida das Nações, 567"),banco3);
        Conta cpBeatriz = new ContaPoupanca(new Cliente("Beatriz Santana", "123.345.456-88", "beatriz.santana@email.com", "(11)90123-9876", "Rua São João, 45"),banco3);
        Conta cpThiago = new ContaPoupanca(new Cliente("Thiago Rodrigues", "234.456.567-99", "thiago.rodrigues@email.com", "(85)87654-8765", "Rua dos Bandeirantes, 123"),banco3);

        banco1.exibirInformacoes();
        banco2.exibirInformacoes();
        banco3.exibirInformacoes();
        banco4.exibirInformacoes();
        banco5.exibirInformacoes();

        System.out.println(banco2.encontrarCliente("Amanda Costa"));
        ccjonathan.depositar(1000);
        ccFelipe.depositar(100);
        ccJulia.depositar(300);
        ccCarlos.depositar(50);
        ccAna.depositar(10);
        cpLucas.depositar(600);
        cpEduardo.depositar(200);
        cpBeatriz.depositar(400);
        cpThiago.depositar(6700);
        cpAmanda.depositar(500);


        banco1.imprimirExtrato(ccjonathan);
        banco3.imprimirExtrato(ccFelipe);
        ccjonathan.transferir(500,ccFelipe);
        banco1.imprimirExtrato(ccjonathan);
        banco3.imprimirExtrato(ccFelipe);

        System.out.println(banco1.encontrarCliente("Jonathan"));
        System.out.println(banco1.encontrarConta(ccjonathan.getNumeroConta()));
        banco2.removerConta(cpCarla);
        System.out.println("--- Contas Banco2 com depósito ---");
        banco2.getContas().stream().filter(p -> p.getSaldo() > 0d).forEach(System.out::println);
    }

}