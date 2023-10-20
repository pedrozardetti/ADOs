package AD04PT1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase, vogal;
        System.out.println("Informe uma frase para aplicar uma pseudo criptografia");
        frase = sc.nextLine();

        vogal = frase.replace("a", "i")
                .replace("e", "i")
                .replace("o", "i")
                .replace("u", "i");

        System.out.println(vogal);

    }
}
