function solution(n,a,b){
  let teamA = Math.round(a / 2)
  let teamB = Math.round(b / 2)
  let big = teamA > teamB ? teamA : teamB;
  let small = teamA < teamB ? teamA : teamB;
  let round = 1;
  if(teamA === teamB) {
      return 1;
  }
  while(true) {
      round++;
      if(big - small === 1 && big % 2 === 0) {
          break;
      }
      teamA = Math.round(teamA / 2);
      teamB = Math.round(teamB / 2);
      big = teamA > teamB ? teamA : teamB;
      small = teamA < teamB ? teamA : teamB;
  }
  
  return round;
}