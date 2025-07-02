package control;

public class Control4 {
    public static void main(String[] args) {
        // 1~10까지의 숫자중 짝수의 합과 평균을 구하시오
        // for
        // for문을 이용하여 구하시오
        int sum = 0;
        double avg = 0.0;
        int cnt = 0;
        for(int num=1; num<=10 ; num++){
            if(num%2==0){
                sum += num;
                cnt++;
            }
        }
        avg = Double.valueOf(sum)/cnt;
        System.out.printf("%d, %5.2f",sum, avg);

    }
}