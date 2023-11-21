package MetodosAndFuncoes;

import java.util.Scanner;

public class ExemploMetodo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, multi;
        System.out.println("Informe dois valores");
        x = sc.nextDouble();
        y = sc.nextDouble();
        multi = mult(x, y);
        exibirResultado(multi);
        

    }

    // MÉTODO 1 - COM RETORNO
    /**
     * Este método multiplica dois valores recebidos e retorna o resultado
     * @param n1 primeiro valor a ser multiplicado
     * @param n2 segundo valor a ser mutiplicado
     * @return resultado da multiplicação
     */
    public static double mult(double n1, double n2) {
        double resultado;
        resultado = n1 * n2;
        return resultado;
        // esse método que criamos TEM RETORNO;
        // a responsabilidade do método é MULTIPLICAR os valores
    }

    // METODO 2 - SEM RETORNO
    public static void exibirResultado(double r) {
        // A variável 'double r' guarda o valor do método 'multi' para exibi-la no
        // método;
        System.out.println("O Resultado da Multiplicacao é: " + r);
        // um método pode ter o mesmo nome, o que importa é a ASSINATURA DO MÉTODO
        //

    }

    public static double mult(double n1, double n2, double n3) {
        double resultado;
        resultado = n1 * n2 * n3;
        return resultado;
    }
}
