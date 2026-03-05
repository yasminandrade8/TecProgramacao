import java.util. Scanner;

public class ativ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Primeiro número: ");
        a = sc.nextInt();
        System.out.println("Segundo número: ");
        b = sc.nextInt();
        
        c = a;
        a = b;
        b = c;

        System.out.println(a + " " + b);
        sc.close();   
    }
}
