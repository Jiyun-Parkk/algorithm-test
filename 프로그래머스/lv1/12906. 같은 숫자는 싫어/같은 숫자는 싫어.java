import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
      // 1. 이전 원소값 저장할 변수
      int before = 0;
      // 2. 중복되지 않은 리스트
      ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) {
            // 3. 첫번째 인덱스는 무조건 추가
            if(i == 0 ) {
                newArr.add(arr[i]);
            } else {
                // 4. 두번째 인덱스부터 before와 비교하여 값이 다르면 리스트에 추가 
                if(arr[i] != before) {
                    newArr.add(arr[i]);
                } 
            }
            // 5. 마지막에 현재 값을 이전 원소로 저장
            before = arr[i];
        }
     // 6. 리스트를 배열로 변경
      int[] answer = new int[newArr.size()];
        for(int i = 0; i < newArr.size(); i++) {
            answer[i] = newArr.get(i);
        }
        return answer;
    }
}