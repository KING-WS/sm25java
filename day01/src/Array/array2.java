package Array;
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = new String[3];
        // 3번 문자를 입력 받아 배열을 출력하시오
        for (int i = 0; i < strs.length; i++) {
            strs[i] = sc.next();
        }
        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i] + " ");
        }
        sc.close();
    }
}
