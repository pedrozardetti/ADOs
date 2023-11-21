import java.util.Random;

public class Ex4A {
    public static void main(String[] args) {
        Random rand = new Random();
        int numeroTotal = 6;

        for (int i = 0; i < numeroTotal; i++) {
            int numero = rand.nextInt(61);
            System.out.println(numero);
        }

    }
}
