import java.util.Scanner;

public class Ex8A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filme;
        int classif, idade1, idade2;
        System.out.println("Insira o nome do filme que você deseja assistir");
        filme = sc.nextLine();
        System.out.println("Informe a classificação do filme");
        classif = sc.nextInt();
        System.out.println("Informe a idade da primeira pessoa");
        idade1 = sc.nextInt();
        System.out.println("Informe a idade da segunda pessoa");
        idade2 = sc.nextInt();

        if (classif >= idade1 || classif >= idade2) {
            System.out.println("Vamos assistir o filme!");
        } else {
            System.out.println("Não vamos assistir o filme!");
        }

    }
}
