import java.util.*;
class Solution {
    private static boolean[] isVisited;
    private static int network;
    public int solution(int n, int[][] computers) {
        isVisited = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(!isVisited[i]) {
                network += dfs(i,n,computers);
             }
          }
        
        return network;
    }
    private static int dfs(int i, int n, int[][] computers) {
        if(isVisited[i]){
            return 0;
        }
        
        isVisited[i] = true;
        for(int j = 0; j < n; j++) {
            if(computers[i][j] == 1) {
                dfs(j,n,computers);
            }
        }
        return 1;
    }
}