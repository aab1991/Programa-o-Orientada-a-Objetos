import java.util.Scanner;

public class CalculadoraDeAposentadoria {
    public static void main(String[] args) {

        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.println("Calculadora de Aposentadoria");
            System.out.println("Selecione seu sexo (1 para Masculino, 2 para Feminino): ");
            int sexo = myScanner.nextInt();
            System.out.println("Informe sua Idade: ");
            int idade = myScanner.nextInt();
            System.out.println("Informe seus Anos de Contribuição: ");
            int anosDeCont = myScanner.nextInt();
            

            switch (sexo) {
                case 1 -> {
                    if (idade >= 65 && anosDeCont >= 20 || anosDeCont >= 35) {
                        System.out.println("Você já pode se aposentar!");
                    } else {
                        int anosFaltantes = 65 - idade;
                        int contFaltantes = 35 - anosDeCont;
                        System.out.println("Faltam " + anosFaltantes + 
                        " anos de idade ou " + contFaltantes + 
                        " anos de contribuição para se aposentar.");
                    }
                }
                case 2 -> {
                    if (idade >= 62 && anosDeCont >= 15 || anosDeCont >= 30) {
                        System.out.println("Você já pode se aposentar!");
                    } else {
                        int anosFaltantes = 62 - idade;
                        int contFaltantes = 30 - anosDeCont;
                        System.out.print("Faltam " + anosFaltantes + 
                        " anos de idade ou " + contFaltantes + 
                        " anos de contribuição para se aposentar.");                        
                    }
                }
                default -> System.out.print("Sexo inválido. Por favor, insira 1 para Masculino ou 2 para Feminino.");
            }                
                
        }
    }
}
