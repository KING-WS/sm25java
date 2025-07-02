package control;

public class Control5 {
    public static void main(String[] args) {
        //1+10 짝수 합과 평균 for문을 통해 구하시오
        //while
        int sum = 0;
        int i=0;
        int count=0;
        while(i<=10){
            if(i%2==0){
                sum+=i;
                i++;
            }else{
                i++;
            }
        }
        double avg = (double)sum/i;
        System.out.printf("%d, %5.2f",sum,avg);
    }
}