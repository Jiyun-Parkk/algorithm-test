function solution(numbers, target) {
    // stack 생성
    const stack = [new State(0,0)];
    let count = 0;
    
    while(stack.length > 0) {
        const getState = stack.pop();
        if(getState.index === numbers.length) {
            if(getState.acc === target) {
                count++;
            }
            continue;
        }
        
        stack.push(new State(getState.index + 1, getState.acc + numbers[getState.index]))
        stack.push(new State(getState.index + 1, getState.acc - numbers[getState.index]))
    }
    
    
    
    return count;
}

class State{
        constructor(index, acc) {
           this.index = index;
           this.acc = acc; 
        }
  }