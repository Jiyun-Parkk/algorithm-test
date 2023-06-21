import java.util.*;
import java.lang.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
       List<int[]> blockedList = new ArrayList<>();
        int[] myCurrentPoint = new int[2];
        boolean isBlocked = false;
        boolean isOut = false;


        // 나의 현재 지점
        for (int i = 0; i < park.length; i++) {
            String[] positions = park[i].split("");
            for (int j = 0; j < positions.length; j++) {
                int[] position = {i, j};
                if (positions[j].equals("X")) {
                    blockedList.add(position);
                }
                if (positions[j].equals("S")) {
                    myCurrentPoint[0] = position[0];
                    myCurrentPoint[1] = position[1];
                }
            }
        }
        //주어진 방향으로 이동 중 장애물을 만나는지 확인

        for (int i = 0; i < routes.length; i++) {
            String[] moveCommand = routes[i].split(" ");
            int commandNum = Integer.parseInt(moveCommand[1]);
            int tempFirst;
            int tempSecond;
            isBlocked = false;
            isOut = false;
            tempFirst = myCurrentPoint[0];
            tempSecond = myCurrentPoint[1];
            if (moveCommand[0].equals("N")) { // 위 - 0--
                tempFirst -= commandNum;
            }
            if (moveCommand[0].equals("S")) { // 아래 - 0++
                tempFirst += commandNum;
            }
            if (moveCommand[0].equals("W")) { // 왼쪽 - 1--
                tempSecond -= commandNum;
            }
            if (moveCommand[0].equals("E")) { // 오른쪽 - 1++
                tempSecond += commandNum;
            }
            //주어진 방향으로 이동할 떄 공원을 벗어나는지 확인
            if (checkIsOut(tempFirst, park.length) || checkIsOut(tempSecond, park[0].length())) {
                isOut = true;
            }
            // 장애물의 여부
            if (!isOut) {
                for (int j = 0; j < blockedList.size(); j++) {
                    int[] blockedPosition = blockedList.get(j);
                    int bigX = myCurrentPoint[0];
                    int smallX = tempFirst;
                    int bigY = myCurrentPoint[1];
                    int smallY = tempSecond;
                    if (myCurrentPoint[0] < tempFirst) {
                        bigX = tempFirst;
                        smallX = myCurrentPoint[0];
                    }
                    if (myCurrentPoint[1] < tempSecond) {
                        bigY = tempSecond;
                        smallY = myCurrentPoint[1];
                    }

                    if (moveCommand[0].equals("N") || moveCommand[0].equals("S")) { // 위 - 0--
                        if (blockedPosition[0] >= smallX && blockedPosition[0] <= bigX && blockedPosition[1] == tempSecond) {
                            isBlocked = true;
                            break;
                        }
                    }
                    if (moveCommand[0].equals("W") || moveCommand[0].equals("E")) { // 왼쪽 - 1--
                        if (blockedPosition[1] >= smallY && blockedPosition[1] <= bigY && blockedPosition[0] == tempFirst) {
                            System.out.println(blockedPosition[1]);
                            isBlocked = true;
                            break;
                        }
                    }
                }
                if (!isBlocked) {
                    myCurrentPoint[0] = tempFirst;
                    myCurrentPoint[1] = tempSecond;
                }
            }

        }
        return myCurrentPoint;
    }
    public static boolean checkIsOut(int position, int length) {
        boolean isOut = false;
        if (position >= length || position < 0) {
            isOut = true;
        }
        return isOut;
    }


}