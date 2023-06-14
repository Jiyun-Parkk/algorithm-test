
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static int[][] dp = new int[31][31];
    private static List<String> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 케이스 수
        int T = Integer.parseInt(reader.readLine());

        for (int i = 0; i < T; i++) {
            String[] temp = reader.readLine().split(" ");

            int N = Integer.parseInt(temp[0]);
            int M = Integer.parseInt(temp[1]);

            System.out.println(combination(M, N));
        }

        reader.close();

    }

    private static int combination(int n, int r) {
        // 이미 계산된 값일 경우
        if (dp[n][r] > 0) {
            return dp[n][r];
        }
        // 원소의 갯수가 조합의 갯수와 동일하거나 0일 경우
        else if (n == r || r == 0) {
            return dp[n][r] = 1;
        } else {
            return dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
        }
    }
}
