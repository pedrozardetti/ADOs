import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeLivro;
        int nPag, tempoLer;
        System.out.println("Informe o nome do livro");
        nomeLivro = sc.nextLine();
        System.out.println("Informe o número de páginas no livro");
        nPag = sc.nextInt();
        System.out.println("Informe o tempo para ler uma página em segundos");
        tempoLer = sc.nextInt();

        tempoLer = (nPag * tempoLer) / 3600;

        System.out.println("Você lerá " + nomeLivro + " em " + tempoLer + " horas");

    }
}
