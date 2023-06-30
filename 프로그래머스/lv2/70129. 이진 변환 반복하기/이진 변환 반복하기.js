function solution(s) {
    var answer = [0,0];
    let result = 0;
    let str = s;
    
    while(result != 1) {
        let temp = str;
        str = str.split("").filter((num) => num != 0).join("");
        result = Number(str.length).toString(2);
        answer[0]++;
        answer[1] += temp.length - str.length;
        str = result;
    }
    return answer;
}