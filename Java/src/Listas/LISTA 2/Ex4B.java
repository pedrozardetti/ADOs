import java.util.Scanner;

public class Ex4B {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int valor;
        System.out.println("Informe um valor entre 1 e e 100");
        valor = sc.nextInt();
        
        if(valor >= 1 && valor <=100) {
            System.out.println("O valor está entre 1 e 100");
        }else {
            System.out.println("O valor não está entre 1 e 100");
            
        }



    }
}
