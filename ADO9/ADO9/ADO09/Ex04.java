import java.util.Scanner;

public class Ex04 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insira o primeiro número");
        int inicio = sc.nextInt();
        System.out.println("Insira o segundo número para saber quais números estão entre eles de forma regressiva");
        int fim = sc.nextInt();

        contarRegressivo(fim, inicio);
    }

    public static void contarRegressivo(int fim, int inicio) {
        int i = fim;
        while (i >= inicio) {
            System.out.println(i);
            i--;

        }

    }
}
