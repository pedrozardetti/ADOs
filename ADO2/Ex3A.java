import java.util.Scanner;

public class Ex3A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kilos, gramas;
        System.out.println("Insira um peso (em Kg)");
        kilos = sc.nextDouble();

        gramas = kilos * 1000;

        System.out.println("O peso é de " +gramas+ " gramas");

        
    }
}
