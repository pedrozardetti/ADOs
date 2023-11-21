import java.util.Scanner;

public class Ex09 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Informe um número para realizar a tabuada!");
        int num = sc.nextInt();
        tabuada(num);

    }

    public static void tabuada(int num) {
        int multiplicador = 1;
        while (multiplicador <= 10) {
            int resultado = num * multiplicador;
            System.out.println(num + " x " + multiplicador + " = " + resultado);
            multiplicador++;
        }

    }
}
