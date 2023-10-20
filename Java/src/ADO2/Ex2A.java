import java.util.Scanner;

public class Ex2A {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorInicial, desconto, valorDesconto, valorFinal;
        System.out.println("Insira o valor da compra");
        valorInicial = sc.nextDouble();
        System.out.println("Insira o valor desejado do desconto (em porcentagem)"); 
        desconto = sc.nextDouble();

        valorDesconto = (desconto / 100.0) * valorInicial;
        valorFinal = valorInicial - valorDesconto;

        System.out.println("Sua compra foi finalizada! O total é de R$" +valorFinal);




    }
}
