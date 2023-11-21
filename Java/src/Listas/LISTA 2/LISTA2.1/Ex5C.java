import java.util.Scanner;

public class Ex5C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, z;
        String tipoTriangulo;
        System.out.println("Informe o comprimento de um lado do triângulo");
        x = sc.nextDouble();
        System.out.println("Informe o comprimento de outro lado do triângulo");
        y = sc.nextDouble();
        System.out.println("Informe o comprimento de outro lado do triângulo");
        z = sc.nextDouble();

        if (x + y > z && x + z > y && y + z > x) {
            if (x == y && y == z) {
                tipoTriangulo = "Triângulo Equilátero";
            } else if (x == y || y == z || x == z) {
                tipoTriangulo = "Triângulo Isósceles";
            } else {
                tipoTriangulo = "Triângulo Escaleno";
            }
            System.out.println("Com base nos comprimentos informados, trata-se de um " + tipoTriangulo);
        } else {
            System.out.println("Os comprimentos informados não podem formar um triângulo.");
        }
    }
}
