package AD04PT1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double imc, altura, peso;
        System.out.println("Insira a altura de uma pessoa em metros");
        altura = sc.nextDouble();
        System.out.println("Insira o peso da pessoa em kg");
        peso = sc.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("Seu IMC é %.2f", imc);

    }
}
