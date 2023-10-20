package ADO04PT2;

import java.util.Scanner;

public class Ex2A {
        
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhaForte;
        int nmrSenha = 0;
        System.out.println("Insira uma senha");
        senhaForte = sc.nextLine();

        if (senhaForte.length() >= 6 && (senhaForte.contains("!") || senhaForte.contains("@") || senhaForte.contains("#")
                || senhaForte.contains("$") || senhaForte.contains("%") || senhaForte.contains("^") || senhaForte.contains("&")
                || senhaForte.contains("*") || senhaForte.contains("(") || senhaForte.contains(")")
                || senhaForte.contains("_")) && (nmrSenha >= 0 && nmrSenha <= 9999999)) {
            System.out.println("A senha cumpre os requisitos de segurança!");
        } else {
            System.out.println("A senha não é forte o suficiente");
        }
    }
}

