import java.util.Random;

public class ArrayEx {
        public static void main(String[] args) {
        Random rand = new Random();
        // Preenchendo o array com 10 valores aleatórios
        for (int i = 0; i < Array.len; i++) {
            array[i] = rand.nextInt(100);
        }
        // Exibindo os valores do Array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        // exibindo os valores com "for each"
        for (int num : numeros) {
            System.out.println(num);
        }
    }

}
