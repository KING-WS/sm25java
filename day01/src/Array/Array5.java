package Array;

import java.util.Arrays;
import java.util.Random;

public class Array5 {
    public static void main(String[] args) {
        // Reference Type...
        int [] arr1 = new int[5];
        int arr2 [] = new int[5];
        int [] arr3 = {1,2,3,4,5};

        Random rand = new Random();

        for(int i=0;i<5;i++){
            int num = rand.nextInt(10)+1;
            arr1[i] = num;
            if(i != 0){
                for(int j=0;j<5;j++){
                    if(arr1[j] == num)
                        i--;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.stream(arr1).sum());
        System.out.println(Arrays.stream(arr1).average().getAsDouble());
        System.out.println(Arrays.stream(arr1).max().getAsInt());
        System.out.println(Arrays.stream(arr1).min().getAsInt());
    }
}