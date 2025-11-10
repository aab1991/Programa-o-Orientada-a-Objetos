
import javax.swing.JOptionPane;

public class SistemaDeAvaliacao {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "Sistema de Avaliação");
        
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota: "));

        double media = (nota1 + nota2) / 2;

        if(media >= 6.0){
            JOptionPane.showMessageDialog(null, "Aprovado! Média: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado! Média: " + media);
        }
    }
}
