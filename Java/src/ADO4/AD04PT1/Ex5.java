package AD04PT1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double catetoOposto, catetoAdjacente, hipotenusa;
        System.out.println("Insira o valor do cateto oposto");
        catetoOposto = sc.nextDouble();
        System.out.println("Insira o valor do cateto adjacente");
        catetoAdjacente = sc.nextDouble();
        
        hipotenusa = Math.sqrt((catetoOposto * catetoOposto) + (catetoAdjacente *catetoAdjacente));
    
        System.out.printf("A hipotenusa é %.1f", hipotenusa);


    }
}
