import java.util.*;
import java.lang.*;
class Solution {
    public int solution(int[] priorities, int location) {
             Queue<Integer> queue = new LinkedList<>();
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    int index = 0;
    int print = priorities.length + 1;
    int count = 0;
    for(int num: priorities){
      queue.add(num);
      pq.add(num);
    }
    while(true) {
      int num = queue.peek();
      if(num != pq.peek()) {
        queue.poll();
        queue.add(num);
      } else {
        queue.poll();
        queue.add(0);
        pq.poll();
        print = index;
        count++;
      }
      if(print == location) break;
      index++;
      if(index == priorities.length) {
        index = 0;
      }
    }
        return count;
    }
}