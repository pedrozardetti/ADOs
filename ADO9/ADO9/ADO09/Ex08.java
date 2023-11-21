import java.util.Scanner;

public class Ex08 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe um número para ser a base do retângulo");
        int base = sc.nextInt();
        System.out.println("Informe um número para ser a altura do retângulo");
        int altura = sc.nextInt();

        retangulo(base, altura);
    }

    public static void retangulo(int base, int altura) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

