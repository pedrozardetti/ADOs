import java.util.Scanner;

public class Exercicio9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, hipotenusa;
        System.out.println("Informe o comprimento do cateto a");
        a = sc.nextDouble();
        System.out.println("Informe o comprimento do cateto b ");
        b = sc.nextDouble();

        hipotenusa = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        

        System.out.printf("O valor da hipotenusa é de %.2f", hipotenusa);



    }
}