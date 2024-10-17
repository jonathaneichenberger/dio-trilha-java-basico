package application;
import Exceptions.ParametrosInvalidosException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        // Cria um objeto Scanner para capturar a entrada do usuário pelo terminal
        Scanner terminal = new Scanner(System.in);

        // Solicita ao usuário que insira o primeiro parâmetro
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();  // Armazena o valor digitado na variável parametroUm

        // Solicita ao usuário que insira o segundo parâmetro
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();  // Armazena o valor digitado na variável parametroDois


        try {
            /*
             * Chama o método contar, passando os parâmetros (parametroUm) e (parametroDois)
             * recebidos da entrada do usuário através da instância da classe Scanner.
             */
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            // Exibe a mensagem da exceção capturada
            System.out.println(exception.getMessage());
        }

    }

    /**
     * Método que realiza uma contagem incremental a partir de 1 até a diferença entre parametroDois e parametroUm.
     * Valida se o segundo parâmetro (parametroDois) é maior que o primeiro (parametroUm).
     * Caso contrário, lança a exceção ParametrosInvalidosException.
     *
     * @param parametroUm   o primeiro valor inserido pelo usuário
     * @param parametroDois o segundo valor inserido pelo usuário
     * @throws ParametrosInvalidosException se parametroDois não for maior que parametroUm
     */
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        // Verifica se parametroUm é MAIOR ou IGUAL ao parametroDois e lança a exceção caso seja.
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        // Calcula a diferença entre parametroDois e parametroUm, que será usada como o limite de contagem.
        int contagem = parametroDois - parametroUm;

        /*
         * Laço for que realiza a contagem de 1 até o valor da variável (contagem),
         * imprimindo os números no console até atingir o limite.
         */
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }


}