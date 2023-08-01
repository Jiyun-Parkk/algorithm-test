import java.io.*;
import java.util.*;

public class Main{
    private static int[] dx = {0,0,1,-1};
    private static  int[] dy = {1,-1,0,0};
    // N * N 정사각형
    private static int N;
    // 방문 배열
    private static boolean[][] visited;
    // 정사각형 만들기
    private static int[][] map;
    // 단지 개수
    private static int[] aparts = new int[25*25];

    // 번호 카운트
    private static int houseNum = 0;

    private static void dfs(int x, int y) {
        // 방문여부
        visited[x][y] = true;
        aparts[houseNum]++;
        // 좌우상하 방문 여부 확인하기
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && ny >=0 && nx < N && ny < N) {
                if(map[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx,ny);
                }
            }
        }
    }

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];

        for(int i = 0; i < N; i++) {
            String num = br.readLine();
            for(int j = 0; j < N; j++) {
                map[i][j] = num.charAt(j) - '0';
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(map[i][j] == 1 && !visited[i][j]) {
                    houseNum++;
                    dfs(i,j);
                }
            }
        }
        Arrays.sort(aparts);
        System.out.println(houseNum);
        for(int i = 0; i < aparts.length; i++) {
            if(aparts[i] != 0) {
                System.out.println(aparts[i]);
            }
        }
    }
}