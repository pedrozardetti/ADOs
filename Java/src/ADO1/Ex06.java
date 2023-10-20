import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, base, area;
        System.out.println("Informe a altura e base do retângulo");
        altura = sc.nextInt();
        base = sc.nextInt();

        area = altura * base;
        System.out.println("A área do retângulo (" + altura + " por " + base + ") é " + area);

    }
}
