
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = sc.nextInt();
        int n = sc.nextInt();

        int fn = (a*n) + b;
        if(fn <= c*n && a <= c) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
