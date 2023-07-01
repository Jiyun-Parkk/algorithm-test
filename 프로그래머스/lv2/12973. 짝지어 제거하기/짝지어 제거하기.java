import java.util.*;
import java.lang.*;
class Solution{
    public int solution(String s){
       String[] strArr = s.split("");
       while(true) {
           int count = 0;
           Stack<String> stack = new Stack<>();
           if(strArr.length == 0) break;
           for(int i = 0; i < strArr.length; i++) {
               if(stack.size() == 0) {
                   stack.add(strArr[i]);
               } else {
                   if(stack.peek().equals(strArr[i])) {
                      stack.pop();
                      count++;
                   } else {
                      stack.add(strArr[i]);
                   }
               }
           }
           strArr = Arrays.stream(stack.toArray()).toArray(String[]::new);
           if(count == 0) break;
       }
           
     return strArr.length == 0 ? 1 : 0;
    }
}