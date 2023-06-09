
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String nums = br.readLine();
        StringTokenizer token = new StringTokenizer(nums);
        int result = 0;
        for(int i = 0; i < count; i++) {
            int num = Integer.parseInt(token.nextToken());
            boolean isRight = true;
            for(int j = 1; j < num; j++) {
                if(num % j == 0 && j !=1) {
                    isRight = false;
                }
            }
            if(isRight && num != 1) {
                result++;
            }
        }
        System.out.println(result);
    }
}
