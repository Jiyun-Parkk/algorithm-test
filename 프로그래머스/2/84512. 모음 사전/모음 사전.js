function solution(word) {
 let arr = ['A', 'E', 'I', 'O', 'U']
 let list = [];
 
 function dfs(current,depth) {
     if(depth <= 5) {
         list.push(current);
     for(let i = 0; i < arr.length; i++) {
         dfs(current + arr[i],depth + 1);
      }
    }
 }

    dfs("",0);

return list.indexOf(word);
    
}


