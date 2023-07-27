function solution(n) {
    let answer = 1;
    for(let i = 1; i <= n; i++) {
        while(true) {
          if(answer % 3 !== 0 && String(answer).indexOf("3") < 0) {
              break;
          }  
          ++answer;
        }
        ++answer;
    }
    return answer - 1;
}