//criar um metodo que receba um valor inicial, um valor final, oercorra todo os números entre estes valores e exiba na tela os que são divisíveis por 2 e 3 ao mesmo tempo

public class ExEstruturaRepeticao {
    public static void main(String[] args) {
        long inicio, fim;
        //numAleatorio(1, 12);
        System.out.println(ehPrimo(999999999));
        inicio = System.currentTimeMillis();
        fim = System.currentTimeMillis();
        System.out.println(fim - inicio);
        System.out.println(inicio);
        System.out.println(fim);
    }   

    public static void numAleatorio(int valorI, int valorF) {
        for (int i = valorI; i <= valorF; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
    public static boolean ehPrimo (int num) {
        int qtdDiv = 0;
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                qtdDiv++; //ele vai incrementando à essa varíavel
            }
        }
        return qtdDiv == 2; //RETORNA O TESTE LÓGICO 
    }
}
