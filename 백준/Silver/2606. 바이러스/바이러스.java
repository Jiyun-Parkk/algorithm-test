import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    static int[][] pc = new int[100][100];
    static boolean[] visited = new boolean[100];
    static int virus;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int injection = sc.nextInt();
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            pc[a - 1][b - 1] = 1;
            pc[b - 1][a - 1] = 1;
        }
        visited[0] = true;
        check_connect(injection,0);
        System.out.println(virus);

    }

    public static void check_connect(int n, int k) {
        for(int i = 0; i < n; i++) {
            if(visited[i] == false && pc[k][i] == 1) {
                visited[i] = true;
                check_connect(n, i);
                virus++;
            }
        }
    }
}
