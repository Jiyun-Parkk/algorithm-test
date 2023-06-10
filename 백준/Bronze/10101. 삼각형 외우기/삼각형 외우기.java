import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] triangle = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int sum = Arrays.stream(triangle).sum();
        Set<Integer> set = new HashSet<>();
        String result = "";

        for(int i = 0; i < triangle.length; i++) {
            set.add(triangle[i]);
        }
        if(sum != 180) {
            result = "Error";
        } else if(set.size() == 3) {
            result = "Scalene";
        } else if(set.size() == 2) {
            result = "Isosceles";
        } else {
            result = "Equilateral";
        }
        System.out.println(result);
    }
}
