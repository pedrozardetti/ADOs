import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double salario, aumento, novoSalario;
        System.out.println("Informe o nome do funcionário");
        nome = sc.nextLine();
        System.out.println("Informe o salário do funcionário");
        salario = sc.nextDouble();

        aumento = 0.25 * salario;
        novoSalario = salario + aumento;

        System.out.println("O funcionário " + nome + "recebeu um aumento de " + aumento + " e seu novo salário é de "
                + novoSalario);

    }

}
