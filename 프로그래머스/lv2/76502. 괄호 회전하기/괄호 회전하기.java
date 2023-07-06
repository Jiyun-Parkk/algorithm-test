import java.util.*;
import java.lang.*;
class Solution {
    public int solution(String s) {
        int x = 0;
        String[] arr = s.split("");
        List<String> list = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        
        for(int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        
        // 반복문으로 앞에 들어간 문자가 짝인지 확인
        for(int i = 0; i < arr.length; i++) {
            stack.clear();
           for(int j = 0; j < arr.length; j++) {
               if(stack.size() > 0) {
                   if((stack.peek().equals("[")  && list.get(j).equals("]")) ||
                     (stack.peek().equals("(") && list.get(j).equals(")") )||
                      (stack.peek().equals("{") && list.get(j).equals("}"))
                     ) {
                       stack.pop();
                   } else {
                       stack.push(list.get(j));
                   }
               } else {
                    stack.push(list.get(j));
               }
           }
          if(stack.size() == 0) {
              x++;
          }
          String peek = list.get(0);
          list.remove(0);
          list.add(peek);
        }
        // 짝이면 true + 1
        // 짝이 아니면 false 한번 false면 계속 false
        return x;
    }
}