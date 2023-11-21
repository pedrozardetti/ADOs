import java.util.Scanner;

public class ExemploIf2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media;
        char classif;
        System.out.println("Informe a média");
        media = sc.nextDouble();

        if (media < 0 || media > 10) {
            System.err.println("Media Inválida");

        } else {
            if (media >= 0 && media < 2) {
                classif = 'E';
            } else if (media >= 2 && media < 4) {
                classif = 'D';
            } else if (media >= 4 && media < 6) {
                classif = 'C';
            } else if (media >= 6 && media < 8) {
                classif = 'B';
            } else {
                classif = 'A';

            }
            System.out.println("Classificação" + classif);
        }
    }

}
