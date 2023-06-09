import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        int count = 0;
        boolean check = false;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            priorityQueue.add(scoville[i]);
        }
        while (priorityQueue.size() > 0) {
            if (priorityQueue.peek() >= K) {
                check = true;
                break;
            } else if(priorityQueue.size() == 1) {
                break;
            }
            int first = priorityQueue.poll();
            int second = priorityQueue.poll();
            priorityQueue.add(first + (second * 2));
            count++;
        }
      if(check) {
          return count;
      } else {
          return -1;
      }
    }
}