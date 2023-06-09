
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>();
        List<String> list = new ArrayList<>();

        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;
            inputList.add(num);
        }

        for (int i = 0; i < inputList.size(); i++) {
            int sum = 0;
            list.clear();

            for (int j = 1; j < inputList.get(i); j++) {
                if (inputList.get(i) % j == 0) {
                    sum += j;
                    list.add(j + "");
                }
            }
            String str = String.join(" + ", list);

            if (sum != inputList.get(i)) {
                System.out.printf("%d is NOT perfect.%n", inputList.get(i));
            } else {
                System.out.print(inputList.get(i) + " = ");
                System.out.printf("%s%n", str);
            }
        }
    }
}
