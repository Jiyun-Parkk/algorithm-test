import java.util.*;
import java.lang.*;
class Solution {
    public int[] solution(int n, String[] words) {
       Map<String,Integer> wordMap = new HashMap<>();
       Map<Integer,List<String>> playerMap = new HashMap<>();
       int[] result = {0,0};
       for(int i = 0; i < words.length; i++) {
           int playerIndex = (i % n) + 1;
           if(playerMap.get(playerIndex) == null) {
               playerMap.put(playerIndex, new ArrayList<String>());
           }
           List<String> playerWords = playerMap.get(playerIndex);
           playerWords.add(words[i]);
           playerMap.put(playerIndex, playerWords);
           if(wordMap.get(words[i]) == null) {
               wordMap.put(words[i],1);
           } else {
               result[0] = playerIndex;
               result[1] = playerMap.get(playerIndex).size();
               break; 
           }
           
           if(i > 0 
              && words[i].charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1)
             ) {
               result[0] = playerIndex;
               result[1] = playerMap.get(playerIndex).size();
               break;
           }
          
           
       }
        return result;
    }
}