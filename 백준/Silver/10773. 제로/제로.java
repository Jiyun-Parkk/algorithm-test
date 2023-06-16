
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num != 0) {
                stack.push(num);
            } else {
                stack.pop();
            }
        }
        int sum = stack.stream().mapToInt(i -> i).sum();
        System.out.println(sum);

    }
}
