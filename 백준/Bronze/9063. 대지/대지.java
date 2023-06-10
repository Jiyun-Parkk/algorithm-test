
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1. 점의 개수가 주어진다
        int pointCounter = Integer.parseInt(br.readLine());
        int[] xArr = new int[pointCounter];
        int[] yArr = new int[pointCounter];
        // 2. x의 최소값과 최대값이 가로의 길이
        // 3. y의 최고값과 최대값이 세로의 길이
        for(int i = 0; i < pointCounter; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(token.nextToken());
            int y = Integer.parseInt(token.nextToken());
            xArr[i] = x;
            yArr[i] = y;
        }
        Arrays.sort(xArr);
        Arrays.sort(yArr);
        int horizon = xArr[pointCounter - 1] - xArr[0];
        int vertical = yArr[pointCounter - 1] - yArr[0];
        System.out.println(horizon * vertical);
    }
}
