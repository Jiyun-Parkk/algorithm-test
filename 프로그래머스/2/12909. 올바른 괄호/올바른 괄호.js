function solution(s){
   let stack = [];
  
   for(const b of s) {
       if(b === "(") {
           stack.push(b);
       } else if(b === ")") {
           if(stack.length > 0 && stack[stack.length - 1] === "(") {
               stack.pop();
           } else {
               stack.push(b);
               break;
           }
       }
   }
   return stack.length === 0 ? true : false;
}