
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // 대각선의 원소 개수는 분모와 분자를 합한 것 - 1이다
    int order = sc.nextInt();
    int initialNum = 0;
    int count = 0;
    int top = 0;
    int bottom = 0;

    while(count < order) {
      count+=initialNum;
      initialNum++;
    }
    initialNum--;
    int orderIngroup = order - (count - initialNum);
    int orderIngroup2 =  initialNum + 1 - orderIngroup;
    if(initialNum % 2 == 0) {
        top = orderIngroup;
        bottom =orderIngroup2;
    } else {
      top = orderIngroup2;
      bottom = orderIngroup;
    }
    System.out.println(top + "/" + bottom);
  }


}
