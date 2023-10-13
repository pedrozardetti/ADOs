import java.util.Scanner;

public class Ex1A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorInicial, cupom, valorFinal;
        System.out.println("Insira o valor da compra");
        valorInicial = sc.nextDouble();
        System.out.println("Insira o valor desejado do desconto");
        cupom = sc.nextDouble();

        valorFinal = valorInicial - cupom;

        System.out.println("Sua compra foi finalizada! O total é de R$" + valorFinal);

    }
}
