package AD010;

import java.util.Scanner;

public class Ex5A {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Informe um número para encontrar os múltiplos:");
        int numero = sc.nextInt();

        System.out.println("Informe um número de início:");
        int inicio = sc.nextInt();

        System.out.println("Informe um número de fim:");
        int fim = sc.nextInt();

        int soma = somarMultiplos(numero, inicio, fim);

        System.out.println(
                "A soma dos números múltiplos de " + numero + " de " + inicio + " até " + fim + " é " + soma);
    }

    public static int somarMultiplos(int numero, int inicio, int fim) {
        int soma = 0;
        for (int numeroAtual = inicio; numeroAtual <= fim; numeroAtual++) {
            if (numeroAtual % numero == 0) {
                soma += numeroAtual;
            }
        }

        return soma;
    }
}
