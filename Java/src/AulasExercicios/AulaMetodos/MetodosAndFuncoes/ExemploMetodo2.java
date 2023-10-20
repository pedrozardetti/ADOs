package MetodosAndFuncoes;

import java.util.Scanner;

public class ExemploMetodo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double volume, raio, altura;
        int idade;
        String cpf, cpfLimpo;
        System.out.println("Informe o raio do cone");
        raio = sc.nextDouble();
        System.out.println("Informe a altura do cone");
        altura = sc.nextDouble();
        volume = vol(raio, altura);
        System.out.printf("O volume do cone é de %.2f ", volume);

        System.out.println(" Informe a idade da pessoa");
        idade = sc.nextInt();

        if(maiorIdade(idade)) {
            System.out.println("Essa pessoa é maior de idade");
        } else {
            System.out.println("Essa pessoa é menor de idade");
        }

        System.out.println("Insira seu CPF (com pontos e hífen)");
        cpf = sc.nextLine();
    }

    public static double vol(double r, double a) {
        double volume;
        volume = (Math.PI * (r * r) * a) / 3;
        return volume;
    }

    public static boolean maiorIdade(int i) {
        boolean idade = i >= 18;
        return idade;

    }

    public static String cpfLimpo (String c) {
        String cpf;
        cpfLimpo = cpf.replace(".", "") && 


    }
}
