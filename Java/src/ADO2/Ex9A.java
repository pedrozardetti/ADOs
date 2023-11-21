import java.util.Scanner;

public class Ex9A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double qtdPequeno, qtdMedio, qtdGrande, precoPeq, precoMed, precoGrnd, valorDesconto, desconto, total;
        System.out.println("Insira a quantidade de açaí pequeno desejado");
        qtdPequeno = sc.nextDouble();
        System.out.println("Insira a quantidade de açai médio desejado");
        qtdMedio = sc.nextDouble();
        System.out.println("Insira a quantiade de açaí grande desejado");
        qtdGrande = sc.nextDouble();
        System.out.println("Insira o valor do desconto");
        valorDesconto = sc.nextDouble();
    
        precoPeq= 13.50;
        precoMed = 15.00;
        precoGrnd = 17.50;
        desconto = valorDesconto / 100;
        total = (qtdPequeno * precoPeq + qtdMedio * precoMed + qtdGrande * precoGrnd) * (1 - desconto);

        System.out.printf("O total à pagar é de R$%.2f", total);

    }
}
    
