package br.com.santander.models;

import br.com.santander.entities.Cliente;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public abstract class Banco {
    protected String nomeBanco;
    protected Agencia agencia;
    protected String cnpj;
    protected String endereco;
    protected String numeroTelefone;
    protected List<Cliente> clientes;
    protected List<Conta> contas;

    public Banco() {}

    protected Banco(String nomeBanco, String cnpj, String endereco, String numeroTelefone) {
        this.nomeBanco = nomeBanco;
        this.agencia = new Agencia();
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.numeroTelefone = numeroTelefone;
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
        } else {
            System.out.println("Cliente já existe");
        }
    }

    public boolean removerCliente(Cliente cliente) {
        if (!clientes.isEmpty() && clientes.contains(cliente)) {
            clientes.remove(cliente);
            return true;
        } else {
            System.out.println("Cliente não encontrado");
            return false;
        }
    }

    public Cliente encontrarCliente(String nome) {
        if (!clientes.isEmpty()) {
            for (Cliente cliente : clientes) {
                if (cliente.getNome().equalsIgnoreCase(nome)) {
                    return cliente;
                }
            }
        } else {
            System.out.println("Não existe clientes cadastrados");
        }
        return null;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public boolean removerConta(Conta conta) {
        if (contas.contains(conta) && conta.getSaldo() > 0) {
            System.out.println("Você tem um valor de R$ " + conta.getSaldo() + " e deve sacar-lo antes de encerrar a conta");
        } else if (contas.contains(conta) && conta.getSaldo() < 0){
            System.out.println("Seu saldo atual está NEGATIVO no valor de R$ " + conta.getSaldo() + " deposite valores superiores á dívida para encerrar a conta");
        } else if (contas.contains(conta) && conta.getSaldo() == 0) {
            System.out.println("Conta encerrada com sucesso");
            contas.remove(conta);
            return true;
        } else {
            System.out.println("Conta não encontrada");
        }
        return false;
    }

    public Conta encontrarConta(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    public void exibirInformacoes() {
        System.out.println("----------- BANCO ----------- ");
        System.out.println(nomeBanco + "\nAgência: " + agencia);
        System.out.println("----------- CONTAS ----------- ");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("Titular: " + clientes.get(i).getNome());
            System.out.println("Tipo de conta: " + contas.get(i).tipoConta);
            System.out.println("Número da conta: " + contas.get(i).getNumeroConta());
            System.out.println("Saldo: R$ " + contas.get(i).getSaldo());
        }
        System.out.println("=============================\n");
    }

    public void imprimirExtrato(Conta conta) {
        System.out.println("--------- EXTRATO ---------");
        System.out.println("Titular: " + conta.getNomeCliente());
        System.out.println("Saldo em " + LocalDate.now() + ": R$" + conta.getSaldo());
    }
}
