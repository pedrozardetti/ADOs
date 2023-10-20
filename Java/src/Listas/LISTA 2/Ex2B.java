import java.util.Scanner;

public class Ex2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero1, numero2, numero3, menorNumero;
        System.out.println("Informe o 1º número");
        numero1 = sc.nextDouble();
        System.out.println("Informe o 2º número");
        numero2 = sc.nextDouble();
        System.out.println("Informe o 3º número");
        numero3 = sc.nextDouble();

        if (numero1 <= numero2 && numero1 <= numero3) {
            System.out.println("O 1º número é o menor");    
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            System.out.println("O 2º número é o menor");
        } else {
            System.out.println("O 3º número é o menor");
        }
        
    }

}
