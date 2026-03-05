import java.util.Scanner;

public class ativ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cd;
        double qtd;
        System.out.println("Cotação do dolár: ");
        cd = sc.nextDouble();
        System.out.println("Quantidade de doláres: ");
        qtd = sc.nextDouble();

        double vlr = cd * qtd;

        System.out.println("O valor convertido é de: " + vlr + " reais");
        sc.close();
    }
}
