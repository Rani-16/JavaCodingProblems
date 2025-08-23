package arraypblms;

public class CheckSomeOfTens {
    public static void main(String[] args) {
        int[] arr1 = {10, 10, 10, 30, 10}; // three 10s → sum = 30
        int[] arr2 = {10, 10, 20, 40};     // two 10s → sum = 20
        int[] arr3 = {10, 10, 10, 10};     // four 10s → sum = 40
        int target = 10;
        int sumTarget = 30;
        int sum = 0;
        boolean result = false;
        for (int c : arr2) {
            if (c == target) {
                sum += c;

            }
        }
        if (sum == sumTarget) {
            result = true;
        }
        System.out.println(result);
    }
}
