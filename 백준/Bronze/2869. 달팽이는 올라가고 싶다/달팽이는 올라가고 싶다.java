
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer token = new StringTokenizer(str);
        int A = Integer.parseInt(token.nextToken());
        int B = Integer.parseInt(token.nextToken());
        int V = Integer.parseInt(token.nextToken());
        int date = (V - B) / (A - B);

        if((V - B) % (A - B) != 0) {
            date++;
        }
        System.out.println(date);
    }
}
