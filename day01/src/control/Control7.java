package control;

import java.util.Random;
import java.util.Scanner;

public class Control7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
            System.out.println("Enter Command: {arr1, arr2, arr3, q}");
            String cmd = sc.nextLine();

            if (cmd.equals("q")) {
                System.out.println("Quit...");
                break;
            }

            // arr1: 숫자 하나 입력받아 출력
            else if (cmd.equals("arr1")) {
                System.out.println("Enter Number(1~10): ");
                String num = sc.nextLine();
                System.out.println("입력값: " + num);
            }

            // 한개의 1~10까지의 숫자를 입력 받는다
            // 해당 사이즈의 1차원 배열을 생성한다
            // 배열에 랜덤하게 1~10까지 값을 입력 한다. 중복 되지 않게 입력
            else if (cmd.equals("arr2")) {
                System.out.println("Enter Number(1~10): ");
                int num = Integer.parseInt(sc.nextLine());

                if (num < 1 || num > 10) {
                    System.out.println("Invalid Input");
                    continue;
                }

                int[] arr = new int[num];
                boolean[] used = new boolean[11]; // 1~10 사용 여부

                int sum = 0;
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for (int i = 0; i < num; i++) {
                    int r;
                    do {
                        r = rand.nextInt(10) + 1;
                    } while (used[r]);

                    arr[i] = r;
                    used[r] = true;

                    System.out.println((i + 1) + "번째 배열값: " + r);
                    sum += r;
                    if (r > max) max = r;
                    if (r < min) min = r;
                }

                float avg = (float) sum / num;
                System.out.println("합계 = " + sum);
                System.out.println("평균 = " + avg);
                System.out.println("최대값 = " + max + " / 최솟값 = " + min);
            }

            // 두개의 1~5까지의 숫자를 입력 받는다
            // 해당 사이즈의 2차원 배열을 생성한다
            // 배열에 랜덤하게 1~30까지 값을 입력 한다. 중복 되지 않게 입력
            else if (cmd.equals("arr3")) {
                System.out.print("Enter First Number (1~5): ");
                int num1 = Integer.parseInt(sc.nextLine());
                if (num1 < 1 || num1 > 5) {
                    System.out.println("Invalid Input");
                    continue;
                }

                System.out.print("Enter Second Number (1~5): ");
                int num2 = Integer.parseInt(sc.nextLine());
                if (num2 < 1 || num2 > 5) {
                    System.out.println("Invalid Input");
                    continue;
                }

                int[][] arr = new int[num1][num2];
                boolean[] used = new boolean[31]; // 1~30 사용 여부

                int sum = 0;
                int max = 0;
                int min = 40;

                for (int i = 0; i < num1; i++) {
                    for (int j = 0; j < num2; j++) {
                        int r;
                        do {
                            r = rand.nextInt(30) + 1;
                        } while (used[r]);

                        arr[i][j] = r;
                        used[r] = true;

                        sum += r;
                        if (r > max) max = r;
                        if (r < min) min = r;
                    }
                }

                // 배열 출력
                System.out.println("\n==== 배열 출력 ====");
                for (int[] row : arr) {
                    for (int n : row) {
                        System.out.printf("%4d", n);
                    }
                    System.out.println();
                }
                int totalSize = num1 * num2;
                float avg = (float) sum / totalSize;
                System.out.println("\n합계 = " + sum);
                System.out.printf("평균 = %.2f\n", avg);
                System.out.println("최대값 = " + max + " / 최솟값 = " + min);
            }

            // 알 수 없는 명령어 처리
            else {
                System.out.println("Invalid command. Try again.");
            }
        }

        sc.close();
    }
}
