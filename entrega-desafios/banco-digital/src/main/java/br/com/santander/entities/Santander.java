package br.com.santander.entities;


import br.com.santander.models.Banco;

public class Santander extends Banco {
    private static final String CNPJ_SANTANDER = "CNPJ: 90.400.888/0001-42";
    private static final String SANTANDER = "Banco Santander S.A.";
    private static final String ENDERECO = "Av. Presidente Juscelino Kubitscheck 2041/2235 – Vila Olímpia – São Paulo/SP.";
    private static final String TELEFONE = "0800 702 3535";

    public Santander() {
        super(SANTANDER, CNPJ_SANTANDER, ENDERECO, TELEFONE);
    }
}
