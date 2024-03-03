import java.util.Scanner;
public class ClasseExemplo {
    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Primeiro número: ");
        int n1 = Integer.valueOf(teclado.nextLine());
        System.out.println("Segundo número: ");
        int n2 = Integer.valueOf(teclado.nextLine());
        String modelo = "Quociente da divisão: ";

        //Quociente
        double quociente = (double) n1 / n2;
        System.out.println(modelo + quociente);

        //Potência
        modelo = "Potência do primeiro número pelo segundo número: ";
        double potencia = Math.pow(n1, n2);
        System.out.println(modelo + potencia);
    }

}
