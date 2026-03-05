import java.util.Scanner;

public class ativ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        System.out.println("Digite um número: ");
        n = sc.nextDouble();

        double d = n % 6;

        System.out.println("O resultado é: " + d);
        sc.close();
    }
}