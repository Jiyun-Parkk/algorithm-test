
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] dx = {0, 0, 1, -1};
    public static int[] dy = {1, -1, 0, 0};
    public static int[][] dp;
    public static int[][] map;
    public static int M;
    public static int N;
    public static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(br.readLine());
        M = Integer.parseInt(tokens.nextToken());
        N = Integer.parseInt(tokens.nextToken());
        map = new int[M][N];
        dp = new int[M][N];

        for (int i = 0; i < M; i++) {
            StringTokenizer lines = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(lines.nextToken());
                dp[i][j] = -1;
            }
        }
        dfs(0,0);
        System.out.println(dfs(0,0));
    }

    public static int dfs(int x, int y) {
        if(x == (M -1) && y == (N-1)) return 1;
        if(dp[x][y] == -1) {
            dp[x][y] = 0;
            for(int i = 0; i < dx.length; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 0 && ny >= 0 && nx < M && ny < N) {
                    if(map[x][y] > map[nx][ny]) {
                        dp[x][y] += dfs(nx,ny);
                    }
                }

            }
        }
        return dp[x][y];
    }
}
