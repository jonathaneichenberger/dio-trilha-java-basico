package br.com.santander.interfaces;

import br.com.santander.entities.Cliente;
import br.com.santander.models.Conta;

public interface IBanco {
    public void adicionarCliente(Cliente cliente);
    public void removerCliente(Cliente cliente);
    public Cliente encontrarCliente(String nome);
    public void adicionarConta(Conta conta);
    public void removerConta(Conta conta);
    public Conta encontrarConta(int numeroConta);
    public void exibirInformacoes();
}
