package ProjetoIntegrador;

import java.util.Scanner;

public class FuncaoPI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Insira o número");
        numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    public static int sinais(int numero) {
        return numero;
    }

}
