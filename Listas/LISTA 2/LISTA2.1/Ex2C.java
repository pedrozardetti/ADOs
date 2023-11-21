import java.util.Scanner;

public class Ex2C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioBase, gratificacao, salarioLiq, salarioBruto, imposto;
        System.out.println("Insira o salário base");
        salarioBase = sc.nextDouble();
        System.out.println("Insira a gratificação");
        gratificacao = sc.nextDouble();

        salarioBruto = salarioBase + gratificacao;

        if (salarioBruto < 2500) {
            imposto = salarioBruto * 0.10;
        } else {
            imposto = salarioBruto * 0.15;
        }

        salarioLiq  = salarioBruto - imposto; 

        System.out.printf("O salário bruto é de R$%.2f%n", salarioBruto);
        System.out.printf("A gratificação é de R$%.2f%n", gratificacao);
        System.out.printf("O imposto é de R$%.2f sob o salário bruto%n", imposto);
        System.out.printf("O salário líquido é de R$%.2f%n", salarioLiq);
    }

}
