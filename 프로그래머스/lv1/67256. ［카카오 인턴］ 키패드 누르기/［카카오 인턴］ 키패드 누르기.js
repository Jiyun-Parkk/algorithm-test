function solution(numbers, hand) {
    // y
    // 왼쪽 숫자 => number % 3 = 1 => 0
    // 가운데 숫자 => numver % 3 = 2 => 1
    // 오른쪽 숫자 => number % 3 = 0 => 2
    
    // Math.ceil(3 / number) - 1 = x
    
    
    // 왼손 엄지: * => 3, 0
    // 오른 엄지: # => 3, 2
    let left = [3, 0];
    let right = [3, 2];
    let result = "";
    // 사이드인지 가운데인지
    for(let i = 0; i < numbers.length; i++) {
        let y = numbers[i] % 3;
        let x = Math.ceil(numbers[i] / 3) - 1;
        if(numbers[i] === 0) {
            x = 3;
            y = 2;
        }
        let isLeft = false;
        if(y === 1) {
            y = 0; // 왼쪽
            isLeft = true;
        } else if(y === 2) {
            y = 1; // 가운데
            // 거리 계산
            let leftDiff = [Math.abs(left[0] - x), Math.abs(left[1] - y)].reduce((a,b) => a + b);
            let rightDiff = [Math.abs(right[0] - x), Math.abs(right[1] - y)].reduce((a,b) => a + b);
            if(leftDiff > rightDiff) {
                isLeft = false;
            } else if(leftDiff < rightDiff ) {
                isLeft = true;
            } else {
                if(hand === "right") {
                  isLeft = false;
                } else {
                  isLeft = true;
                }
            }
        } else {
            y = 2; // 오른쪽
            isLeft = false;
        }
        if(isLeft) {
            left = [x, y]
            result += "L"
        } else {
            right = [x, y]
            result += "R"
        }
    }
    return result;
}