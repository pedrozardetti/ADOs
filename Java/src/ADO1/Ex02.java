import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int a, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número");
        a = sc.nextInt();

        resultado = a * 2;

        System.out.println("O dobro de " + a + " é igual a " + resultado);

    }

}
