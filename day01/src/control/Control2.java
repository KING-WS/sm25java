package control;

public class Control2 {
    public static void main(String[] args) {
        int sum = 0;
        double avg = 0.0;

        for(int i=1;i<=10;i++ ){
            sum = sum + i;
        }
        System.out.println("sum="+sum);
        avg =(double)sum/10;
        System.out.printf("%3.3f\n",avg);

    }
}
