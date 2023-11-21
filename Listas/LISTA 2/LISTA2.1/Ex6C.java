import java.util.Scanner;

public class Ex6C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double opcao, num1, num2, resultado, numRaiz, resultadoRaiz, numBase, expoente, resultadoPot;

        System.out.println("**** Menu de Opções ***** ");
        System.out.println("1. Somar dois números");
        System.out.println("2. Raiz quadrada de um número");
        System.out.println("3. Elevar um número a uma potência");
        System.out.println("**** Digite a opção desejada *****");
        opcao = sc.nextDouble();

        if (opcao == 1) {
            System.out.println("Insira o primeiro número");
            num1 = sc.nextDouble();
            System.out.println("Insira o segundo número");
            num2 = sc.nextDouble();
            resultado = num1 + num2;
            System.out.println("O resultado da soma é de " + resultado);

        } else if (opcao == 2) {
            System.out.println("Informe um número para descobrir a sua raíz quadrada");
            numRaiz = sc.nextDouble();
            if (numRaiz >= 0) {
                resultadoRaiz = Math.sqrt(numRaiz);
                System.out.println("A raíz quadrada é " + resultadoRaiz);
            } else {
                System.out.println("Esse número não é válido para a raíz quadrada");
            }
        } else if (opcao == 3) {
            System.out.println("Digite o número da base");
            numBase = sc.nextDouble();
            System.out.println("Digite o expoente");
            expoente = sc.nextDouble();
            resultadoPot = Math.pow(numBase, expoente);
            System.out.println("A potência é " + resultadoPot);
        } else {
            System.out.println("Opção inválida");
        }
    }
}
