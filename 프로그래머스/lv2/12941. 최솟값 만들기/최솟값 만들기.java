import java.util.*;
class Solution{
    public int solution(int []A, int []B){
        int answer = 0;
        Arrays.sort(A);
        Integer[] blist = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(blist,Collections.reverseOrder());
        for(int i = 0; i < A.length; i++) {
            answer += (A[i] * blist[i]);
        }
        return answer;
    }
}