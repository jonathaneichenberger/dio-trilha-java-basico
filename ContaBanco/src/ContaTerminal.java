import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //TODO:Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir a mensagem para o usuário, solicitando o nome do Cliente.
        System.out.print("Por Favor, identifique o nome do Cliente: ");
        //Obter pelo Scanner o nome do cliente digitado no terminal.
        String nomeCliente = scanner.nextLine();

        //Exibir a mensagem para o usuário, solicitando o código da Agência do Cliente.
        System.out.print("Por Favor, insira o código da Agência do Cliente " + nomeCliente + " : ");
        //Obter pelo Scanner o número da agência digitado no terminal.
        String numeroAgencia = scanner.next();

        //Exibir a mensagem para o usuário, solicitando o número da conta do Cliente.
        System.out.print("Por Favor, insira o número da Conta do Cliente " + nomeCliente + " : ");
        //Obter pelo Scanner o número da conta digitado no terminal.
        int numeroConta = scanner.nextInt();

        //Exibir a mensagem para o usuário, solicitando o saldo da conta do Cliente.
        System.out.print("Por Favor, insira o saldo da Conta do Cliente " + nomeCliente + " : ");
        //Obter pelo Scanner o valor do saldo da conta digitado no terminal.
        double saldoConta = scanner.nextDouble();

        //Exibir a mensagem da conta criada contendo: Nome do cliente, código da agência, número da conta, saldo disponível.
        System.out.println("\nOlá " + nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia
                + ", conta " + numeroConta
                + " e seu saldo " + String.format("%.2f",saldoConta )
                + " já está disponível para saque.");
    }
}