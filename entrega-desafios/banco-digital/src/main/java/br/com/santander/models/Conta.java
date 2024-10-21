package br.com.santander.models;


import br.com.santander.entities.Cliente;
import br.com.santander.interfaces.IConta;
import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Conta implements IConta {

    private static int SEQUENCIAL = 1;

    protected Agencia agencia;
    protected int numeroConta;
    protected Cliente cliente;
    protected String tipoConta;
    @Setter
    protected double saldo;
    protected Banco banco;

    public Conta(Cliente cliente, Banco banco) {
        this.agencia = banco.getAgencia();
        this.numeroConta = SEQUENCIAL++;
        banco.adicionarCliente(cliente);
        banco.adicionarConta(this);
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public String getCliente() {
        return cliente.getNome();
    }

    public String getConta () {
        return tipoConta;
    }
}