
import java.io.*;


public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] arr = br.readLine().split("-");
    int result = 0;
    for(int i = 0; i < arr.length; i++) {
      String[] splitPlus = arr[i].split("[+]");
      for(int j = 0; j < splitPlus.length; j++) {
        int num = Integer.parseInt(splitPlus[j]);
        if( i == 0) {
          result += num;
        } else {
          result -= num;
        }
      }
    }
    System.out.println(result);
  }
}
