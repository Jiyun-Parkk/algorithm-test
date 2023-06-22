import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
       Arrays.sort(participant);
       Arrays.sort(completion);
        String result = "";
        
       for(int i = 0; i < participant.length; i++) {
           if(i == completion.length) {
               result = participant[i];
               break;
           } else {
              if(!participant[i].equals(completion[i])) {
                 result = participant[i];
                 break;
              }
           }
       }
       return result;
    }
}