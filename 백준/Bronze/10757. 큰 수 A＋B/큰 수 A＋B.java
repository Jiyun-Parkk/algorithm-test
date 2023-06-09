
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger A = new BigInteger(sc.next());
    BigInteger B = new BigInteger(sc.next());

    A = A.add(B);
    System.out.println(A.toString());
  }
}
