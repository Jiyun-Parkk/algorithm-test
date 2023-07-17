import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        // 각 종류별로 해쉬를 만든다
        Map<String,List<String>> clothMap = new HashMap<>();
        for(int i = 0; i < clothes.length; i++){
            String clothKey = clothes[i][1];
            String clothValue = clothes[i][0];
            if(clothMap.get(clothKey) == null) {
              List<String> clothList = new ArrayList<>();
              clothList.add(clothValue);
              clothMap.put(clothKey, clothList); 
            } else {
              List<String> clothList = clothMap.get(clothKey);
              clothList.add(clothValue);
              clothMap.put(clothKey,clothList);              
            }
            
        }
        // 해쉬 키의 최대값보다 작은 수들을 하나씩 매칭시켜준다.
        int count = 1;
        for(String key : clothMap.keySet()) {
           count *= (clothMap.get(key).size() + 1);
        }
         count -= 1;
        return count;
    }
}