package arraypblms;

import java.util.Arrays;

public class TaskOf12Jul2025 {

//    Write a Java program or function which sorts an array containing only 0s, 1s and 2s.
//    Your program should take an integer array of 0s, 1s and 2s as input array
//    and sort them without using any inbuilt sorting methods.
//
//    Array Before Sorting : [1, 0, 2, 2, 0, 2, 1, 2, 1, 1, 2, 0]
//    Array After Sorting : [0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2]
//                           [0, 0, 0, 1, 2, 2, 2, 2, 2, 2, 2, 2]
//    How To Find Smallest And Second Smallest Element In An Array?

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 2, 2, 0, 2, 1, 2, 1, 1, 2, 0};
        int countZero = 0;
        int countOne = 0;
                for (int c : arr) {
            if (c == 0) {
                countZero++;
            } else if (c == 1) {
                countOne++;
            }
        }
        System.out.println("Count of zeros = " + countZero);
        System.out.println("Count of ones = " + countOne);
        for (int i = 0; i <countZero; i++) {
            arr[i] = 0;
        }
        for (int j = countZero; j < countZero+countOne; j++) {
            arr[j] = 1;
        }
        for (int k = countZero+countOne; k < arr.length ; k++) {
            arr[k] = 2;
        }
        System.out.println(Arrays.toString(arr));
    }
public void approach2(){
            int[] arr = new int[]{1, 0, 2, 2, 0, 2, 1, 2, 1, 1, 2, 0};

            System.out.println("Array Before Sorting: " + Arrays.toString(arr));

            // Count number of 0s, 1s and 2s
            int countZero = 0, countOne = 0, countTwo = 0;
            for (int num : arr) {
                if (num == 0) countZero++;
                else if (num == 1) countOne++;
                else if (num == 2) countTwo++;
            }

            // Overwrite the array
            int index = 0;
            for (int i = 0; i < countZero; i++) arr[index++] = 0;
            for (int i = 0; i < countOne; i++) arr[index++] = 1;
            for (int i = 0; i < countTwo; i++) arr[index++] = 2;

            System.out.println("Array After Sorting: " + Arrays.toString(arr));
        }


}
