import java.util.Scanner;

public class Ex8A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double qtdPequeno, qtdMedio, qtdGrande, precoPeq, precoMed, precoGrnd, total;
        System.out.println("Insira a quantidade de açaí pequeno desejado");
        qtdPequeno = sc.nextDouble();
        System.out.println("Insira a quantidade de açai médio desejado");
        qtdMedio = sc.nextDouble();
        System.out.println("Insira a quantiade de açaí grande desejado");
        qtdGrande = sc.nextDouble();

    
        precoPeq= 13.50;
        precoMed = 15.00;
        precoGrnd = 17.50;
        total = qtdPequeno * precoPeq + qtdMedio * precoMed + qtdGrande * precoGrnd;
        System.out.printf("O total à pagar é de R$%.2f", total);

    }
}
