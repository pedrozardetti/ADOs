import java.util.Scanner;

public class Ex1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, ultimoNome;
        int espaco;
        System.out.println("Insira seu nome completo");
        nome = sc.nextLine();

        espaco = nome.lastIndexOf(" ");
        ultimoNome = nome.substring(espaco + 1);

        System.out.println("Seja bem vindo " +ultimoNome);

    }
}
