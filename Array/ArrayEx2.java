import java.util.Random;
import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] nomes = new String[4]; // array de 4 posições para os nomes
        double[][] notas = new double[4][3];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Informe o nome do aluno " + (i+1));
            nomes[i] = sc.next();
            System.out.println("Informe as notas do(a) aluno " + nomes[i]);
            for(int j = 0; j < notas[i].length; j++)  {
                notas[i][j] = rand.nextDouble(10);
            }

        }
    }
}
