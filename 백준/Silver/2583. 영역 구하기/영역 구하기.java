
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};
    private static int N;
    private static int M;
    private static int[][] map;
    private static boolean[][] isVisited;
    private static int territory;
    private static List<Integer> sizes = new ArrayList<>();
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(br.readLine());
        N = Integer.parseInt(tokens.nextToken());
        M = Integer.parseInt(tokens.nextToken());
        int K = Integer.parseInt(tokens.nextToken());
        map = new int[M][N];
        isVisited = new boolean[M][N];
        for (int i = 0; i < K; i++) {
            StringTokenizer lines = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(lines.nextToken());
            int y1 = Integer.parseInt(lines.nextToken());
            int x2 = Integer.parseInt(lines.nextToken());
            int y2 = Integer.parseInt(lines.nextToken());
            // 첫번째 왼쪽 아래 꼭지점은 1을 더해준다
            x2 -= 1;
            y2 -= 1;
            //범위에 따라 1을 설정
            for (int j = x1; j <= x2; j++) {
                for (int f = y1; f <= y2; f++) {
                    map[j][f] = 1;
                }
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 0 && !isVisited[i][j]) {
                    territory++;
                    dfs(i, j);
                    sizes.add(count);
                }
                count = 0;
            }
        }
        System.out.println(territory);
        Collections.sort(sizes);
        for (int i = 0; i < sizes.size(); i++) {
            System.out.printf("%d ", sizes.get(i));
        }

    }

    private static void dfs(int x, int y) {
        isVisited[x][y] = true;
        count++;
        for (int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                if (map[nx][ny] == 0 && !isVisited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
