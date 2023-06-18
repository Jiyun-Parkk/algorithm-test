function solution(babbling) {
   let count = 0;
   const bables = ["aya","ye","woo","ma"];
   for(const [idx, str] of babbling.entries()) {
       for(const str2 of bables){
          babbling[idx] = babbling[idx].replaceAll(str2, " ");
       }
   }
   for(let i = 0; i < babbling.length; i++) {
       if(babbling[i].trim().length == 0) {
           count++;
       }
   }
    
   return count;
   
}