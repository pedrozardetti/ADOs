import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        int lado, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o lado do quadrado");

        lado = sc.nextInt();

        area = lado * lado;

        System.out.println("A área do quadrado é " + area);
    }
}
