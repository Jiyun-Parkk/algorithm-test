
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n - 2, n - 1
        long A = sc.nextInt();
        System.out.println(A*(A - 1)*(A - 2) / 6);
        System.out.println(3);
    }
}
