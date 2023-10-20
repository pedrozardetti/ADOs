package AD04PT1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;
        boolean senhaTamanho;
        System.out.println("Insira uma senha com tamanho mínimo de 6 caracteres");
        senha = sc.nextLine();

        senhaTamanho = senha.length() >= 6;

        System.out.println("A senha cumpre o requisito de tamanho? " + senhaTamanho);

    }
}
