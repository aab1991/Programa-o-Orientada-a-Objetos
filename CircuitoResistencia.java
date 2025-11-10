import java.util.Arrays;
import java.util.Scanner;

public class CircuitoResistencia {
    public static void main(String[] args) {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.println("Circuito de Resistencia");
            double[] r = new double[4];
            int i = 0;
            while (i <= 3) {
                System.out.printf( "Digite o valor da %dª resistência (em ohms): ", i + 1);
                r[i] = myScanner.nextDouble();
                i++;
            }
            double rMe = Arrays.stream(r).min().getAsDouble();
            double rMa = Arrays.stream(r).max().getAsDouble();
            double rEq = r[0] + r[1] + r[2] + r[3];
            System.out.println("Resistencia mínima: " + rMe + " ohms\n" +
                                "Resistencia máxima: " + rMa + " ohms\n" +
                                "Resistencia equivalente: " + rEq + " ohms");
        }
    }
}
