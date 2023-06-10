import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
    int days = 0;
        int workCount = 0;
        List<Integer> workComplete = new ArrayList<>();
        Queue<Integer> workQue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            workQue.add(i);
        }
        while (!workQue.isEmpty()) {
            int index = workQue.poll();
            int workDays = (int) Math.ceil((double) (100 - progresses[index]) / (double) speeds[index]);
            if (days < workDays) {
                if (days != 0) {
                    workComplete.add(workCount);
                    workCount = 0;
                }
                days = workDays;
            }
            workCount++;
        }
        workComplete.add(workCount);
        return workComplete.stream().mapToInt(Integer::intValue).toArray();
    }
}