
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    private static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> resultList = new ArrayList<>();
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String str = br.readLine();
            StringTokenizer token = new StringTokenizer(str);
            String command;
            int data = 0;
            if (token.countTokens() == 2) {
                command = token.nextToken();
                data = Integer.parseInt(token.nextToken());
            } else {
                command = token.nextToken();
            }
            if (command.equals("push")) {
                stack.push(data);
            } else if (command.equals("top")) {
                if (stack.isEmpty()) {
                    resultList.add(-1);
                } else {
                    resultList.add(stack.peek());

                }
            } else if (command.equals("size")) {
                resultList.add(stack.size());
            } else if (command.equals("empty")) {
                if (stack.isEmpty()) {
                    resultList.add(1);
                } else {
                    resultList.add(0);
                }
            } else if (command.equals("pop")) {
                if (stack.isEmpty()) {
                    resultList.add(-1);
                } else {
                    int top = stack.peek();
                    stack.pop();
                    resultList.add(top);
                }
            }
        }

        for(int num: resultList) {
            System.out.println(num);
        }

    }


}
