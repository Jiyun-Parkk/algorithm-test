import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        Stack<Integer> stack = new Stack<>();
        for(int i = people.length - 1; i >= 0; i--) {
            stack.push(people[i]);
        }
        int index = 0;
        while(index < stack.size()) {
           if(stack.size() >= 2) {
             if(stack.get(index) + stack.peek() > limit) {
                answer++;
            } else {
                stack.pop();
                answer++;;
            }    
           } else {
              stack.pop(); 
              answer++;;
           }
           index++;
        }
        return answer;
    }
}