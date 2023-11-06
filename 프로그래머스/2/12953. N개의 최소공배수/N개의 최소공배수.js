function solution(arr) {
  let maxNum = arr.reduce((a,b) => a * b);
  let result = 0;
  let check = true;
    
  for(let i = Math.max(...arr); i <= maxNum; i++) {
      check = true;
      for(let j = 0; j < arr.length; j++) {
          if(i % arr[j] != 0) {
              check = false;
              break;
          }
      }
      if(check) {
        result = i;
        break;
      }
  }
    
  return result;
}