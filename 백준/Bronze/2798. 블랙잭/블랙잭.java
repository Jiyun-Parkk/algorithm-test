
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(token.nextToken());
        int total = Integer.parseInt(token.nextToken());
        StringTokenizer nums = new StringTokenizer(br.readLine());
        int[] list = new int[nums.countTokens()];
        for (int i = 0; i < count; i++) {
            list[i] = Integer.parseInt(nums.nextToken());
        }
        int r = 3;

        Combination comb = new Combination(list.length, r);
        comb.combination(list, 0, 0, 0, total);
        ArrayList<Integer> result = comb.getResult();

        System.out.println(Collections.max(result));
    }

}

class Combination {
    private int n;
    private int r;
    private int[] now; // 현재 조합
    private ArrayList<Integer> result; // 모든 조합

    public ArrayList<Integer> getResult() {
        return result;
    }

    public Combination(int n, int r) {
        this.n = n;
        this.r = r;
        this.now = new int[r];
        this.result = new ArrayList<Integer>();
    }

    public void combination(int[] arr, int depth, int index, int target, int total) {
        if (depth == r) {
            int temp = 0;
            for (int i = 0; i < now.length; i++) {
                temp += arr[now[i]];
            }
            if (temp <= total) {
                result.add(temp);
            }
            return;
        }
        if (target == n) return;
        now[index] = target;
        combination(arr, depth + 1, index + 1, target + 1, total);
        combination(arr, depth, index, target + 1,total);
    }
}

