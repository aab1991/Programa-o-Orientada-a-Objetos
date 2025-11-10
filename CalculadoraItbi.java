
import javax.swing.JOptionPane;

public class CalculadoraItbi {
    public static void main(String[] args) {
        
        try{
            JOptionPane.showMessageDialog(null, "Calculadora de ITBI");

            double taxaItbi = 0.03;
            double valorImovel = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do imóvel: "));
            double valorVenal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor venal: "));

            if (valorImovel < valorVenal) {
                double itbi = valorImovel * taxaItbi;
                JOptionPane.showMessageDialog(null, "O valor do ITBI é de: R$ " + itbi);
            } else {
                double itbi = valorVenal * taxaItbi;
                JOptionPane.showMessageDialog(null, "O valor do ITBI é de: R$ " + itbi);
            }
               
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número válido.");

        }

    }

}
