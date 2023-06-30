function solution(A,B){
    let result = 0;
    if(Math.max(...A) * Math.min(...B) > Math.max(...B) * Math.min(...A)) {
        B = B.sort((a,b) => a - b);
        A = A.sort((a,b) => b - a); 
    } else {
        A = A.sort((a,b) => a - b);
        B = B.sort((a,b) => b - a); 
    }
   
    for(let i = 0; i < A.length; i++) {
        result += (A[i] * B[i])
    }
    return result
}