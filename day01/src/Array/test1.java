package Array;

import java.util.Arrays;
import java.util.Random;
public class test1 {
    public static void main(String[] args) {
        // 5개의 배열에 1~10까지의 숫자를 랜덤하게 입력하세요
        // 단, 중복되지 않게 입력 하세요
        // 전체 배열을 출력 하시오.
        // 배열에 최대, 최소 값을 출력 하시오
        int arr[] = new int[5];
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int num = rand.nextInt(10) + 1;
            if (i != 0) {
                arr[i] = num;
            }else{
                for (int j=0; j<5; j++) {
                    if (arr[j] == num) {
                        i--;
                        break;
                    }else{
                        arr[i] = num;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        int min = arr[0];
        int max = arr[0];

        System.out.printf("%d, %d", min, max);
    }
}
