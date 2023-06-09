
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> devidedList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0 && i != 1) {
                devidedList.add(i);
            }
        }
        for (int i = 0; i < devidedList.size(); i++) {
            boolean isRight = true;
            for (int j = 1; j < devidedList.get(i); j++) {
                if (devidedList.get(i) % j == 0 && j != 1) {
                    isRight = false;
                }
            }
            if (isRight) {
                list.add(devidedList.get(i));
            }
        }

        int index = 0;

        while(num != 1) {
            if (num % list.get(index) != 0) {
                index++;
            }
            num /= list.get(index);
            System.out.println(list.get(index));
        }
    }


}
