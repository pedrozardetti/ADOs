import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int a, b, resultado1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro valor");
        a = sc.nextInt();
        System.out.println("Informe o segundo valor");
        b = sc.nextInt();
        resultado1 = a + b;
        System.out.println("A soma de " +a+ " e " + b + " é " +resultado1);

    }
}
