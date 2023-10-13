import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        boolean numeroPar;
        System.out.println("Insira um número");
        n1 = sc.nextInt();

        numeroPar = n1 % 2 == 0;

        System.out.println("Numero é par? " + numeroPar);

    }
}
