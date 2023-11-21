package AD010;
import java.util.Scanner;

public class Ex4A {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe um número de início");
        int inicio = sc.nextInt();
        System.out.println("Informe um número de fim");
        int fim = sc.nextInt();

        System.out.println(
            "A soma dos números pares de " + inicio + " até " + fim + " é " + somarParesAte(inicio, fim));
    
    }

    public static int somarParesAte(int inicio, int fim) {
        int soma = 0;
        for (int numeroAtual = inicio; numeroAtual <= fim; numeroAtual++) {
            if(numeroAtual % 2 == 0)
            soma += numeroAtual;
        }

        return soma;
    }
}
