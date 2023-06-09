import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> brackets = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                brackets.push('(');
            } else if(s.charAt(i) == ')') {
                if(!brackets.isEmpty()) {
                    brackets.pop();
                }  else {
                    return false;
                }
            }
        }
     return !brackets.isEmpty() ? false : true;
    }
}