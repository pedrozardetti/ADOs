import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperatura;
        boolean temFebre;
        System.out.println("Digite a temperatura em graus Celsius: ");
        temperatura = sc.nextDouble();

        temFebre = temperatura >= 37.3;

        System.out.println("Você está com febre? " + temFebre);

    }
}
