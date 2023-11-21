import java.util.Scanner;

public class ExemploIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, media;
        System.out.println("Informe as notas");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        
        media = (n1 + n2) / 2;

        if(media >= 50) {
            System.out.println("Aprovado!!!");

        } else {
            System.out.println("REPROVOU, VOCÊ É MUITO BURRO KKKKKKKKKKKKKKKKKKKKKKKKKKK");

        }






    }


}
