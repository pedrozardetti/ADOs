package PROVA;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String placa, cpf;
        double v, valorPendente;
        int horaEntrada, minutoEntrada, horaSaida, minutoSaida, permanencia, diferencaHrs, diferencaMin;
        System.out.println("Informe a placa");
        placa = sc.nextLine();
        System.out.println("Informe a hora de entrada");
        horaEntrada = sc.nextInt();
        System.out.println("Informe o minuto de entrada");
        minutoEntrada = sc.nextInt();
        System.out.println("Informe a hora de saída"); 
        horaSaida = sc.nextInt();
        System.out.println("Informe o minuto de saída");   
        minutoSaida = sc.nextInt();
        System.out.println("Você deseja informar o CPF? Digite 1 para sim e 2 para não");
        cpf = sc.next();

        if(cpf.equals("1") ) {
            System.out.println("Digite o CPF");
        } else {
            System.out.println("Usuário anônimo");
        }
        
        diferencaHrs = horaSaida - horaEntrada;
        diferencaMin = minutoSaida - minutoEntrada;
        permanencia = (diferencaHrs * 60) + diferencaMin;
    

        if (permanencia <= 15) {
            v = 0.00;
        } else if (permanencia <= 60) {
            v = 9.00;
        } else if (permanencia <= 120) {
            v = 13.00;
        } else if (permanencia <= 240) {
            v = 18.00;
        } else if (permanencia <= 360) {
            v = 21.00;
        } else {
            v = 32.00;
        }
        valorPendente = v;

        

        System.out.println("---RECIBO DE ESTACIONAMENTO---");
        System.out.println("Rede Pare Bem - Shop Gaste Bem");
        System.out.println("Placa: " + placa);
        System.out.println("Entrada: " +horaEntrada +":"+minutoEntrada);
        System.out.println("Saída: " +horaSaida +":" +minutoSaida);
        System.out.println("Permanência: " +permanencia + "min");
        System.out.println("Valor: " + valorPendente);
        System.out.println("CPF: " +cpf);
        System.out.println("--------VOLTE SEMPRE------------");
    
        
    }
}
