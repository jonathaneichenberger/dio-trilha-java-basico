package Exceptions;

public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException() {

        // Configura a mensagem padrão que será exibida quando a exceção for lançada
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}
