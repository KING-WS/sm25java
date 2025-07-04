package Array;

import java.util.Random;

public class Array1 {
    public static void main(String[] args) {
        //Reference Type
        int [] arr1 = new int [5];
        int [] arr2 = new int [5];
        int [] arr3 = {1,2,3,4,5};

        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            arr1[i] = rand.nextInt(10); //0~9
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
