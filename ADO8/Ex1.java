import java.util.Scanner;

public class Ex1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe o comprimento do lado 1");
        int lado1 = sc.nextInt();
        System.out.println("Informe o comprimento do lado 2");
        int lado2 = sc.nextInt();
        System.out.println("Informe o comprimento do lado 3");
        int lado3 = sc.nextInt();
        String tipo = tipoTriangulo(lado1, lado2, lado3);
        System.out.println("Esse é um triângulo " + tipo);

    }

    public static String tipoTriangulo(int l1, int l2, int l3) {
        if (l1 <= 0 || l2 <= 0 || l3 <= 0) {
            return "Não é um triângulo válido";
        }

        if (l1 == l2 && l2 == l3) {
            return "Equilátero";
        } else if (l1 == l2 || l2 == l3 || l1 == l3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }

    }

}
