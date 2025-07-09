package arraypblms;

public class FindingIndexPblm {
    public static int findIndex() {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 10;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == target) {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int j = FindingIndexPblm.findIndex();
        if (j == -1) {
            System.out.println("element is found at index " + j);
        } else {
            System.out.println("element is not found at index ");
        }

    }
}

