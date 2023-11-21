import java.util.Scanner;

public class Ex6A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primeiraPos, razao, posicDesejada, valorTermo;
        System.out.println("Digite o valor da primeira posição");
        primeiraPos = sc.nextInt();
        System.out.println("Digite a razão da progressão");
        razao = sc.nextInt();
        System.out.println("Digite a posição desejada");
        posicDesejada = sc.nextInt();

      
        valorTermo = (int) (primeiraPos * Math.pow(razao, posicDesejada - 1));
        System.out.println("O valor do termo na posição " + posicDesejada + " é " + valorTermo);
    }
}
