import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, n4, n5, media;
        System.out.println("Informe 5 notas");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        n4 = sc.nextDouble();
        n5 = sc.nextDouble();

        media = (n1 + n2 + n3 + n4 + n5) / 5;

        System.out.printf("A média é %.1f", media);

    }

}
