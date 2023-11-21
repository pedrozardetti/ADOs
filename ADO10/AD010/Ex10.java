package AD010;
import java.util.*;

class Ex10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva uma mensagem");
        String msg = ler.nextLine();

        System.out.println(palindromo(msg));
    

    }

    public static String palindromo(String msg) {
        String resultado = "";
        String situacao = "";

        for (int i = msg.length() - 1; i >= 0; i--) {
            char letra = msg.charAt(i);
            resultado = resultado + letra;            
        }

        if(msg.equalsIgnoreCase(resultado)) {
            situacao = "Palindromo";
        } else {
            situacao = "Nao e palindromo";
        }
        
        return situacao;

    }

}
