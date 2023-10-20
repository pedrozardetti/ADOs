package AulasExercicios;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tipoPlano;
        int valorPlano;
        System.out.println("Informe seu plano de saúde");
        tipoPlano = sc.nextLine();
        switch (tipoPlano.toLowerCase(null)) {
            case "básico":
                System.out.println("R$150,00");
                break;
            case "bronze":
                System.out.println("R$220,00");
                break;
            case "prata":
                System.out.println("R$310,00");
                break;
            case "ouro":
                System.out.println("R$450");
                break;
            default: 
                System.out.println("Plano Inválido");

        }

    }

}
