import java.util.*;
class Solution {
    public String solution(String s) {
        String[] strArr = s.toLowerCase().split(" ");
        String[] splits = s.split("");
        if(splits[splits.length - 1].equals(" ")){
            strArr[strArr.length - 1] += " ";
          }
    
        for(int i = 0; i < strArr.length; i++) {
            String[] arr = strArr[i].split("");
            String temp = "";
            for(int j = 0; j < arr.length; j++) {
                String str = arr[j];
                if(j == 0) {
                    temp += str.toUpperCase();
                } else {
                    temp += str;
                }
                
            }
           
            strArr[i] = temp;
          
        }
        return String.join(" ", strArr);
    }
}