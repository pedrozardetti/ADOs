package AD04PT1;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double previsaoTemp;
        boolean vamosParque;
        System.out.println("Insira a previsão da temperatura durante a tarde");
        previsaoTemp = sc.nextDouble();
        
        vamosParque = previsaoTemp >= 23 && previsaoTemp <=30;

        if (previsaoTemp >= 23 && previsaoTemp <= 30) {
            System.out.println("Vamos ao parque? " + vamosParque);
        } else {
            System.out.println("Vamos ao parque? " + vamosParque);
        }

    }
}
