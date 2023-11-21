package LISTA4;

import java.util.Random;
import java.util.Scanner;

public class ExerciciosADO {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Exercicio1();
        // Exercicio2();
        // Exercicio3();
        // Exercicio4();
        // Exercicio5();
        // Exercicio6();
        // Exercicio7();
        // Exercicio8();
        // Exercicio9();
        // Exercicio10();
        // Exercicio11();
        // Exercicio12();
        // Exercicio13();
        // Exercicio14();
        // Exercicio15();
        // Exercicio16();
        // Exercicio17();
    }

    public static void Exercicio1() {
        for (int i = 50; i <= 9500; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void Exercicio2() {
        for (int i = 1; i <= 250; i++) {
            System.out.println(i);
            if (i % 10 == 0) {
                System.out.println(i + " É multiplo de 10");
            }

        }
    }

    public static void Exercicio3() {
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma = soma + i;
            System.out.println(soma);
        }
    }

    public static void Exercicio4() {
        System.out.println("Ate qual termo você deseja que seja exibida a soma?");
        int termoFinal = sc.nextInt();
        int soma = 0;
        for (int i = 1; i <= termoFinal; i++) {
            soma = soma + i;
            System.out.println(soma);
        }
    }

    public static void Exercicio5() {
        int soma = 0;
        for (int i = 1; i <= 15; i++) {
            int termo = i * 5;
            soma += termo;
            System.out.println(soma);

        }
    }

    public static void Exercicio6() {
        System.out.println("Qual o primeiro termo da sequência desejada?");
        int primeiroT = sc.nextInt();
        System.out.println("Qual o último termo da sequência desejada?");
        int ultimoT = sc.nextInt();
        int soma = 0;
        for (int i = primeiroT; i <= ultimoT; i++) {
            int termo = i * 5;
            soma += termo;
            System.out.println(soma);
        }
    }

    public static void Exercicio7() {
        double salarioFuncionario = 1000.0;
        double percentual = 1.5 / 100;
        for (int ano = 2011; ano <= 2023; ano++) {
            salarioFuncionario += salarioFuncionario * percentual;

            if (ano >= 2012) {
                percentual *= 2;
            }
        }
        System.out.printf("O salário atual do funcionário é de R$%.2f", salarioFuncionario);
    }

    public static void Exercicio8() {
        System.out.println("Informe o salário de Carlos");
        double salarioCarlos = sc.nextDouble();
        double investimentoCarlos = salarioCarlos;
        double investimentoJoao = salarioCarlos / 3;
        double rendimentoCarlos = 2 / 100.0;
        double rendimentoJoao = 5 / 100.0;
        int meses = 0;

        while (investimentoJoao < investimentoCarlos) {
            investimentoCarlos += investimentoCarlos * rendimentoCarlos;
            investimentoJoao += investimentoJoao * rendimentoJoao;
            meses++;
        }

        System.out.println(
                "Será necessário " + meses + " meses para que João iguale ou ultrapasse o valor pertencente a Carlos");

    }

    public static void Exercicio9() {
        int somaNumero = 0;
        int qtdNegativos = 0;
        int numero;

        System.out.println("Digite valores inteiros ou digite 0 se deseja sair!");
        while (true) {
            numero = sc.nextInt();
            if (numero == 0) {
                break;
            }
            if (numero > 0) {
                somaNumero += numero;
            } else {
                qtdNegativos++;
            }
            System.out.println("Digite valores inteiros ou digite 0 se deseja sair:");
        }

        System.out.println("A soma dos números positivos é: " + somaNumero);
        System.out.println("A quantidade de números negativos é: " + qtdNegativos);

    }

    public static void Exercicio10() {
        int notaAluno;

        System.out.println("Informe a nota do aluno");
        while (true) {
            notaAluno = sc.nextInt();
            if (notaAluno >= 0 && notaAluno <= 10) {
                if (notaAluno >= 6) {
                    System.out.println("Aprovado!!!!");
                    break;
                } else if (notaAluno >= 5) {
                    System.out.println("Está de recuperação");
                    break;
                } else {
                    System.out.println("Reprovado");
                    break;
                }
            } else {
                System.out.println("Nota inválida, tente novamente.");
            }

        }
    }

    public static void Exercicio11() {
        boolean continuarPrograma = true;
        double salarioFuncionario, imposto;

        while (continuarPrograma) {
            System.out.println("----- Menu de opções -----");
            System.out.println("1. Imposto");
            System.out.println("2. Novo salário");
            System.out.println("3. Classificação");
            System.out.println("4. Finalizar o programa");
            System.out.println("Digite a opção desejada.");
            System.out.println("-----------------------------------");

            int opcoes = sc.nextInt();

            switch (opcoes) {
                case 1:
                    System.out.println("Informe o salário do funcionário para calcular os impostos");
                    salarioFuncionario = sc.nextDouble();

                    if (salarioFuncionario <= 1500) {
                        imposto = salarioFuncionario * 0.05;
                    } else if (salarioFuncionario >= 1500.01 && salarioFuncionario <= 3000) {
                        imposto = salarioFuncionario * 0.10;
                    } else {
                        imposto = salarioFuncionario * 0.15;
                    }
                    System.out.printf("O imposto é de R$%.2f\n", imposto);
                    break;
                case 2:
                    System.out.println("Informe o salário do funcionário");
                    salarioFuncionario = sc.nextDouble();

                    if (salarioFuncionario > 4500) {
                        salarioFuncionario += 250;
                    } else if (salarioFuncionario > 3000) {
                        salarioFuncionario += 200;
                    } else if (salarioFuncionario > 2000) {
                        salarioFuncionario += 150;
                    } else {
                        salarioFuncionario += 130;
                    }
                    System.out.printf("O novo salário é de R$%.2f\n", salarioFuncionario);
                    break;
                case 3:
                    System.out.println("Insira o salário do funcionário");
                    salarioFuncionario = sc.nextDouble();

                    if (salarioFuncionario > 3000) {
                        System.out.println("Parabéns, você é bem remunerado!!");
                    } else {
                        System.out.println("Que pena! Você é mal remunerado! Procure outro emprego.");
                    }
                    break;
                case 4:
                    continuarPrograma = false;
                    System.out.println("Programa finalizado :)");
                    break;

                default:
                    System.out.println("Opção inválida! Insira novamente outro valor :)");
                    break;
            }
        }
    }

    public static void Exercicio12() {
        System.out.println("Informe o valor de referência:");
        double valorReferencia = sc.nextDouble();
        double valorKw = valorReferencia / 10;
        double faturamentoGeral = 0;
        int qtdConsumidores = 0;

        System.out.println("O valor de cada kW é: R$ " + valorKw);

        while (true) {
            System.out.println("Informe a quantidade de kW gasta");
            int quantidadeKw = sc.nextInt();

            if (quantidadeKw == 0) {
                break;
            }
            System.out.println("Qual tipo de consumidor você é?");
            System.out.println("1. Residencial");
            System.out.println("2. Comercial");
            System.out.println("3. Industrial");
            System.out.println("Digite a opção que corresponde à sua realidade:");

            int tipoConsumidor = sc.nextInt();
            double valorPago;

            switch (tipoConsumidor) {
                case 1:
                    valorPago = quantidadeKw * valorKw * 1.05;
                    break;
                case 2:
                    valorPago = quantidadeKw * valorKw * 1.10;
                    break;
                case 3:
                    valorPago = quantidadeKw * valorKw * 1.15;
                    break;
                default:
                    System.out.println("Opção inválida. Insira um tipo de consumidor correto!");
                    continue;
            }

            System.out.printf("Valor a ser pago pelo consumidor: R$ %.2f\n", valorPago);
            faturamentoGeral += valorPago;

            if (valorPago >= 500 && valorPago <= 1000) {
                qtdConsumidores++;
            }
        }

        System.out.println("Faturamento geral da empresa: R$ " + faturamentoGeral);
        System.out
                .println("Quantidade de consumidores que pagam entre R$ 500,00 e R$ 1.000,00: " + qtdConsumidores);
    }

    public static void Exercicio13(int numTermos) {
        int termo1 = 2;
        int termo2 = 7;
        int termo3 = 3;

        for (int i = 1; i <= numTermos; i++) {
            if (i % 3 == 1) {
                System.out.print(termo1 + " ");
                termo1 *= 2;
            } else if (i % 3 == 2) {
                System.out.print(termo2 + " ");
                termo2 *= 3;
            } else {
                System.out.print(termo3 + " ");
                termo3 *= 4;
            }
        }
        System.out.println();
    }

    public static void Exercicio14() {
        int tabuada = 1;

        while (tabuada <= 10) {
            int i = 0;

            while (i < 11) {
                System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
                i++;
            }

            tabuada++;
        }
    }

    public static void Exercicio15() {

        int numJogadores = 15;
        int numTimes = 5;

        Random random = new Random();

        int[] idades = new int[numJogadores * numTimes];
        double[] pesos = new double[numJogadores * numTimes];
        double[] alturas = new double[numJogadores * numTimes];

        for (int i = 0; i < numJogadores * numTimes; i++) {
            idades[i] = random.nextInt(20) + 15;
            pesos[i] = 70 + random.nextDouble() * 30;
            alturas[i] = 1.5 + random.nextDouble() * 0.5;
        }

        int jogadoresMenoresDe18 = 0;
        double somaIdades = 0;
        double somaAlturas = 0;
        int jogadoresMaisDe80Kg = 0;

        for (int i = 0; i < numJogadores * numTimes; i++) {
            if (idades[i] < 18) {
                jogadoresMenoresDe18++;
            }

            somaIdades += idades[i];
            somaAlturas += alturas[i];

            if (pesos[i] > 80) {
                jogadoresMaisDe80Kg++;
            }
        }

        double mediaIdades = somaIdades / (numJogadores * numTimes);
        double mediaAlturas = somaAlturas / (numJogadores * numTimes);
        double percentualMaisDe80Kg = (double) jogadoresMaisDe80Kg / (numJogadores * numTimes) * 100.0;

        System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + jogadoresMenoresDe18);
        System.out.println("Média das idades dos jogadores: " + mediaIdades);
        System.out.println("Média das alturas dos jogadores: " + mediaAlturas);
        System.out.println("Percentual de jogadores com mais de 80 Kg: " + percentualMaisDe80Kg + "%");
    }

    public static void Exercicio16() {
        int n = 0;
        int maior = 0;
        int menor = 0;
        int termoAnterior = 0;

        do {
            System.out.println("Informe um número");
            n = sc.nextInt();

            if (n >= maior) {
                maior = n;
                termoAnterior = n;
            } else if (n <= termoAnterior) {
                if (n < 0) {
                    break;
                } else {
                    menor = n;
                    termoAnterior = menor;
                }
            }

        } while (n >= 0);

        System.out.println("Maior termo: " + maior);
        System.out.println("Menor termo " + menor);
    }

    public static void Exercicio17() {
        int[] numeros = new int[15];
        int maior = 0;
        int menor = 9999;
        int soma = 0;
        double media = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe os numeros");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        media = soma / numeros.length;

        for (int i : numeros) {
            if (i >= maior) {
                maior = i;
            }
            if (i <= menor) {
                menor = i;
            }
        }
        int qtdPares = 0;
        int quintuplos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                qtdPares++;
            }
            if (numeros[i] % 5 == 0) {
                quintuplos++;
            }
        }

        System.out.println("Menor numero: " + menor);
        System.out.println("Maior numero: " + maior);
        System.out.println("Media: " + media);
        System.out.println("Quantidade pares: " + qtdPares);
        System.out.println("Quantidade quintuplos: " + quintuplos);
    }

}
