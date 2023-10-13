import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        int a, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número");
        a = sc.nextInt();

        resultado = a * 3;

        System.out.println("O triplo de " + a + " é igual a " + resultado);

    }
}
