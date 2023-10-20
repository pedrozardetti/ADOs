import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, conta1, conta2, multaConta1, multaConta2, totalMultas, salarioRestante;

        System.out.println("Insira o salário de João");
        salario = sc.nextDouble();
        System.out.println("Insira o valor da primeira conta");
        conta1 = sc.nextDouble();
        System.out.println("Insira o valor da segunda conta");
        conta2 = sc.nextDouble();

        // Calcular a multa da primeira conta (2%)
        multaConta1 = 0.02 * conta1;

        // Calcular a multa da segunda conta (3,5%)
        multaConta2 = 0.035 * conta2;

        // Calcular o valor total das multas
        totalMultas = multaConta1 + multaConta2;

        // Calcular o restante do salário de João
        salarioRestante = salario - totalMultas;

        System.out.printf("O valor restante do salário de João após pagar as contas é de %.2f", salarioRestante);

    }

}
