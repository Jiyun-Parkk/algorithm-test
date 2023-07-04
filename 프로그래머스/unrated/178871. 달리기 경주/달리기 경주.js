function solution(players, callings) {
  let playerMap = new Map();
  let rankMap = new Map();
  let result = [];
  for(let i = 0; i < players.length; i++) {
      playerMap.set(players[i],i);
      rankMap.set(i, players[i]);
  }
  for(let i = 0; i < callings.length; i++) {
      let currentRank = playerMap.get(callings[i]);
      let swapedRank = currentRank - 1;
      let swapedPlayer = rankMap.get(currentRank - 1);
      playerMap.set(callings[i],swapedRank);
      playerMap.set(swapedPlayer, currentRank);
      rankMap.set(currentRank, swapedPlayer);
      rankMap.set(swapedRank,callings[i]);
  }

    return Array.from(rankMap.values())
}