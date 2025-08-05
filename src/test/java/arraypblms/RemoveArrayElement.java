package arraypblms;

import java.util.Arrays;

public class RemoveArrayElement {
    public static void main(String[] args) {
        int arr[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int index = 1;
        System.out.println(arr.length);
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];

        }
        System.out.println(Arrays.toString(arr));
    }
}
