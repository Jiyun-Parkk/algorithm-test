
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    // 바다는 0
    // 빙산은 정수
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};
    private static int N;
    private static int M;
    private static int[][] map;
    private static boolean[][] visited;
    private static int year = 0;
    private static int iceBreak = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        N = Integer.parseInt(token.nextToken());
        M = Integer.parseInt(token.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            StringTokenizer numToken = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(numToken.nextToken());
            }
        }

        check:while (true) {
            iceBreak = 0;
            visited = new boolean[N][M];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] > 0 && !visited[i][j]) {
                        iceBreak++;
                        if (iceBreak >= 2) {
                            if(year == 0) year++;
                            break check;
                        }
                        dfs(i, j);
                    }
                }
            }
            if (iceBreak == 0) {
                year = 0;
                break check;
            }
            year++;
        }


        System.out.println(year);

    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                if (map[nx][ny] == 0 && !visited[nx][ny]) {
                    map[x][y] -= 1;
                }
                if (map[nx][ny] > 0 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
            if (map[x][y] < 0) {
                map[x][y] = 0;
            }
        }
    }
}
