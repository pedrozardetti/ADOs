import java.util.Scanner;

public class Ex02 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insira um número para saber os números naturais que o antecedem de forma decrescente!");
        int num = sc.nextInt();

        contarRegressivo(num);
    }

    public static void contarRegressivo(int num) {
        int i = num;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }
}

