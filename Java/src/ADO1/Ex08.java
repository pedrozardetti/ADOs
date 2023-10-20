import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado, perimetro;
        System.out.println("Informe o lado do octágono");
        lado = sc.nextInt();

        perimetro = lado * 8;

        System.out.println("O perímetro do octágono é " + perimetro);

    }
}
