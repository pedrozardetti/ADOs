
    import java.util.Scanner;

public class AD01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, z;
        System.out.println("Insira o 1º valor");
        x = sc.nextDouble();
        System.out.println("Insira o 2º valor");
        y = sc.nextDouble();
        System.out.println("Insira o 3º valor");
        z = sc.nextDouble();

        if (x + y > z && x + z > y && y + z > x) {
            if (x == y && y == z) {
                System.out.println("O triângulo é equilátero");
            } else if (x == y || x == z || z == y) {
                System.out.println("O triângulo é isósceles");
            } else {
                System.out.println("O triângulo é escaleno");
            }

        } else {
            System.out.println("Não é possível formar um triângulo");
        }

    }
}
