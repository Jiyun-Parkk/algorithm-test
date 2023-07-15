function solution(ingredient) {
     let burger = 0;
     let stack = [];
     for(const ingre of ingredient) {
         stack.push(ingre);
         if(stack[stack.length-4] === 1 
            && stack[stack.length-3] === 2 &&  
            stack[stack.length-2] === 3 && 
            stack[stack.length-1] === 1) {
                 stack.pop();
                 stack.pop();
                 stack.pop();
                 stack.pop();
                 burger++;
         } 
     }
     return burger;
}