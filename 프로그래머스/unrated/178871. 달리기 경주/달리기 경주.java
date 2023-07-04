import java.util.*;
import java.lang.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
       Map<String, Integer> playerMap = new HashMap<>();
       Map<Integer,String> rankMap = new HashMap<>();
       for(int i = 0; i < players.length; i++) {
           playerMap.put(players[i],i);
           rankMap.put(i, players[i]);
       }
       for(int i = 0; i < callings.length; i++) {
           int currentRank = playerMap.get(callings[i]);
           int swapedRank = currentRank - 1;
           String swapedPlayer = rankMap.get(swapedRank);
           playerMap.put(callings[i], swapedRank);
           playerMap.put(swapedPlayer, currentRank);
           rankMap.put(swapedRank, callings[i]);
           rankMap.put(currentRank, swapedPlayer);
       }
    return Arrays.stream(rankMap.values().toArray()).toArray(String[]::new);
    }
}