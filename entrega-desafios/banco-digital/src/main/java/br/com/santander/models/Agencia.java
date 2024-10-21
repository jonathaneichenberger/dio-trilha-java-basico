package br.com.santander.models;

import lombok.Getter;

import java.util.Random;

@Getter
public class Agencia {
    private String codigoAgencia;

    public Agencia() {
        this.codigoAgencia = definirNumeroAgencia();
    }

    /**
     * Este método gera um número de agência aleatório e calcula o dígito verificador utilizando o método do módulo 11.
     *<p>
     * O cálculo do dígito verificador é uma forma comum de validar números como contas bancárias, números de agência, CPFs e
     * outros códigos numéricos, ajudando a prevenir fraudes ou erros de digitação. O dígito verificador é obtido somando
     * os produtos dos dígitos da agência pelos pesos e, em seguida, aplicando o módulo 11.</p>
     *
     * <p>Processo do cálculo:
     * <p>1. Um número de agência aleatório é gerado entre 1001 e 1999.
     * <p>2. Cada dígito do número da agência é multiplicado por um peso correspondente (neste caso, {5, 4, 3, 2}).
     * <p>3. Os resultados das multiplicações são somados.
     * <p>4. O resto da divisão dessa soma por 11 é calculado.
     * <p>5. Se o resto for 0 ou 1, o dígito verificador será 0.
     * <p>6. Caso contrário, o dígito verificador será a diferença entre 11 e o valor do resto.
     *
     * <p>Exemplo de cálculo:
     * <p>Se o número da agência for "1234", o cálculo seria:
     * <p>(1 * 5) + (2 * 4) + (3 * 3) + (4 * 2) = 5 + 8 + 9 + 8 = 30
     * <p>Resto da divisão por 11: 30 % 11 = 8
     * <p>O dígito verificador será 11 - 8 = 3.
     *
     * @return Uma string representando o número da agência seguido do dígito verificador no formato "NNNN-D".
     */

    public String definirNumeroAgencia() {
        // Pesos para o cálculo do código de verificação do número da agência
        int[] pesos = { 5, 4, 3, 2 };
        int soma = 0;
        int digitoVerificador;
        Random random = new Random();

        // Gera um número de agência aleatório entre 1001 e 1999
        String numeroAgencia = String.valueOf(1001 + random.nextInt(999));

        // Multiplica cada dígito pelos pesos e soma os resultados
        for (int i = 0; i < numeroAgencia.length(); i++) {
            int digito = Character.getNumericValue(numeroAgencia.charAt(i));
            soma += digito * pesos[i];
        }

        // Calcula o resto da divisão por 11
        int resto = soma % 11;

        // Regra para determinar o dígito verificador
        if (resto == 0 || resto == 1) {
            digitoVerificador = 0; // Se o resto for 0 ou 1, o dígito verificador é 0
        } else {
            digitoVerificador = 11 - resto; // Caso contrário, é 11 menos o resto
        }

        // Retorna o número da agência junto com o dígito verificador no formato "NNNN-D"
        return numeroAgencia + "-" + digitoVerificador;
    }

    @Override
    public String toString() {
        return codigoAgencia;

    }
}
