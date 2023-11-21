import java.util.Scanner;

public class Ex7A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cores;
        System.out.println("Escreva uma cor para verificar se é primária ou não");
        cores = sc.nextLine().toLowerCase();

        if (cores.equals("vermelho") || cores.equals("azul") || cores.equals("amarelo")) {
            System.out.println("A cor é primária");
        } else {
            System.out.println("A cor não é primária");
        }

    }
}
