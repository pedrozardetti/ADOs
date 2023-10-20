public class Exercicio5 {
    public static void main(String[] args) {
        // 𝑥2 − 5𝑥 + 6 = 0;

        double a = 1;
        double b = -5;
        double c = 6;

        double delta, raiz1, raiz2;

        delta = Math.pow(b, 2) - 4 * a * c;
        raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("A raiz 1 é " + raiz1 + " e a raiz 2 é " + raiz2);

    }

}