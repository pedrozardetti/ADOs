import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tamanhoDoTanque, quantidadeDeCombustivel;
        boolean reabastecer;
        System.out.print("Digite o tamanho do tanque (em litros): ");
        tamanhoDoTanque = sc.nextDouble();
        System.out.print("Digite a quantidade atual de combustível (em litros): ");
        quantidadeDeCombustivel = sc.nextDouble();

        reabastecer = quantidadeDeCombustivel <= (tamanhoDoTanque / 4.0);

        System.out.println("É necessário reabastecer o carro? " + reabastecer);


    }
}
