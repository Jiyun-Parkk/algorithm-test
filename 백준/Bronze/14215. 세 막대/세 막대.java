
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] triangle = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(triangle);
        int sumTwo = triangle[0] + triangle[1];
        int max = triangle[2];
        if(sumTwo <= max) {
            max = sumTwo - 1;
        }
        System.out.println(max + sumTwo);
    }
}
