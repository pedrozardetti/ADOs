package AD04PT1;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mesDia;
        System.out.println("Insira o número que representa o mês para saber se é o 1º semestre");
        mesDia = sc.nextInt();

        if (mesDia >= 1 && mesDia <= 3) {
            System.out.println("É o primeiro semestre!");
        } else {
            System.out.println("Não é o primeiro semestre!");
        }

    }
}
