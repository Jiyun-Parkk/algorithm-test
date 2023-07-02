class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        int[] result = new int[2];
        for(int i = 3; i < total; i++) {
            if(total % i == 0){
                int vertical = total / i;
                if(vertical <= i) {
                   if((vertical - 2) * (i - 2) == yellow) {
                       result[0] = i;
                       result[1] = vertical;
                   } 
                }
            }
        }
        return result;
    }
}