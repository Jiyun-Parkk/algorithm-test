import java.util.*;
class Solution {
    public int[] solution(String s) {
    int[] answer = {0,0};
    String result = "0";
    String str = s;

    while(!result.equals("1")) {
      String temp = str;
      String[] strArr= Arrays.stream(str.split("")).filter(i -> i.equals("1")).toArray(String[]::new);
      str = String.join("",strArr);
      result = Integer.toBinaryString(str.length());
      answer[0]++;
      answer[1] += temp.length() - str.length();
      str = result;

    }
    return answer;
    }
}