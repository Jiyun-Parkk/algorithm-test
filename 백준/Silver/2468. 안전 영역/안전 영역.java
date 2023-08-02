
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};
    private static int N;
    private static int[][] field;
    private static boolean[][] visited;
    private static int count = 0;
    private static int overflow = 0;
    private static Set<Integer> set = new HashSet<>();
    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        field = new int[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            String[] list = line.split(" ");
            for (int j = 0; j < N; j++) {
                field[i][j] = Integer.parseInt(list[j]);
                set.add(Integer.parseInt(list[j]));
            }
        }

        int max = Collections.max(set);
        list.add(1);
        for(int f = 1; f <= max; f++) {
            // 사각형탐색
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (field[i][j] > f && !visited[i][j]) {
                        count++;
                        dfs(i, j, f);
                    } else if(field[i][j] <= f) {
                        overflow++;
                    }
                }
            }
            if(overflow == 0) {
                count = 1;
            }
            list.add(count);
            count = 0;
            overflow = 0;
            visited = new boolean[N][N];

        }
        System.out.println(Collections.max(list));
    }

    public static void dfs(int x, int y, int point) {
        visited[x][y] = true;
        for (int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (field[nx][ny] > point && !visited[nx][ny]) {
                    dfs(nx, ny, point);
                }
            }
        }
    }
}
