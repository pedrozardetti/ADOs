import java.util.Scanner;

public class Ex7A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double qtdAcai, totalVenda, preçoAcai;
        System.out.println("Insira a quantidade de açaí que deseja comprar");
        qtdAcai = sc.nextDouble();

        preçoAcai = 13.5;
        totalVenda = qtdAcai * preçoAcai;

        System.out.println("O total à pagar é de R$" + totalVenda);

    }

}
