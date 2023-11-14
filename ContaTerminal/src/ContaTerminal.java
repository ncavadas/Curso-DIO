import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        System.out.println("Por favor, digite o número da Agência!");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Agência:");
        String agencia = teclado.nextLine();

        int numero = 4426;
        String nomeCliente = "Claudio";
        double saldo = 4555.51;

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");

        teclado.close();
    }
}
