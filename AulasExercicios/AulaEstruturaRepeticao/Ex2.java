import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media;
        Random rand = new Random();
        rand.nextInt(10, 20);

        for (int i = 1; i <= 50; i++) {
            media = 0;
            for (int j = 1; j <= 3; j++) {
                System.out.println("Informe a nota");
                media += rand.nextInt(11);
            }
            media = media / 3;
            System.out.println("Média do aluno " + i + "" + " = " + media);

        }
    }
}
