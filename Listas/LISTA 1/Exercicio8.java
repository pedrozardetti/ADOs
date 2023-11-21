import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double medidaPes, convPolegadas, convJardas, convMilhas;
        System.out.println("Insira uma medida em pés");
        medidaPes = sc.nextDouble();

        convPolegadas = medidaPes * 12;
        convJardas = medidaPes / 3;
        convMilhas = convJardas / 1760;

        System.out.println("A medida em polegadas é de " + convPolegadas);
        System.out.println("A medida em jardas é de " + convJardas);
        System.out.println("A medida de em milhas é de " + convMilhas);

    }
}