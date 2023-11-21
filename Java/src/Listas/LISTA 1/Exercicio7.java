import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pesoRacao, qntdFornecida, qntdConsumida, qntdRestante;
        System.out.println("Informe o peso do saco de ração (em Kg)");
        pesoRacao = sc.nextDouble();
        System.out.println("Informe a quantidade de ração para cada gato (em gramas)");
        qntdFornecida = sc.nextDouble();

        // Calcular a quantidade total consumida em 5 dias
        qntdConsumida = qntdFornecida * 2 * 5; // 2 gatos - 5 dias

        // Calcular a qntd. restante no saco
        qntdRestante = pesoRacao * 1000 - qntdConsumida; // Conversão de Kg para g

        if (qntdRestante >= 0) {
            System.out.println("Após cinco dias, restarão " + qntdRestante + " gramas de ração no saco.");
        } else {
            System.out.println("Não há ração suficiente para alimentar os gatos durante cinco dias.");
        }
    }

}