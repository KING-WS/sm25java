package operation;

public class Op4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int min = 0;
        int max = 0;

        max = (a > b) ? ((a > c) ? a : c) :  ((b > c) ? b : c);
        min = (a < b) ? ((a < c) ? a : c) :  ((b > c) ? b : c);

        System.out.printf("%d %d", min, max);
        //3수의 최대값과 최소값을 구하시오
        /*int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        System.out.println(max);
        System.out.println(min);*/
        //if
        /*int max = a;
        if (b > max) max=b;
        if (c > max) max=c;

        int min = a;
        if (b < min) min=b;
        if (c < min) min=c;
        System.out.println(max);
        System.out.println(min);*/
    }
}
