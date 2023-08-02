
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};

    private static int width;
    private static int height;
    private static int[][] map;
   private static boolean[] alpha;
    private static int max = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        width = Integer.parseInt(token.nextToken());
        height = Integer.parseInt(token.nextToken());
        map = new int[width][height];
        alpha = new boolean[26];
        for (int i = 0; i < width; i++) {
            String lines = br.readLine();
            for (int j = 0; j < height; j++) {
                map[i][j] = lines.charAt(j) - 'A';
            }
        }
        dfs(0, 0, max);

        System.out.println(max);
    }

    public static void dfs(int x, int y, int len) {
        alpha[map[x][y]] = true;
        max = Math.max(max, len);

        for (int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < width && ny < height) {
                if (alpha[map[nx][ny]] == false) {
                    dfs(nx, ny, len + 1);
                    alpha[map[nx][ny]] = false;
                }
            }

        }

    }
}