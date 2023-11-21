import java.util.Scanner;

public class Ex9C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, media, notaRec = 0.0, novaMedia = 0.0;
        String resultado;
        System.out.println("Insira a 1ª nota");
        nota1 = sc.nextDouble();
        System.out.println("Insira a 2ª nota");
        nota2 = sc.nextDouble();
        System.out.println("Insira a 3ª nota");
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 6) {
            resultado = "Aluno Aprovado";
        } else if (media >= 5 && media <= 6) {
            resultado = "O aluno está de recuperação";
            System.out.println("Informe a nota da atividade de recuperação");
            notaRec = sc.nextDouble();
            
            novaMedia = (media + notaRec) / 2;

            if (novaMedia < 6) {
                resultado = "O aluno está reprovado!";
            } else {
                resultado = "O aluno está aprovado por recuperação";
            }
        } else {
            resultado = "Aluno Reprovado";
        }
        
        System.out.printf("O resultado da média é de %.1f%n",media);
        if (media >= 5 && media <= 6) {
            System.out.printf("A média final é de %.1f%n", novaMedia);
        }
        System.out.println(resultado);
    }   
}
