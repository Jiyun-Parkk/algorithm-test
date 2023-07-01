function solution(s){
    
    while(true) {
       let count = 0;
       let arr = [];
       for(let i = 0; i < s.length; i++) {
            if(arr.length === 0) {
                arr.push(s[i])
            } else {
               if(arr[arr.length - 1] === s[i]) {
                arr.pop()
                count++;
                if(s.length === 0) break;
              } else {
                arr.push(s[i])
             } 
            } 
        }
        s = arr.join('');
        if(count === 0) break;
    }
    
    return s.length === 0 ? 1 : 0;
}