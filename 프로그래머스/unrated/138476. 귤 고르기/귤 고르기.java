import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int total = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < tangerine.length; i++) {
            if(map.get(tangerine[i]) == null){
                map.put(tangerine[i],1);
            } else {
               map.put(tangerine[i],map.get(tangerine[i]) + 1); 
            }
         }
        Integer[] counted = Arrays.stream(map.values().toArray()).toArray(Integer[]::new);
        Arrays.sort(counted,Collections.reverseOrder());
        
        for(int i = 0; i < counted.length; i++) {
            answer++;
            total += counted[i];
            if(total >= k) {
                break;
            }
        }
        return answer;
    }
    
     
}