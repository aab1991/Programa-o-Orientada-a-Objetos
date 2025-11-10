import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.println("Digite o nome de usuário: ");
            String user = myScanner.nextLine();
            System.out.println("Digite a senha:");
            String senha = myScanner.nextLine();
            if (user.equals("java8") && senha.equals("java8")) {
                System.out.println("Login realizado com sucesso!");
            } else {
                System.out.println("Usuário ou senha incorretos.");
            }
        }
    }

}
