import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {
        // criando o objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, me informe seu nome:");
        String nomeCliente = scanner.next();
        String sobrenome = scanner.next();

        System.out.println("Digite o número da sua Agência:");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua Conta:");
        int numero = scanner.nextInt();

        System.out.println("Qual seu saldo atual?");
        double saldo = scanner.nextDouble();


        // Imprimindo os dados obtidos pelo usuário
        System.out.println("Olá " + nomeCliente + " " + sobrenome + 
        ", obrigado por criar sua conta em nosso banco, sua agência é "
         + agencia + ", conta " + numero + " e seu saldo de R$" 
         + saldo + " já está disponível para saque.");
    }
}