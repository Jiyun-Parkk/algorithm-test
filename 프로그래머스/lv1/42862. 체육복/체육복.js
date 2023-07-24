function solution(n, lost, reserve) {
    let map = new Map();
    for(let i = 0; i < lost.length; i++) {
        map.set(lost[i],0);
    }
    for(let i = 0; i < reserve.length; i++) {
        if(map.get(reserve[i]) == null) {
            map.set(reserve[i],2) 
        } else {
           map.set(reserve[i],1);  
        }
    }
    for(let i = 1; i <= n; i++) {
        if(map.get(i) == null) {
            map.set(i,1);
        }
        if(map.get(i) == 0) {
            if(map.get(i - 1) === 2 && i - 1 !== 0) {
                map.set(i, 1);
                map.set(i - 1, 1);
            } else if(map.get(i + 1) === 2) {
                map.set(i, 1);
                map.set(i + 1, 1); 
            }
        }
    }
    map = [...map.values()].filter((num) => num >= 1);
    return map.length;
}