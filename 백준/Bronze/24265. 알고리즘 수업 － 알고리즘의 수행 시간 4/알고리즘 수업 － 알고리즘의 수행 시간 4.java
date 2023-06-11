
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // i가 n-1번 도는 동안 j도 순서대로  n-1, n-2, n-3,
        long A = sc.nextInt();
        System.out.println(A*(A - 1) / 2);
        System.out.println(2);
    }
}
