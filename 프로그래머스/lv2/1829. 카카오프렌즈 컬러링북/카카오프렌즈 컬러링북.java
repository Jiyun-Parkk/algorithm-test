import java.util.*;

class Solution {

    private static int M;
    private static int N;
    private static int territory;
    private static int max;
    private static int count;
    private static boolean[][] isVisited;
    
    public int[] solution(int m, int n, int[][] picture) {
        int[] answer = new int[2];
        M = m;
        N = n;
        isVisited = new boolean[m][n];
        territory = 0;
        max = 0;
        count = 0;
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(picture[i][j] > 0 && !isVisited[i][j]) {
                    territory++;
                    dfs(i,j,picture);
                    if(count > max) {
                        max = count;
                    }
                    count = 0;
                }
            }
        }
        answer[0] = territory;
        answer[1] = max;
        return answer;
    }
    
    public static void dfs(int x, int y,int[][] picture) {
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        isVisited[x][y] = true;
        count++;
        for(int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && ny >=0 && nx < M && ny < N) {
                if(picture[nx][ny] > 0 && picture[nx][ny] == picture[x][y] && !isVisited[nx][ny]) {
                    dfs(nx,ny,picture);
                }
            }
        }
    }
}