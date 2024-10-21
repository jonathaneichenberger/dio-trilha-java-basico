package br.com.santander.entities;

import br.com.santander.models.Conta;
import lombok.Data;

import java.util.List;

@Data
public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;
    //private List<Conta> contaList;

    public Cliente(String nome, String cpf, String email, String telefone, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }
}