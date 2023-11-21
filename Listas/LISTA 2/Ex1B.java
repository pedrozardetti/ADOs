import java.util.Scanner;

public class Ex1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero1, numero2;
        System.out.println("Informe o primeiro número");
        numero1 = sc.nextDouble();
        System.out.println("Informe o segundo número");
        numero2 = sc.nextDouble();

        if (numero1 == numero2) {
            System.out.println("O primeiro número e o segundo número são iguais");
        }
        else if (numero1 > numero2) {
            System.out.println("O primeiro número é maior que o segundo número");
        } else {
            System.out.println("O segundo número é maior");
        }
            
        }
            




    }
