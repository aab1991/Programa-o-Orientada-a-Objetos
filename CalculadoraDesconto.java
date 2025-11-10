import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {
        
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.println("Digite o valor do produto: ");
            float valorProduto = myScanner.nextFloat();
            
            System.out.println("Digite o valor do desconto:");
            float valorDesconto = myScanner.nextFloat();
            
            float valorFinal = valorProduto - (valorProduto * (valorDesconto / 100));
            
            System.out.printf("O valor final do produto com desconto é: R$ %.2f%n", valorFinal);
        }
    }
}
