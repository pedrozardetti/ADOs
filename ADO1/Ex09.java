import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, media;
        System.out.println("Informe três notas");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();

        media = (n1 + n2 + n3) / 3;

        System.out.printf("A media é %.1f", media);

    }

}
