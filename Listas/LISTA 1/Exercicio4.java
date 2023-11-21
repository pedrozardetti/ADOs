import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio, area, perimetro;
        System.out.println("Informe o raio do círculo");
        raio = sc.nextDouble();

        area = Math.PI * Math.pow(raio, 2);
        perimetro = 2 * Math.PI * raio;

        System.out.printf("A área do círculo é %.2f e seu perímetro é %.2f", area, perimetro);

    }
}
