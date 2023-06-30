import java.util.*;
import java.lang.*;
class Solution {
    public int solution(int n) {
        int nBinary = Integer.bitCount(n);
        while(true) {
            n++;
            int nextBinary = Integer.bitCount(n);
            if(nextBinary == nBinary){
                break;
            }
        }
        return n;
    }
    
}