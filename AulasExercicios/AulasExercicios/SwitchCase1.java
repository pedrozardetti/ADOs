package AulasExercicios;

import java.util.Scanner;
public class SwitchCase1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String turma;
        System.out.println("Informe o mês");
        turma = sc.next();
        switch (turma.toLowerCase(null)) {
            case "janeiro":
                System.out.println("Janeiro");
                break;
            case "fevereiro":
                System.out.println("Fevereiro");
                break;
            default:
                System.out.println("Mês inválida");

        }

    }

}
