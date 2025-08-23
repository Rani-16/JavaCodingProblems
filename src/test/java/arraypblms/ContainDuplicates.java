package arraypblms;

public class ContainDuplicates {
    //        Input: nums = [1,2,3,1]
//        Output: true
//        Explanation: 1 appears twice
    public static boolean duplicateValue(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] == input[i + 1]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        System.out.println(ContainDuplicates.duplicateValue(input));
    }
}
