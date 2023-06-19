import java.lang.*;
import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String,Set<String>> map = new HashMap<>();
        for(String member: id_list) {
            Set<String> list = new HashSet<>();
            map.put(member, list);
        }
        for(String member: report){
            String[] reported = member.split(" ");
            Set<String> reportedList = map.get(reported[1]);
            reportedList.add(reported[0]);
        }
        
        String[] list = map.values().stream()
                .filter(i -> i.size() >= k)
                .flatMap(i -> i.stream())
                .toArray(String[]::new);
        Map<String,Integer> resultMap = new LinkedHashMap<>();
        for(String member: id_list){
            resultMap.put(member,0);
        }
        for(String result:list){
            int count = resultMap.get(result);
            resultMap.put(result,count + 1);
        }
        int[] values = resultMap.values().stream().mapToInt(Integer::intValue).toArray();
        return values;
    }
}