
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int dirX[] = {0, 0, -1 ,1, -1, 1, -1, 1};
    static int dirY[] = {-1, 1, 0, 0, 1, 1, -1, -1};
    static int w;
    static int h;
    static int[][] map;
    static List<Integer> lands = new ArrayList<>();
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer lines = new StringTokenizer(br.readLine());
            w = Integer.parseInt(lines.nextToken());
            h = Integer.parseInt(lines.nextToken());
            map = new int[h][w];
            if (w == 0 && h == 0) {
                break;
            }
            for (int i = 0; i < h; i++) {
                StringTokenizer mapStatus = new StringTokenizer(br.readLine());
                for (int k = 0; k < w; k++) {
                    int status = Integer.parseInt(mapStatus.nextToken());
                    map[i][k] = status;
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == 1) {
                        count++;
                        dfs(i, j);
                    }
                }
            }
            lands.add(count);
            count = 0;
        }

        for (int land : lands) {
            System.out.println(land);
        }
    }

    public static void dfs(int x, int y) {
        map[x][y] = -1;
        for (int i = 0; i < dirX.length; i++) {
            int nx = x + dirX[i];
            int ny = y + dirY[i];

            if (nx >= 0 && ny >= 0 && nx < h && ny < w) {
                if (map[nx][ny] == 1) {
                    dfs(nx, ny);
                }
            }

        }
    }
}
