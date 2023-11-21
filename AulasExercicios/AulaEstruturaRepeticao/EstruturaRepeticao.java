public class EstruturaRepeticao {
    public static void main(String[] args) {
        printTabuada(7, 100000000);
    }

    public static void printTabuada(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d x %2d = %3d%n", num, i, num * i);
        }
    }
    public static void printTabuada15(int num) {
        for (int i = 1; i <= 15; i++) {
            System.out.printf("%2d x %2d = %3d%n", num, i, num * i);
        }
    }
    public static void printTabuada(int num, int limite) {
            for (int i = 1; i <= limite; i++) {
            System.out.printf("%2d x %2d = %3d%n", num, i, num * i);
    }
}
}


