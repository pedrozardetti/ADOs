import java.util.Scanner;

public class Ex10C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, n4, qtdAulas, qtdPresenca, somaNotas, prcntPresenca;
        String premio;
        System.out.println("Insira a 1ª nota");
        n1 = sc.nextDouble();
        System.out.println("Insira a 2ª nota");
        n2 = sc.nextDouble();
        System.out.println("Insira a 3ª nota");
        n3 = sc.nextDouble();
        System.out.println("Insira a 4ª nota");
        n4 = sc.nextDouble();

        System.out.println("Insira a quantidade de aulas dadas (0 a 100)");
        qtdAulas = sc.nextDouble();

        System.out.println("Insira a quantidade de presenças");
        qtdPresenca = sc.nextDouble();

        somaNotas = n1 + n2 + n3 + n4;
        prcntPresenca = (qtdPresenca / qtdAulas) * 100;

        if (somaNotas > 80 && qtdPresenca == 100) {
            premio = "Excursão";
        } else if (somaNotas > 80 || qtdPresenca == 100) {
            premio = "Camiseta";
        } else if (somaNotas >= 70 && somaNotas <= 80 && qtdPresenca >= 90) {
            premio = "Squeeze";
        } else if (somaNotas >= 70 && somaNotas <= 80 || qtdPresenca >= 90) {
            premio = "Caneta Personalizada";
        } else {
            premio = "Não há prêmios para esse aluno";
        }

        System.out.printf("O prêmio a ser recebido pelo aluno é: %s%n", premio);
    }
}

