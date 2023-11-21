import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex5B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor1, valor2, valor3;
        int tipoMsg = 0;
        String resultado;
        valor1 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Informe o 1º número", JOptionPane.PLAIN_MESSAGE));
        valor2 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Informe o 2º número", JOptionPane.PLAIN_MESSAGE));
        valor3 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Informe o 3º número", JOptionPane.PLAIN_MESSAGE));

        if (valor1 == valor2) {
            resultado = "Não é possível ter números entre valor1 e valor2";
        } else {
            if (valor1 < valor2) {
                if (valor3 > valor1 && valor3 < valor2) {
                    resultado = "O valor3 está entre o valor1 e valor2";
                    tipoMsg = JOptionPane.INFORMATION_MESSAGE;
                } else {
                    resultado = "O valor3 não está entre valor1 e valor2";
                    tipoMsg = JOptionPane.WARNING_MESSAGE;
                }
            } else {
                if (valor3 <= valor1 && valor3 >= valor2) {
                    resultado = "O valor3 não está entre valor1 e valor2";
                    tipoMsg = JOptionPane.INFORMATION_MESSAGE;
                } else {
                    resultado = "O valor3 não está entre valor1 e valor2";
                    tipoMsg = JOptionPane.WARNING_MESSAGE;
                }
            }
        }
        JOptionPane.showMessageDialog(null, resultado, "Resultado", tipoMsg);

    }
}
