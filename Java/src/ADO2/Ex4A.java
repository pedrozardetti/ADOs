import java.util.Scanner;

public class Ex4A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double reais, dolar;
        System.out.println("Insira um valor em reais");
        reais = sc.nextDouble();

        dolar = reais / 5.16;

        System.out.printf("O valor convertido de real para dólar é de $%.2f", dolar);

    }
}
