package br.com.santander.entities;

import lombok.Data;

@Data
public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;

    public Cliente(String nome, String cpf, String email, String telefone, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\nCliente = " + nome +
                "\nCpf = " + cpf +
                "\nEmail = " + email +
                "\nTelefone = " + telefone +
                "\nEndereco = " + endereco;
    }
}
