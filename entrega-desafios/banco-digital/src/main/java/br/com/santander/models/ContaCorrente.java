package br.com.santander.models;

import br.com.santander.entities.Cliente;
import br.com.santander.interfaces.IConta;

public class ContaCorrente extends Conta implements IConta {

    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco, "Conta Corrente");
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
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        double taxaTransferencia = 7.5d;
        if (saldo >= valor) {
            this.saldo -= valor + taxaTransferencia;
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
