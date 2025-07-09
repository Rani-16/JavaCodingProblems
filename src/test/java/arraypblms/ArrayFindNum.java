package arraypblms;

public class ArrayFindNum {
    public void findNum(int[] arr, int target) {
        boolean result = false;
        for (int c : arr) {
            if (c == target) {
                result = true;
                break;
            }
        }
        if (result) {
            System.out.println("Number is there in array");
        } else {
            System.out.println("Number is not in array");
        }
    }

    public static void main(String[] args) {
        ArrayFindNum a = new ArrayFindNum();
        int[] arr = {1, 2, 3, 4, 5};
        int target = 6;
        a.findNum(arr, target);
    }
}
