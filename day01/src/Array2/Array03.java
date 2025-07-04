package Array2;
import java.util.Random;

public class Array03 {
    public static void main (String[] args) {
        /*5행 5열의 배열에
        1~100 까지의 random한 숫자를 입력한다
        단, 중복 X 최종 배열 출력*/
        Random rand = new Random();
        int arr[][] = new int[5][5];
        boolean[] same = new boolean[101];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int num;
                do {
                    num = rand.nextInt(100)+1;
                }while (same[num]);
                arr[i][j] = rand.nextInt(100); // 배열에 삽입
                same[num] = true; //사용완료

            }
        }
        // 배열 출력
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
