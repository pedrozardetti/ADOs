import java.util.Scanner;

public class Ex1C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sexo;
        double altura, pesoIdeal;
        System.out.println("Insira o sexo da pessoa (M para Masculino e F para feminino)");
        sexo = sc.nextLine().toUpperCase();
        System.out.println("Insira a altura em centímetros (sem vírgula)");
        altura = sc.nextDouble();
        
        pesoIdeal = 0.0;

        if (sexo.equals("M")) {
            pesoIdeal = 52 + (0.75 * (altura - 152.4));
        } else if (sexo.equals("F")) {
            pesoIdeal = 52 + (0.67 * (altura - 152.4)); 
        } else {
            System.out.println("O sexo informado não corresponde ao solicitado. Insira M ou F para prosseguir");
        }

        System.out.printf("O peso ideal do indivíduo é de %.1f", pesoIdeal);

    }
}
