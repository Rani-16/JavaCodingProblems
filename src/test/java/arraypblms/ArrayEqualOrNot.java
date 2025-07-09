package arraypblms;

public class ArrayEqualOrNot {
    public static boolean arrayEqual() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        //boolean a= Arrays.equals(arr1,arr2);
        int a = arr1.length;
        int b = arr2.length;
        if (a != b) {
            return false;
        }
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean b = ArrayEqualOrNot.arrayEqual();
        if (b) {
            System.out.println("Arrays are Equal");
        } else {
            System.out.println("Arrays are not Equal");
        }
    }
}