package br.com.santander.models;

import br.com.santander.entities.Cliente;
import br.com.santander.interfaces.IConta;

public class ContaPoupanca extends Conta implements IConta {

    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco, "Conta Poupança");
    }

    @Override
    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (saldo >= valor) {
            this.saldo -= valor;
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
