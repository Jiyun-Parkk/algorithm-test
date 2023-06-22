import java.util.*;
class Solution {
    public int solution(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
       int half = nums.length / 2;
       int result = 0;
       for(int num: nums) {
           if(map.get(num) == null) {
               map.put(num, 1);
           } else {
               map.put(num, map.get(num) + 1);
           }
       }
        
       if(map.size() >= half) {
           return half;
       } else {
           return map.size();
       }
       
    }
}