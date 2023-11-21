import java.util.Scanner;

public class Ex7C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicio, minutoInicio, horaTermino, minutoTermino, duracaoMin, duracaoHoras;
        System.out.println("Informe a hora de início do jogo ");
        horaInicio = sc.nextInt();
        System.out.println("Informe o minuto de início do jogo");
        minutoInicio = sc.nextInt();
        System.out.println("Informe a hora de término do jogo");
        horaTermino = sc.nextInt();
        System.out.println("Informe o minuto de término do jogo");
        minutoTermino = sc.nextInt();

        int minutosInicio = horaInicio * 60 + minutoInicio;
        int minutosTermino = horaTermino * 60 + minutoTermino;

        if (minutosInicio <= minutosTermino) {
            duracaoMin = minutosTermino - minutosInicio;
        } else {
            duracaoMin = (24 * 60 - minutosInicio) + minutosTermino;
        }

        duracaoHoras = duracaoMin / 60;
        duracaoMin = duracaoMin % 60;

        System.out.println("A duração do jogo foi de " + duracaoHoras + " horas e " + duracaoMin + " minutos.");
    }

}
