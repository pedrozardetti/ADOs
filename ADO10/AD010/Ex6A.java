package AD010;

import java.util.Scanner;

public class Ex6A {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Insira o número base para calcularmos a expoência dele!");
            int numero = sc.nextInt();
            System.out.println("Informe o expoente desse número base");
            int expoente = sc.nextInt();

            if (numero >= 0 && expoente >= 0) {
                System.out.println(numero + " elevado a " + expoente + " é " + potenciaN(numero, expoente));
                break;
            }
            System.out.println("Cálculo inválido! Informe novamente os valores.");

        }
    }

    public static int potenciaN(int numero, int expoente) {
        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= numero;
        }
        return resultado;
    }
}
