package br.com.santander.interfaces;

import br.com.santander.entities.Cliente;

public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, IConta contaDestino);
    String getConta(Cliente cliente);
}