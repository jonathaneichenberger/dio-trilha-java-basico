package br.com.santander.models;

import lombok.Getter;

import java.util.Random;

@Getter
public class Agencia {
    private String codigoAgencia;

    public Agencia() {
        this.codigoAgencia = gerarNumeroAgencia();
    }

    public String gerarNumeroAgencia() {
        int[] pesos = { 5, 4, 3, 2 };
        int soma = 0;
        int digitoVerificador;
        Random random = new Random();
        String numeroAgencia = String.valueOf(1001 + random.nextInt(999));

        for (int i = 0; i < numeroAgencia.length(); i++) {
            int digito = Character.getNumericValue(numeroAgencia.charAt(i));
            soma += digito * pesos[i];
        }

        int resto = soma % 11;

        if (resto == 0 || resto == 1) {
            digitoVerificador = 0;
        } else {
            digitoVerificador = 11 - resto;
        }

        return numeroAgencia + "-" + digitoVerificador;
    }

    @Override
    public String toString() {
        return codigoAgencia;
    }
}
