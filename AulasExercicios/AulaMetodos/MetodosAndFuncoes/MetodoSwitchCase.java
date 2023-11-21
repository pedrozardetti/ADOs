import java.util.Scanner;

public class MetodoSwitchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pesoKg, pesoGr, preco, percImp, imp, vTotal, vFinal;
        int codProduto, codPais;
        System.out.println("Informe o código do produto");
        codProduto = sc.nextInt();
        System.out.println("Insira o código do país");
        codPais = sc.nextInt();
        System.out.println("Informe o peso em Kg");
        pesoKg = sc.nextInt();

        pesoGr = convGr(pesoKg); //converter kg em gr
        





    }

    public static double getPreco(int codProduto) {
        double preco;
        switch (codProduto);
        case 1, 2, 3, 4 -> preco = 10;
        
        case 5, 6, 7 -> preco = 25;

        case 8, 9, 10 -> preco = 35;

        default -> preco =-1;

        return preco
    }






}
