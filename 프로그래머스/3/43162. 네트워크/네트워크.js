 let isVisited = [];
 let network = 0;

function solution(n, computers) {
  
    for(let i = 0; i < n; i++) {
        network += dfs(i,n,computers);
    }
    return network;
}

function dfs(i,n,computers) {
    if(isVisited[i]) {
        return 0;
    }
    
    isVisited[i] = true;
    
    for(let j = 0; j < n; j++) {
        if(computers[i][j] === 1){
            dfs(j,n,computers);
        }
    }
    
    return 1;
}