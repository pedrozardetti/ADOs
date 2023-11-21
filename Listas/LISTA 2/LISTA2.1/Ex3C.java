import java.util.Scanner;

public class Ex3C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, novoSalario, bonificacao, auxilio;
        System.out.println("Insira o salário do funcionário");
        salario = sc.nextDouble();

        if (salario <= 2000) {
            bonificacao = salario * 0.10;
        } else if (salario >= 2000 && salario <= 3000) {
            bonificacao = salario * 0.08;
        } else {
            bonificacao = salario * 0.05;
        }
        if (salario <= 2500) {
            auxilio = 350.00; //valor fixo
        } else {
            auxilio = 300.00; //valor fixo 
        }

        novoSalario = auxilio + salario + bonificacao;

        System.out.printf("O novo salário do funcionário é de %.2f", novoSalario);

    }
}
