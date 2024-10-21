package br.com.santander.models;

import br.com.santander.entities.Cliente;
import br.com.santander.interfaces.IConta;
import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Conta implements IConta {

    private static int SEQUENCIAL = 1;
    protected int numeroConta;
    @Setter
    protected String tipoConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta() {}

    public Conta(Cliente cliente, Banco banco, String tipoConta) {
        this.tipoConta = tipoConta;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
        banco.adicionarCliente(cliente);
        banco.adicionarConta(this);
        this.saldo = 0;
    }

    public String getNomeCliente() {
        return cliente.getNome();
    }

    @Override
    public String toString() {
        return "Conta: " + cliente +
                "\nNumeroConta: " + numeroConta +
                "\nSaldo: R$ " + saldo +
                "\nTipoConta: " + tipoConta;
    }
}
