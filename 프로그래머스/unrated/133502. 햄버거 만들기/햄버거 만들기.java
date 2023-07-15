import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int burger = 0;
        Stack<Integer> stack = new Stack<>();
        for(int ingre: ingredient) {
            stack.push(ingre);
            if(stack.size() >= 4) {
               if(stack.get(stack.size() - 1) == 1 &&
               stack.get(stack.size() - 2) == 3 &&
               stack.get(stack.size() - 3) == 2 &&
               stack.get(stack.size() - 4) == 1
              ) {
                for(int i = 0; i < 4; i++) {
                    stack.pop();
                }
                burger++;
            } 
            }
            
        }
        return burger;
    }
}