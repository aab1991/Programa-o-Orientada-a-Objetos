import java.util.Scanner;

public class GeradorTabuada {
    public static void main(String[] args) {
        try (Scanner myScanner = new Scanner(System.in)){
            System.out.println("Insira um número: ");
            int n = myScanner.nextInt();
            System.out.println("Tabuada de " + n + ": ");
            for (int i = 1; i <= 10; i++) {
                int resultado = n + i;
                System.out.println(n + " + " + i + " = " + resultado);
            }
            for (int i = 1; i <= 10; i++) {
                int resultado = n - i;
                System.out.println(n + " - " + i + " = " + resultado);
            }
            for (int i = 1; i <= 10; i++) {
                int resultado = n * i;
                System.out.println(n + " * " + i + " = " + resultado);
            }
            for (int i = 1; i <= 10; i++) {
                int resultado = n / i;
                System.out.println(n + " / " + i + " = " + resultado);
            }
        }
    }
}