class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            int plus = i;
            int sum = 0;
            while(sum < n) {
                sum += plus;
                plus++;
            }
            if(sum == n) {
                answer++;
            }
        }
        return answer;
    }
}