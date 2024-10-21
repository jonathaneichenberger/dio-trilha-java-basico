package br.com.santander.interfaces;

import br.com.santander.entities.Cliente;
import br.com.santander.models.Conta;

public interface IBanco {
    void adicionarCliente(Cliente cliente);
    boolean removerCliente(Cliente cliente); // Agora retorna booleano
    Cliente encontrarCliente(String nome);
    void adicionarConta(Conta conta);
    boolean removerConta(Conta conta); // Agora retorna booleano
    Conta encontrarConta(int numeroConta);
    void exibirInformacoes();
    void imprimirExtrato(Conta conta);
}
