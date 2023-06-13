import java.util.Stack;
class Solution {
    public String solution(String number, int k) {
        String[] nums = number.split("");
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = Integer.parseInt(nums[i]);
            if (!stack.isEmpty()) {
                while (stack.peek() < num && count < k) {
                    stack.pop();
                    count++;
                    if(stack.isEmpty()) break;
                }
            }
            stack.push(num);
        }
        StringBuilder stringBuilder = new StringBuilder();
        if(stack.size() == nums.length) {
            for(int i = 0; i < k; i++) {
                stack.pop();
            }
        }
        for(int num : stack) {
            stringBuilder.append(num+"");
        }
        return stringBuilder.toString();
    }
}