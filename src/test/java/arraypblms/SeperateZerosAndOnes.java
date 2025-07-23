package arraypblms;

import java.util.Arrays;

public class SeperateZerosAndOnes {
    public static int[] zerosAndOne() {
        int arr[] = new int[]{0, 0, 1, 1, 0, 1, 1, 1, 0, 0};
        //count the no.of zeros
        int count = 0;
        for (int c : arr) {
            if (c == 0) {
                count++;
            }
        }
        System.out.println("Zero count form the array ="+count);
        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }
        for (int j = count; j <= arr.length - 1; j++) {
            arr[j] = 1;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] result = SeperateZerosAndOnes.zerosAndOne();
        System.out.println(Arrays.toString(result));
    }
}
