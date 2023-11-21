import java.util.Scanner;

public class Ex2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Informe uma cor primária");
        String cor1 = sc.nextLine();
        System.out.println("Informe outra cor primária");
        String cor2 = sc.nextLine();
        
        System.out.println(combinarCores(cor1, cor2));

    }

    public static String combinarCores(String cor1, String cor2) {
        if (cor1.equalsIgnoreCase("Vermelho") && cor2.equalsIgnoreCase("Azul")
                || cor1.equalsIgnoreCase("Azul") && cor2.equalsIgnoreCase("Vermelho")) {
            return "A combinação de cores é Roxo";  
        }

        return "Combinação de cores não reconhecida!";
    }
}
