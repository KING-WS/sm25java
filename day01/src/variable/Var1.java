package variable;

public class Var1 {
    public static void main(String[] args) {
        // 정수는 int
        int intNum = 210000000; //32bit 4byte
        double doubleNum = 210000000D; //64bit 8byte

        byte b1 = 100;
        byte b2 = 100;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);

        //실수 double
        float f1 = 1000000.0F;
        float f2 = 1000000.0F;
        float f3 = f1 + f2;

        System.out.printf("%f", f3);
        double d1 = 1000000.0D;

    }
}
