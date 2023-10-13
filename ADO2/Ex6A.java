import java.util.Scanner;

public class Ex6A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double capacidade, consumo, distancia, combustivelNecessario, paradas;
        System.out.println("Informe a capacidade do tanque do veículo (em Litros)");
        capacidade = sc.nextDouble();
        System.out.println("Informe quantos km o veículo consome por litro");
        consumo = sc.nextDouble();
        System.out.println("Informe a distância da viagem (em km)");
        distancia = sc.nextDouble();

        combustivelNecessario = distancia / consumo;
        paradas = Math.ceil(combustivelNecessario / capacidade);

        System.out.println("Você precisará fazer " + paradas + " paradas para abastecer.");

    }

}
