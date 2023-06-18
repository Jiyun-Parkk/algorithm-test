import java.lang.*;
import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        List<String> bables = new ArrayList<>();
        List<String> list = new ArrayList<>();
        bables.add("aya");
        bables.add("ye");
        bables.add("ma");
        bables.add("woo");
        int answer = 0;
        for(int i = 0 ; i < babbling.length; i++){
           for(String str2: bables){
               if(babbling[i].contains(str2)) {
                  babbling[i] = babbling[i].replace(str2, " ");
               }
           }
        }
        for(String str: babbling) {
            if(str.trim().isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}