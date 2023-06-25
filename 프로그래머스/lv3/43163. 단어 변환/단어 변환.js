function solution(begin, target, words) {
    // 1. 방문 여부를 체크해주는 리스트를 만든다
    const isVisited = [];
    // 3. 큐를 만들어준다.
    const queue = [new State(begin,0)];
    // 4. 큐가 빌때까지 while을 돌린다.
    while(queue.length != 0) {
        const state = queue.shift();
        if(state.word === target) {
            return state.step;
        }
        for(let i = 0; i < words.length; i++){
            const next = words[i];
            if(!isConvertable(state.word, next)) {
                continue;
            }
            if(isVisited[i]) {
                continue;
            }
            isVisited[i] = true;
            queue.push(new State(next, state.step + 1));
        }
    }
    return 0;
}
// 2. 문자를 비교해주는 함수를 만든다.
function isConvertable(src, dist) {
    let diff = 0;
    for(let i = 0; i < src.length; i++) {
        if(src[i] != dist[i]) diff++;
    }
    return diff === 1;
}

class State {
    constructor(word, step) {
        this.word = word;
        this.step = step;
    }
}