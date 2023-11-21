import java.util.Scanner;

public class Ex8C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano, proxAnoBissexto;
        System.out.println("Digite um ano");
        ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto");
        } else {
            proxAnoBissexto = ano + 1;

            while (true) {
                if ((proxAnoBissexto % 4 == 0 && proxAnoBissexto % 100 != 0) || (proxAnoBissexto % 400 == 0)) {
                    System.out.println("O próximo ano bissexto é " + proxAnoBissexto + ".");
                    break;
                }
                proxAnoBissexto++;
            }
        }
    }
}
