import java.util.Scanner;

public class Ex5A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalCompra, qtdParcela, valorParcela;
        System.out.println("Informe o valor total da compra");
        totalCompra = sc.nextDouble();
        System.out.println("Informe a quantidade de parcelas");
        qtdParcela = sc.nextDouble();

        valorParcela = totalCompra / qtdParcela;

        System.out.printf(
                "Sua compra de R$%.2f em %.0fx de R$%.2f foi concluída", totalCompra, qtdParcela, valorParcela);

    }
}
