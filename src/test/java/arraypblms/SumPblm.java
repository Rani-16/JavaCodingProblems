package arraypblms;

public class SumPblm {
    public static void arraySum(int arr[]) {
        int sum = 0;
        for (int c : arr) {
            sum += c;
        }
//        for(int i=0;i<=arr.length-1;i++){
//            sum+=arr[i];
//        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        SumPblm.arraySum(arr);
    }
}
