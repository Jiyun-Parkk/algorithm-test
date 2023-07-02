function solution(brown, yellow) {
 let total = brown + yellow;
 let result = [];
  for(let i = 3; i < total; i++) {
    if(total % i == 0) {
        let hori = total / i;
        if(hori <= i) {
            if((hori - 2) * (i - 2) == yellow) {
               result[0] = i;
               result[1] = total / i;
               break;  
            }
        }
    }
  }
    return result;
}