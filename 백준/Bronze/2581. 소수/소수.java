
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i = M; i <= N; i++) {
            boolean isRight = true;
            for(int j = 1; j < i; j++ ) {
                if(i % j == 0 && j != 1) {
                    isRight = false;
                }
            }
            if(isRight && i != 1) {
                list.add(i);
            }
        }

        if(!list.isEmpty()) {
        int sum = list.stream().reduce((x,y) -> x + y).get();
            System.out.println(sum);
            System.out.println(list.get(0));
        } else {
            System.out.println(-1);
        }

    }
}
