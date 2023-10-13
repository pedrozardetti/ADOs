import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, base, area;
        System.out.println("Informe a altura e base do triângulo");
        altura = sc.nextInt();
        base = sc.nextInt();

        area = altura * base / 2;
        System.out.printf("A área do triângulo é %.1f", area);

    }

}
