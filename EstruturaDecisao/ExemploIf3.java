import java.util.Scanner;

public class ExemploIf3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String turma;
        System.out.println("Informe a turma");
        turma = sc.nextLine();
        if(turma.equalsIgnoreCase(turma)) {
            System.out.println("Você é da turma D");
        }else {
            System.out.println("Você não é da turma D");
        }

    }
}
