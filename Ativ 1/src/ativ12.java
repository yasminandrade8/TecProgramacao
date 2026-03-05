import java.util.Scanner;

public class ativ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite um número: ");
        n = sc.nextInt();

        int q = n * n;

        System.out.println("O resultado é: " + q);
        sc.close();
    }
}
