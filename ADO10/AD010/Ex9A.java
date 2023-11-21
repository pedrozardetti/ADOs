package AD010;

import java.util.Scanner;

public class Ex9A {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Informe um texto para ele ser invertido");
        String texto = sc.nextLine();

        System.out.println(inverter(texto));
    }

    public static String inverter (String texto) {
        String textoInvertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }

        return textoInvertido;
    }
}
