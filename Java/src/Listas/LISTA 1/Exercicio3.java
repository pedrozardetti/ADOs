import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
         Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double deposito, taxaJuros, rendimento, total;
        System.out.println("Insira o valor do depósito");
        deposito = sc.nextDouble();
        System.out.println("Insira o valor da taxa de juros com ponto (em decimal)");
        taxaJuros = sc.nextDouble();

        rendimento = deposito * taxaJuros;
        total = deposito + rendimento;

        System.out.printf(
                "Portanto, o rendimento foi de %.2f e o valor total após o rendimento, considerando juros simples foi de %.2f",
                rendimento, total);

    }

}
