import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {  public static void main(String[] args) throws Exception {
    Double saldo = 237.48;

    try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
        System.out.println("Por favor,digite o seu nome ?");
        String cliente = scanner.next();
        System.out.println("Por favor,digite o seu sobrenome?");
        String resposta = scanner.next();
        System.out.println("O número da sua Agência?");
        String Agência= scanner.next();
        System.out.println("O número da sua conta?");
        String conta =scanner.next();
        System.out.println("saldo");
                System.out.println ("Olá, Sra. " + cliente + "." + resposta +",obrigado por criar uma conta em nosso banco,sua agência é " + Agência  +   " e sua conta "  + conta + 
                ". E seu saldo é R$" + saldo);
    }
} }
