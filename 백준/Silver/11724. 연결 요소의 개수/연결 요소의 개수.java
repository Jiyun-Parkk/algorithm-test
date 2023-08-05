
import java.util.Scanner;

public class Main {
    private static int[][] graph;
    private static boolean[] isVisited;
    private static int count = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        graph = new int[N][N];
        isVisited = new boolean[N];

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        for (int i = 0; i < N; i++) {
            if (!isVisited[i]) {
                count += dfs(i);
            }
        }
        System.out.println(count);
    }

    private static int dfs(int i) {
        if (isVisited[i]) {
            return 0;
        }
        isVisited[i] = true;
        for (int j = 0; j < graph.length; j++) {
            if (graph[i][j] == 1) {
                dfs(j);
            }
        }
        return 1;
    }

}
