package AD010;

import java.util.Scanner;

public class Ex10 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Informe um texto:");
        String texto = sc.nextLine();

        if (ehPalindromo(texto)) {
            System.out.println("O texto é um palíndromo.");
        } else {
            System.out.println("O texto não é um palíndromo.");
        }
    }

    public static boolean ehPalindromo(String texto) {
        String textoFormatado = texto.replaceAll("\\s", "").toLowerCase();
        int comprimento = textoFormatado.length();

        for (int i = 0; i < comprimento / 2; i++) {
            if (textoFormatado.charAt(i) != textoFormatado.charAt(comprimento - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
