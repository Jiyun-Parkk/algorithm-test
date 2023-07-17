function solution(clothes) {
    let clothMap = new Map();
    let count = 1;
    for(const [idx, cloth] of clothes.entries()) {
        const clothKey = cloth[1];
        const clothValue = cloth[0];
        if(clothMap.get(clothKey) == null) {
            clothMap.set(clothKey,[clothValue]);
        } else {
            const clothList = clothMap.get(clothKey);
            clothList.push(clothValue);
            clothMap.set(clothKey, clothList);
        }
    }
    for(const [key,value] of clothMap.entries()) {
        count *= (value.length + 1)
    }
    count -= 1;
    return count;
}