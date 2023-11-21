package AD010;

import java.util.Scanner;

public class Ex8A {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insira uma mensagem");
        String texto = sc.nextLine();
        System.out.println(separar(texto));

    }

    public static String separar(String texto) {
        String mensagemFinal = texto.substring(0, 1);
        for (int i = 1; i < texto.length(); i++) {
            mensagemFinal += "-" + texto.charAt(i);
        }

        return mensagemFinal;
    }
}
