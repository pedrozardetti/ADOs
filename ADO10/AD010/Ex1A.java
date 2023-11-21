package AD010;

import java.util.Scanner;

public class Ex1A {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insira um número");
        int numero = sc.nextInt();

        System.out.println("A soma dos números de 1 à " + numero + " é: " + somarAte(numero));

    }

    public static int somarAte(int numero) {
        int soma = 0;

        for (int i = 1; i <= numero; i++) {
            soma += i;
        }

        return soma;
    }
}
