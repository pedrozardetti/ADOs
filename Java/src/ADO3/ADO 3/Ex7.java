import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, peso, imc;
        boolean pesoIdeal;
        System.out.println("Informe a altura do indivíduo (em metros)");
        altura = sc.nextDouble();
        System.out.println("Insira o peso do indivíduo (em kg)");
        peso = sc.nextDouble();

        imc = peso / (altura * altura);
        pesoIdeal = imc > 24.9;
        System.out.printf("Seu IMC é de %.2f", imc);
        System.out.println(" Está acima do peso ideal? " + pesoIdeal);

    }
}
