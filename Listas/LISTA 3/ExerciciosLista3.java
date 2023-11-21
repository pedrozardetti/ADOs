import java.util.Scanner;

public class ExerciciosLista3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        ex4();
    }

    public static void ex1() {
        for (int i = 50; i <= 9500; i += 3) {
            System.out.println(i + " é divisível por 3");
        }

        for (int i = 50; i < 9500; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " é divisivel por 3");
            }
        }

    }

    public static void ex2() {
        for (int i = 1; i <= 250; i++) {
            if (i % 10 == 0) {
                System.out.println(i + " é divisível por 10");
            } else
                System.out.println(i);
        }

    }

    public static void ex3() {
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma = soma + i;
            System.out.println("A soma de 1 até " +i+ " é igual a " +soma);
        } 
    }

    public static void ex4() {
        int soma = 0, fim;
        System.out.println("Informe qual o termo final");
        fim = sc.nextInt();
        for (int i = 1; i <= fim; i++) {
            soma += i;
        }
        System.out.println(soma);
    } 
}
