import java.util.Random;

public class ArrayAula2 {
    public static Random rand = new Random();

    public static void main(String[] args) {
        // arrayBi();
        // arrayRandom();
        arrayTri();

    }

    public static void arrayBi() {
        // array bidimensional de 4x5
        int[][] arrayBi = new int[4][5];
        for (int linha = 0; linha < arrayBi.length; linha++) {
            for (int coluna = 0; coluna < arrayBi[linha].length; coluna++) {
                arrayBi[linha][coluna] = rand.nextInt(101);

            }

        }

    }

    public static void arrayRandom() {
        int[][] arrayRandom = new int[4][5];
        for (int linha = 0; linha < arrayRandom.length; linha++) {
            System.out.print("[");
            for (int coluna = 0; coluna < arrayRandom[linha].length; coluna++) {
                arrayRandom[linha][coluna] = rand.nextInt(101);
                System.out.printf(" %03d ", arrayRandom[linha][coluna]);

            }
            System.out.println("]");
        }

    }

    public static void arrayTri() {
        int [][][] arrayTri = new int[4][5][10]; // array tridimensional de 4x5x10
        for (int i = 0; i < arrayTri.length; i++) {
            System.out.println("Matriz: " +i);
            for (int j = 0; j < arrayTri[i].length ; j++) {
                System.out.print("[ ");
                for (int k = 0; k < arrayTri[i][j].length; k++) {
                    arrayTri[i][j][k] = rand.nextInt(1000);
                    System.out.printf("%03d ", arrayTri[i][j][k]);
                }
                System.out.println("]");
                
            }
            
        }


    }

}
