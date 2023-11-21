import java.util.Scanner;

public class Ex06 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insira a quantidade de pontos em número");
        int tamanho = sc.nextInt();

        linha(tamanho);
    }

    public static void linha(int tamanho) {
        int i = 1;
        int totalAsteriscos = 0;

        while (i <= tamanho) {
            System.out.print("*");
            totalAsteriscos++;
            i++;
        }

        System.out.println(); 
    }
}


