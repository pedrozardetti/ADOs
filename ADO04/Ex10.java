package AD04PT1;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mes;
        boolean libra;
        int dia;
        System.out.println("Insira o nome do mês de nascimento");
        mes = sc.nextLine();
        System.out.println("Insira o dia do nascimento");
        dia = sc.nextInt();

        if (mes.equalsIgnoreCase("Setembro") && dia >= 23 && dia <= 31) {
            System.out.println("Libra!");
        } else if (mes.equalsIgnoreCase("Outubro") && dia >= 1 && dia <= 22) {
            System.out.println("Libra!");
        } else {
            System.out.println("Mes ou dia invalido!");
        }
    }
}
