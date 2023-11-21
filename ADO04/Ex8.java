package AD04PT1;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorTotal, qtdParcelas, taxaJuros;
        double valorFinal, taxaConversao;
        System.out.println("Insira o valor total da compra");
        valorTotal = sc.nextInt();
        System.out.println("Insira a quantidade de parcelas");
        qtdParcelas = sc.nextInt();
        System.out.println("Insira a taxa de juros mensal em porcentagem");
        taxaJuros = sc.nextInt();

        taxaConversao = taxaJuros / 100.0;
        valorFinal = valorTotal * Math.pow(1 + taxaConversao, qtdParcelas);

        System.out.printf("Sua compra ficará em R$ %.2f em %d x de R$ %.2f por mês", valorFinal, qtdParcelas, valorFinal / qtdParcelas);
    }
}

