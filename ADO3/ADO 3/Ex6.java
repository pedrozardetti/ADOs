import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String corSemaforo;
        boolean podeAtrav;
        System.out.println("Qual a cor do semáforo");   
        corSemaforo = sc.nextLine();

        podeAtrav = corSemaforo.toLowerCase().equals("verde");

        System.out.println("Pode atravessar? " +podeAtrav);
    }
}
