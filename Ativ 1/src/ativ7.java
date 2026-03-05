import java.util.Scanner;

public class ativ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d;
        int m;
        int a;
        System.out.println("Dias vivídos: ");
        d = sc.nextInt();
        System.out.println("Mês vivídos: ");
        m = sc.nextInt();
        System.out.println("Idade: ");
        a = sc.nextInt();

        int dias =  a * 365 + (m * 30) + d;

        System.out.println("Você viveu " + dias + " dias!");
        sc.close();
    }
}
