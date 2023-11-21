import java.util.Scanner;

public class Ex3B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aluno, classificacao;
        double nota1, nota2, nota3, nota4, media;
        System.out.println("Informe o nome do aluno");
        aluno = sc.nextLine();
        System.out.println("Insira a 1ª nota");
        nota1 = sc.nextDouble();
        System.out.println("Insira a 2ª nota");
        nota2 = sc.nextDouble();
        System.out.println("Insira a 3ª nota");
        nota3 = sc.nextDouble();
        System.out.println("Insira a 4ª nota");
        nota4 = sc.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4)/4;

        if (media <= 20) {
            classificacao = "Péssimo";
        } else if (media >= 20 && media <= 40) {
            classificacao = "Ruim";
        } else if (media >= 40 && media <= 60) {
            classificacao = "Regular";
        } else if (media >= 60 && media <= 80) {
            classificacao = "Bom";
        } else {
            classificacao = "Ótimo";
        }
        System.out.printf("%s, sua média é %d e sua situação é %s", aluno, media, classificacao);

}
}
