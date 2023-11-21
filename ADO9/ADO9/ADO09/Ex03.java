import java.util.Scanner;

public class Ex03 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insira o primeiro número");
        int inicio = sc.nextInt();
        System.out.println("Insira o segundo número para saber quais números estão entre eles");
        int fim = sc.nextInt();

        contar(inicio, fim);
    }

    public static void contar(int inicio, int fim) {
        int i = inicio;
        while (i <= fim) {
            System.out.println(i);
            i++;

        }
    }
}
