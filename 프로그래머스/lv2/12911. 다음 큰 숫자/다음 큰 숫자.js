function solution(n) {
    let answer = n;
    let nBinary = n.toString(2);
    let countOne = nBinary.split("").filter((num) => num != "0").length;
    while(true) {
        answer++;
        let nextBinary = answer.toString(2);
        let nextOneCount = nextBinary.split("").filter((num) => num != "0").length;
        if(nextOneCount == countOne) {
            break;
        }
    }
    return answer;
}