import java.util.Scanner;

public class Ex07 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Informe um número para formar um quadrado");
        int lado = sc.nextInt();

        quadrado(lado);
    }

    public static void quadrado (int lado) {
        int linha = lado;
        int coluna = lado;

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        
    }
}
