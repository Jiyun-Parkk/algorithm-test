
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> resultArr = new ArrayList<>();
        while (true) {
            String str = "";
            try {
                str = br.readLine();
                StringTokenizer token = new StringTokenizer(str);
                int A = Integer.parseInt(token.nextToken());
                int B = Integer.parseInt(token.nextToken());
                if (A == 0) {
                    break;
                }
                if (A > B) {
                    resultArr.add(calculateResult(A, B, true));
                } else {
                    resultArr.add(calculateResult(B, A, false));
                }

            } catch (Exception e) {
                break;
            }
        }
        for (String str : resultArr) {
            System.out.println(str);
        }
        br.close();
    }

    public static String calculateResult(int big, int small, boolean isFront) {
        if (big % small == 0) {
           return isFront ? "multiple" : "factor";
        } else {
            return "neither";
        }
    }
}
