import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        double a, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número");
        a = sc.nextInt();

        resultado = a / 2;

        System.out.printf("A metade desse número é igual a %.1f", resultado);

    }
}
