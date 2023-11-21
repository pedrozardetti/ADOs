import java.util.Scanner;

public class Ex01 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Insira um número para saber os números naturais que o antecedem de forma crescente!");
        int numero = sc.nextInt();

    contar(numero);
    }

    public static void contar (int numero) {
        int i = 1;
        while (i < numero) {
            System.out.println(i);
            i++;
        }
    }
}
