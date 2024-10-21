package br.com.santander.models;

import br.com.santander.entities.Cliente;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;


@Data
public abstract class Banco {
    protected String nome;
    protected Agencia agencia;
    protected String cnpj;
    protected String endereco;
    protected String numeroTelefone;
    protected List<Cliente> clientes;
    protected List<Conta> contas;

    protected Banco(String nome, String cnpj, String endereco, String numeroTelefone) {
        this.nome = nome;
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

    public void removerCliente(Cliente cliente) {
        if(!clientes.isEmpty()) {
            for(Cliente c : clientes) {
                if (c.equals(cliente)) {
                    clientes.remove(c);
                }
            }
        } else {
            System.out.println("Não existe clientes cadastrados");
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

    public void removerConta(Conta conta) {
        contas.remove(conta);
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
        System.out.println(nome + "\nAgência: " + agencia);
        System.out.println("----------- CONTAS ----------- ");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("Titular: " + clientes.get(i).getNome());
            System.out.println("Tipo de conta: " + contas.get(i).getConta());
            System.out.println("Número da conta: " + contas.get(i).getNumeroConta());
        }
        System.out.println("=============================\n");
    }
}
