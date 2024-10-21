package br.com.santander.models;

import br.com.santander.entities.Cliente;


public class ContaPoupanca extends Conta {


    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
        tipoConta = "Conta Poupanca";
    }

    @Override
    public String getConta(Cliente cliente) {
        return tipoConta;
    }
}