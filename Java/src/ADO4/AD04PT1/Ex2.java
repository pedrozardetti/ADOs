package AD04PT1;

import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, nomeCompleto;
        int espaco;
        System.out.println("Insira seu nome");
        nome = sc.nextLine();

        espaco = nome.indexOf(" ", 0);
        nomeCompleto = nome.substring(0, espaco);

        System.out.println("Seja bem vindo " + nomeCompleto);

    }
}
