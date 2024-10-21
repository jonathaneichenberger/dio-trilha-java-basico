package br.com.santander.models;

import br.com.santander.entities.Cliente;

public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
        tipoConta = "Conta Corrente";
    }

    @Override
    public String getConta(Cliente cliente) {
        return tipoConta;
    }
}