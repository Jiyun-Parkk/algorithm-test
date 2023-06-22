import java.util.*;
class Solution {
    public int solution(int[] citations) {
       Integer[] desc = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        int result = 0;
       Arrays.sort(desc, Collections.reverseOrder());
        for(int i = 0; i < desc.length; i++) {
            if(desc[i] < i + 1) {
                result = i;
                break;
            } else if(i == desc.length - 1) {
                result = i + 1;
            }
        }
      return result;
    }
}