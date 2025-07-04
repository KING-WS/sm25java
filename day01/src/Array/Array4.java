package Array;

import java.util.Scanner;
/*5개에 배열에 1~10까지의 숫자를 랜덤하게 입력하세요
단, 중복되지 않게 입력 하세요
전체 배열을 출력 하시오
배열에 최대, 최소 값을 출력 하시오*/
import java.util.Random;

public class Array4 {
    public static void main(String[] args) {
        int[] num = new int[5];
        Random rand = new Random();

        int i = 0;
        while (i < num.length) {
            int randNum = rand.nextInt(10) + 1; // 1~10 사이
            boolean isDuplicate = false;

            // 중복 체크
            for (int j = 0; j < i; j++) {
                if (num[j] == randNum) {
                    isDuplicate = true;
                    break;
                }
            }

            // 중복 아니면 저장
            if (!isDuplicate) { // isDuplicate == false 와 같은 의미
                num[i] = randNum;
                i++;
            }
        }

        // 배열 출력
        System.out.print("배열 값: ");
        for (int n : num) {
            System.out.print(n + " ");
        }

        // 최대/최소 구하기
        int max = num[0];
        int min = num[0];

        for (int n : num) {
            if (n > max) max = n;
            if (n < min) min = n;
        }

        System.out.println("\n최대값: " + max);
        System.out.println("최소값: " + min);
    }
}
