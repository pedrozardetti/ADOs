import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, media;
        boolean alunoPassou;
        System.out.println("Digite a nota 1: ");
        n1 = sc.nextDouble();
        System.out.println("Digite a nota 2 ");
        n2 = sc.nextDouble();
        System.out.println("Digite a nota 3");
        n3 = sc.nextDouble();

        media = (n1 + n2 + n3) / 3;
        alunoPassou = media >= 6.0;

        System.out.println("A média do aluno é " + media);
        System.out.println("O aluno passou? " + alunoPassou);

    }

}
