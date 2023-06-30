function solution(n) {
    let answer = 0;
        for(let i = 1; i <= n; i++) {
            let plus = i;
            let sum = 0;
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