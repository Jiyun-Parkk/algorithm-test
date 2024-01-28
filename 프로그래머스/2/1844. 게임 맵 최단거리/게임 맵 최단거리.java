import java.util.*;

class Solution {
    private class State {
        int x;
        int y;
        int step;
        public State(int x, int y, int step) {
            this.x = x;
            this.y = y;
            this.step = step;
        }
    }
    private static final int[] dx = {0, 1, 0, -1};
    private static final int[] dy = {-1,0,1,0};
    public int solution(int[][] maps) {
        // 방문 노드 리스트
        boolean[][] isVisited = new boolean[maps.length][maps[0].length];
        // queue 리스트
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(0,0,1));
        isVisited[0][0] = true;
        
        while(!queue.isEmpty()) {
            State state = queue.poll();
            if(state.y == maps.length - 1 && state.x == maps[state.y].length - 1) {
                return state.step;
            }
            for(int i = 0; i < 4;i++){
                    int sumX = state.x + dx[i];
                    int sumY = state.y + dy[i];

                    if(sumY < 0 || sumY >= maps.length || sumX < 0 || sumX >= maps[sumY].length) continue;
                    if(maps[sumY][sumX] != 1) {
                        continue;
                    }
                    if(isVisited[sumY][sumX]) {
                        continue;
                    }
                   isVisited[sumY][sumX] = true;
                  queue.add(new State(sumX,sumY,state.step+1));
                }
            
            }
        return -1;
          
    }
}