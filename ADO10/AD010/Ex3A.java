package AD010;
import java.util.Scanner;



public class Ex3A {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe um número");
        int numero = sc.nextInt();

        System.out.println("A soma dos números pares de 1 até " + numero + " é " + somarParesAte(numero));
    }

    public static int somarParesAte(int numero) {
        int soma = 0;
        for (int numeroAtual = 0; numeroAtual <= numero; numeroAtual += 2) {
            soma += numeroAtual;
        }

        return soma;
    }
}

