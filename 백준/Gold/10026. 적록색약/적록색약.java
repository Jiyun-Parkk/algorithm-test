
import java.util.Scanner;

public class Main {
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};
    private static String[][] map;
    private static String[][] map2;
    private static boolean[][] isVisited1;
    private static boolean[][] isVisited2;
    private static int colorWeakTerritory = 0;
    private static int normalTerritory = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        isVisited1 = new boolean[len][len];
        isVisited2 = new boolean[len][len];
        map = new String[len][len];
        map2 = new String[len][len];

        for (int i = 0; i < len; i++) {
            String colorStr = sc.next();
            for (int j = 0; j < len; j++) {
                String colorText = colorStr.charAt(j) + "";
                map[i][j] = colorText;
                if (colorText.equals("G")) {
                    map2[i][j] = "R";
                } else {
                    map2[i][j] = colorText;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (!isVisited1[i][j]) {
                    normalTerritory++;
                    dfs(i, j, len, 1);
                }
                if (!isVisited2[i][j]) {
                    colorWeakTerritory++;
                    dfs(i, j, len, 2);
                }
            }
        }
        System.out.printf("%d %d", normalTerritory, colorWeakTerritory);

    }

    public static void dfs(int x, int y, int len, int visit) {
        if (visit == 1) {
            isVisited1[x][y] = true;
        } else {
            isVisited2[x][y] = true;
        }

        for (int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 & ny >= 0 && nx < len && ny < len) {
                if (visit == 1) {
                    if (map[x][y].equals(map[nx][ny]) && !isVisited1[nx][ny]) {
                        dfs(nx, ny, len, 1);
                    }
                } else {
                    if (map2[x][y].equals(map2[nx][ny]) && !isVisited2[nx][ny]) {
                        dfs(nx, ny, len, 2);
                    }
                }

            }
        }
    }

}
