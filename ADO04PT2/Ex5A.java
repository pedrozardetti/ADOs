import java.util.Scanner;

public class Ex5A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, x1, x2, delta;
        System.out.println("Insira os valores de A, B e C");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Os valores para x são " + x1 + " e " + x2);
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("Há uma raiz real: " + x1);
        } else {
            System.out.println("Não há raiz real");
        }
    }
}

