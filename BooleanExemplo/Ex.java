package BooleanExemplo;

import java.util.Locale;
import java.util.Scanner;

public class Ex {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) { 
        System.out.println("Informe a temperatura");
        double temp = ler.nextDouble();

        boolean confere = temp >= 37.5;

        System.out.println("Esta com febre? " +confere);

    }
}
