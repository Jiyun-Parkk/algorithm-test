
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> result = new ArrayList<>();
        check:
        while (true) {
            String triangle = br.readLine();
            StringTokenizer token = new StringTokenizer(triangle);
            Set<Integer> triangleSet = new HashSet<>();
            int[] triangleArr = new int[3];
            for (int i = 0; i < 3; i++) {
                int parsedInt = Integer.parseInt(token.nextToken());
                if (parsedInt == 0) {
                    break check;
                }
                triangleSet.add(parsedInt);
                triangleArr[i] = parsedInt;
            }
            Arrays.sort(triangleArr);
            if (triangleArr[0] + triangleArr[1] <= triangleArr[2]) {
                result.add("Invalid");
            } else if (triangleSet.size() == 3) {
                result.add("Scalene");
            } else if (triangleSet.size() == 2) {
                result.add("Isosceles");
            } else {
                result.add("Equilateral");
            }
        }

        for (String str : result) {
            System.out.println(str);
        }
    }
}
