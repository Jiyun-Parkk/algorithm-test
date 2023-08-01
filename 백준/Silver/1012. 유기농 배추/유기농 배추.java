
import java.io.*;
import java.util.*;

public class Main {
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};
    private static int width;
    private static int height;
    private static int cabbageCount;
    private static int[][] cabbageField;
    private static boolean[][] visited;

    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            width = Integer.parseInt(token.nextToken());
            height = Integer.parseInt(token.nextToken());
            cabbageCount = Integer.parseInt(token.nextToken());
            cabbageField = new int[width][height];
            visited = new boolean[width][height];
            int bugs = 0;
            for (int j = 0; j < cabbageCount; j++) {
                StringTokenizer cabbagePosition = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(cabbagePosition.nextToken());
                int y = Integer.parseInt(cabbagePosition.nextToken());
                cabbageField[x][y] = 1;
            }
            for (int j = 0; j < width; j++) {
                for (int f = 0; f < height; f++) {
                    if (cabbageField[j][f] == 1 && !visited[j][f]) {
                        bugs++;
                        dfs(j, f);
                    }
                }
            }
            list.add(bugs);
        }
        for (int bug : list) {
            System.out.println(bug);
        }

    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < width && ny < height && !visited[nx][ny] && cabbageField[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }
}
