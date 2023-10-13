import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        boolean ator;
        System.out.println("Qual o personagem principal do filme Missão Impossível?");
        nome = sc.nextLine();

        ator = nome.toLowerCase().equals ("tom cruise");

        System.out.println("Resposta correta: " +ator);

    }
}
