import java.util.Scanner;

public class Ex3A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeAutor, ultimoNome, obra, cidade, editora, inicialNome2;
        char inicialNome1;
        int anoLancamento, espaco;
        System.out.println("Insira o nome do autor da obra");
        nomeAutor = sc.nextLine();
        System.out.println("Insira o nome da obra");
        obra = sc.nextLine();
        System.out.println("Insira o nome da cidade");
        cidade = sc.nextLine();
        System.out.println("Insira o nome da editora");
        editora = sc.nextLine();
        System.out.println("Insira o ano de lançamento da obra");
        anoLancamento = sc.nextInt();

        espaco = nomeAutor.lastIndexOf("");
        int letracut = nomeAutor.indexOf(" ");
        letracut = letracut + 2;

        ultimoNome = nomeAutor.substring(espaco);
        ultimoNome = nomeAutor.toUpperCase();

        inicialNome1 = nomeAutor.charAt(0);
        inicialNome2 = nomeAutor.substring(espaco, letracut);

        System.out.println(ultimoNome + "," + inicialNome1 + "." + inicialNome2 + "." + obra + "." + cidade + ":"
                + editora + "," + anoLancamento + ".");

    }
}
