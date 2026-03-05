import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Primeiro número: ");
        a = sc.nextInt();
        System.out.println("Segundo número: ");
        b = sc.nextInt();
        
        int x = a * b;

        System.out.println("O resultado é " + x);
        sc.close();
    }
}
