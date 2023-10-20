import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ladoR1, ladoR2, ladoR3, ladoR4, area1, area2;
        boolean saoIguais;
        System.out.println("Informe os lados do 1º retângulo ");
        ladoR1 = sc.nextDouble();
        ladoR2 = sc.nextDouble();
        System.out.println("Informe os lados do 2º retângulo");
        ladoR3 = sc.nextDouble();
        ladoR4 = sc.nextDouble();

        area1 = ladoR1 * ladoR2;
        area2 = ladoR3 * ladoR4;

        saoIguais = area1 == area2;

        System.out.println("O 1º retângulo possui área de " + area1);
        System.out.println("O 2º retângulo possui área de " + area2);
        System.out.println("Eles são iguais? " + saoIguais);

    }
}
