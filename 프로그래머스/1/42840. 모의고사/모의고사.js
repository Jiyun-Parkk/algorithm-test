function solution(answers) {
    let result = [];
    let one = [1, 2, 3, 4, 5];
    let two = [2, 1, 2, 3, 2, 4, 2, 5];
    let three = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    let score = [0,0,0];
    
    for(let i = 0; i < answers.length; i++){
     let index = [i % 5, i % 8, i % 10]
       
       if(one[index[0]] === answers[i]) {
           score[0]++
       }
       if(two[index[1]] === answers[i]) {
          score[1]++
       }
       if(three[index[2]] === answers[i]) {
         score[2]++
       }
    }
    
    let max = Math.max(...score);
    score = score.map((s,idx) => {
        if(s === max) {
            return  idx + 1;
        } else {
            return 0;
        }
    }).filter((s) => s).sort();
    
    return score;
    
}

