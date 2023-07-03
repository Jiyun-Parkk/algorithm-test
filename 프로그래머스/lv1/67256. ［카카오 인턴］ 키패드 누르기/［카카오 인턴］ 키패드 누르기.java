import java.util.*;
import java.lang.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        // 0 => 1차, 1 => 2차
        int[] left = {3,0};
        int[] right = {3, 2};
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numbers.length; i++) {
            int x = (int) (Math.ceil((double) numbers[i] / 3)) - 1;
            int y = numbers[i] % 3 == 0 ? 2 : (numbers[i] % 3) - 1;
            boolean isLeft;
            if(numbers[i] == 0) {
                x = 3;
                y = 1;
            }
            if(y == 0 || y == 2) {
                isLeft = y == 0 ? true : false;
            } else {
                int leftDiff = calculateDiff(left, x, y);
                int rightDiff = calculateDiff(right, x, y);
                if(leftDiff < rightDiff) {
                    isLeft = true;
                } else if(leftDiff > rightDiff) {
                    isLeft = false;
                } else {
                    isLeft = hand.equals("left") ? true : false;
                }
            }
            
            if(isLeft) {
                left[0] = x;
                left[1] = y;
                sb.append("L");
            } else {
                right[0] = x;
                right[1] = y;
                sb.append("R");
            }
        }
        return sb.toString();
    }
    
    public static int calculateDiff(int[] position, int x, int y) {
        return Math.abs(position[0] - x) + Math.abs(position[1] - y);
    }
}