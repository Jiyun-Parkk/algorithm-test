class Solution
{
    public int solution(int n, int a, int b)
    {
       int teamA = a;
       int teamB = b;
       int round = 0;
        
       while(true) {
           round++;
           if(Math.abs(teamA - teamB) == 1 && Math.max(teamA,teamB) % 2 == 0) {
               break;
           }
            teamA = (int) Math.ceil((double) teamA / 2);
            teamB = (int) Math.ceil((double) teamB / 2);
       }
      return round;
    }
}