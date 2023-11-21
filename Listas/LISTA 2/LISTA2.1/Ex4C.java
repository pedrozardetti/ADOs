import java.util.Scanner;

public class Ex4C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso, altura, imc;
        String classificacao;
        System.out.println("Informe o peso (em KG)");
        peso = sc.nextDouble();
        System.out.println("Informe a altura (em metros)");
        altura = sc.nextDouble();

        imc = peso / Math.pow(altura, 2);
        if (imc <= 16) {
            classificacao = "Magreza Severa";
        } else if (imc <= 17) {
            classificacao = "Magreza Moderada";
        } else if (imc <= 18.5) {
            classificacao = "Magreza Leve";
        } else if (imc <= 25) {
            classificacao = "Normal";
        } else if (imc <= 30) {
            classificacao = "Obesidade Leve";
        } else if (imc <= 40) {
            classificacao = "Obesidade Severa";
        } else {
            classificacao = "Obesidade Mórbida";
        }

        System.out.println("A classificação do paciente com base em seu IMC é: " + classificacao);

        sc.close();
    }
}
