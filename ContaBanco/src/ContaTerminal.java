import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Olá, por favor informe seu nome: ");
        String nomeCliente = scan.nextLine();

        System.out.print("Por favor, informe qual o número de sua agência: ");
        String agenciaConta = scan.nextLine();

        System.out.print("Por favor, informe o número da conta: ");
        int numeroConta = scan.nextInt();

        System.out.print("Agora, informe o saldo da sua conta: ");
        float saldoConta = scan.nextFloat();

        System.out.println("Olá " +nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agenciaConta+ ", conta "+numeroConta+" e seu saldo "+saldoConta+" já está disponível para saque!");
    }
}
