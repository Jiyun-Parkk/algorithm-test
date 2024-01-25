function solution(genres, plays) {
    let answer = [];
    let gernesMap = new Map();
    let songsMap = new Map();
    
    for(let i = 0; i < genres.length; i++) {
        if(gernesMap.get(genres[i])){
            gernesMap.set(genres[i],gernesMap.get(genres[i]) + plays[i]);
        } else {
            gernesMap.set(genres[i],plays[i]); 
        }
        if(songsMap.get(genres[i])){
            songsMap.set(genres[i],songsMap.get(genres[i]).set(i,plays[i]));
        } else {
             let newMap = new Map();
             newMap.set(i,plays[i])
             songsMap.set(genres[i], newMap);
        }
    }
    
    let sortedGernes = [...gernesMap.keys()].sort((a,b) => {
        if(gernesMap.get(a) < gernesMap.get(b)) {
            return 1;
        } else if(gernesMap.get(a) > gernesMap.get(b)) {
            return -1
        } else {
            return 0;
        }
    })
    
    for(let g of songsMap.keys()) {
        let sortIndex = [...songsMap.get(g).keys()].sort((a,b) => {
            if(songsMap.get(g).get(a) < songsMap.get(g).get(b)) {
                return 1;
            } else if(songsMap.get(g).get(a) > songsMap.get(g).get(b)) {
                return -1;
            } else {
                return 0;
            }
        })
        songsMap.set(g, sortIndex)
    }
    
    for(let g of sortedGernes) {
        if(songsMap.get(g).length >= 2) {
          answer.push(songsMap.get(g)[0]);
          answer.push(songsMap.get(g)[1]);  
        } else {
          answer.push(songsMap.get(g)[0]);
        }
        
    }
    
    return answer;
}