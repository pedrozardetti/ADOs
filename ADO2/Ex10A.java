import java.util.Scanner;

public class Ex10A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioBase, bonusMensal, totalDesconto, bonus, salarioLiq;
        System.out.println("Informe o salário base");
        salarioBase = sc.nextDouble();
        System.out.println("Informe o bônus mensal (em porcentagem)");
        bonusMensal = sc.nextDouble();
        System.out.println("Informe o total de desconto em reais");
        totalDesconto = sc.nextDouble();

        bonus = salarioBase * (bonusMensal / 100.0);
        salarioLiq = salarioBase + bonus - totalDesconto;

        System.out.println("O salário líquido é de R$" + salarioLiq);

    }
}
