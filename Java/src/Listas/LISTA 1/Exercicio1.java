import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, peso1, peso2, peso3, media;
        System.out.println("Este programa calcula a media ponderada de 3 notas.");
        System.out.println("Por favor, informe três notas de (0-10)");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        System.out.println("Informe seus respectivos pesos em ordem crescente (1,2,3)");
        peso1 = sc.nextDouble();
        peso2 = sc.nextDouble();
        peso3 = sc.nextDouble();

        media = (n1 * peso1 + n2 * peso2 + n3 * peso3) / (peso1 + peso2 + peso3);

        System.out.printf("A média ponderada entre as notas é de %.2f", media);

    }

}