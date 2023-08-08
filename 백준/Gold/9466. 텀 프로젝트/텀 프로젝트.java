
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int testCase;
    private static int[] students;

    private static int matchNoOne;

    private static boolean[] isVisited;
    private static boolean[] isPassedPath;

    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        testCase = sc.nextInt();
        for (int i = 0; i < testCase; i++) {
            int count = sc.nextInt();
            students = new int[count + 1];
            isVisited = new boolean[count + 1];
            isPassedPath = new boolean[count + 1];

            for (int j = 1; j <= count; j++) {
                int pointed = sc.nextInt();
                students[j] = pointed;
            }

            for (int f = 1; f <= count; f++) {
                dfs(f);
            }
            list.add(count - matchNoOne);
            matchNoOne = 0;
        }
        for(int num: list) {
            System.out.println(num);
        }


    }

    public static void dfs(int i) {
        if (isVisited[i]) {
           return;
        }
        isVisited[i] = true;
        int next = students[i];
        if (!isVisited[next]) {
            dfs(next);
        } else {
        if(!isPassedPath[next]) {
            matchNoOne++;
            for(int j = next; j != i; j = students[j]) {
                matchNoOne++;
            }
         }
        }
        isPassedPath[i] = true;
    }
}
