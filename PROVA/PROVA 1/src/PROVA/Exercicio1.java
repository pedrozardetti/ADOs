package PROVA;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, media, notaRec = 0.0, novaMedia = 0.0;
        String premio;
        System.out.println("Insira 3 notas ");
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 6) {
            System.out.println("Aluno Aprovado");
        } else {
            System.out.println("O aluno está de recuperação, informe a nota da nova atividade (de 6 a 10)");
            notaRec = sc.nextDouble();

        } novaMedia = (media + notaRec) / 2;

            System.out.println("Parabéns, você foi aprovado");
            System.out.println("Agora escolha o seu prêmio desejado: uma squeeze ou uma chave");
            premio = sc.next();

            if(premio.equals("squeeze")) {
                 System.out.println("Ótima escolha. A squeeze é muito top!!");
            } 
               System.out.println("Esperamos que você aproveite!");
            
                System.out.println("E Fique tranquilo, teremos mais prêmios no futuro");
        } 
            
    }   

