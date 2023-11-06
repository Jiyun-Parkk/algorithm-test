function solution(s) {
   let result = [];
    
   s = s.split('},{').filter((st) => st)
       .map((st) => st.replace("{{", "").replace("}}","").split(","))
       .sort((a,b) => a.length - b.length);
    
    for(let i = 0; i < s.length; i++) {
        for(let j = 0; j < s[i].length; j++) {
            if(result.indexOf(parseInt(s[i][j])) < 0) {
                result.push(parseInt(s[i][j]))
            }
        }
    }
    return result;
}