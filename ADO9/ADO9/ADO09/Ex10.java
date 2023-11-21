import java.util.Scanner;

public class Ex10 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escreva uma frase para ser soletrada");
        String mensagem = sc.nextLine();

        soletrar(mensagem);
    }

    public static void soletrar(String mensagem) {
        for (int i = 0; i < mensagem.length(); i++) {
            char caractere = mensagem.charAt(i);
            System.out.println(caractere);
        }
        
    }
}
