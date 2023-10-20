import java.util.Scanner;

public class Ex10A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diametro1, altura1, diametro2, altura2, volume1, volume2;
        boolean podeTransferir;
        System.out.print("Digite o diâmetro do primeiro cilindro (em metros): ");
        diametro1 = sc.nextDouble();
        System.out.print("Digite a altura do primeiro cilindro (em metros): ");
        altura1 = sc.nextDouble();
        System.out.print("Digite o diâmetro do segundo cilindro (em metros): ");
        diametro2 = sc.nextDouble();
        System.out.print("Digite a altura do segundo cilindro (em metros): ");
        altura2 = sc.nextDouble();

        volume1 = Math.PI * Math.pow((diametro1 / 2), 2) * altura1;
        volume2 = Math.PI * Math.pow((diametro2 / 2), 2) * altura2;

        podeTransferir = volume1 <= volume2;

        System.out.println("O primeiro cilindro tem volume de" + volume1);
        System.out.println("O segundo cilindro tem volume de" + volume2);
        System.out.println("É possível transferir o primero para o segundo? " + podeTransferir);

    }
}
