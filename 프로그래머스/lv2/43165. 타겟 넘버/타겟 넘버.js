function solution(numbers, target) {
    // 초기값 0,0 으로 stack 만들기
    const stack = [new State(0,0)];
    let count = 0;
    while(stack.length > 0) {
        const state = stack.pop();
        if(state.index === numbers.length) {
            if(state.acc === target) count++;
            continue;
        }
        // +일경우
        stack.push(new State(state.index + 1, state.acc - numbers[state.index]));
        // -일경우
        stack.push(new State(state.index + 1, state.acc + numbers[state.index]));
    }
    return count;
}

class State {
    constructor(index, acc) {
        this.index = index;
        this.acc = acc;
    }
}