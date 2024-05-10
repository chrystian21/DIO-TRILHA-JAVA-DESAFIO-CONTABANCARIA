import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira seu nome");
        String primeiroNome = scanner.next();

        System.out.println("Insira seu sobrenome");
        String sobrenomeCliente = scanner.next();

        String nomeCliente = primeiroNome + " " + sobrenomeCliente;

        System.out.println("Insira o número da conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Insira o número da agência");
        String numeroAgencia = scanner.next();

        System.out.println("Insira o valor do seu depósito");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + "" + ", obrigado por criar uma conta em nosso banco, sua agência é " +
         numeroAgencia + " " + "conta " + numeroConta + " e seu saldo de R$" + saldo +" já está disponível para saque");
        
        
    }
}
