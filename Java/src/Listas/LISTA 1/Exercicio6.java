import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        // 𝑎𝑥2 + 𝑏𝑥 + 𝑐 = 0.

        Scanner sc = new Scanner(System.in);
        double a, b, c, delta, raiz1, raiz2;
        System.out.println("Informe o valor de a");
        a = sc.nextDouble();
        System.out.println("Informe o valor de b");
        b = sc.nextDouble();
        System.out.println("Informe o valor de c");
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) { 
            System.out.println("A equação não possui raízes reais. ");
        } else { 

        raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("A raiz 1 é " + raiz1 + " e a raiz 2 é " + raiz2);
        }
    }

}
