package arraypblms;

public class CountOddOrEven {
    public void oddOrEven() {
        int[] arr = {2, 7, 10, 3, 6};
        int count = 0;
//        int count1=0;
        for (int c : arr) {
            if (c % 2 == 0) {
                count++;

            }
        }
        System.out.println(count + " even");
        System.out.println((arr.length - count) + " odd");
    }

    public static void main(String[] args) {
        CountOddOrEven count = new CountOddOrEven();
        count.oddOrEven();
    }
}
