import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {

        int num1, num2;
        double resultadoDivisao, resultadoPotencia;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        num1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        num2 = scanner.nextInt();
        scanner.close();

        resultadoDivisao = (double) num1 / num2;
        resultadoPotencia = Math.pow(num1, num2);
        System.out.println("Quociente da divisão: " + resultadoDivisao);
        System.out.println("Potência do primeiro número pelo segundo número: " + resultadoPotencia);
    }
}
