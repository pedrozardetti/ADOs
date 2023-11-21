import java.util.Scanner;

public class Ex05 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insira o primeiro número");
        int inicio = sc.nextInt();
        System.out.println("Insira o segundo número para saber quais são os números pares entre eles");
        int fim = sc.nextInt();

        contarPares(inicio, fim);

    }

    public static void contarPares(int inicio, int fim) {
        int i = inicio;
        while (i <= fim) {
            if (i % 2 == 0) {
                System.out.println(i);

            }

            i++;

        }
    }
}
