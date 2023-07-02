function solution(n, words) {
    let wordMap = new Map();
    let playerMap = new Map();
    let result = [0,0];
    for(let [idx, word] of words.entries()) {
       let playerNum = (idx % n) + 1
       if(!playerMap.get(playerNum)) {
           playerMap.set(playerNum, [])
       }
       let playerAnswer = playerMap.get(playerNum);
        playerAnswer.push(word);
        playerMap.set(playerNum, playerAnswer);  
       if(idx > 0 && word[0] !== words[idx - 1].slice(-1)) {
           result = [playerNum, playerMap.get(playerNum).length]
           break;
       }
       if(wordMap.get(word)) {
           result = [playerNum, playerMap.get(playerNum).length]
           break;
       } else if(!wordMap.get(word)){
           wordMap.set(word, 1)
       }
    }
    return result;
}