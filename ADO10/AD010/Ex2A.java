package AD010;

import java.util.Scanner;

public class Ex2A {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insira um número para calcular o seu fatorial");
        int numero = sc.nextInt();

        System.out.println("O fatorial de " + numero + " é de " + fatorial(numero));

    }

    public static int fatorial(int numero) {
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

}
