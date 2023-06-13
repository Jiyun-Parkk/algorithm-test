
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        System.out.println(factorial(N) / (factorial(K) * factorial(N - K)));
    }

    public static int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }
}
