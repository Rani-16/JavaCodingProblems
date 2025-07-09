package arraypblms;
public class AverageMaxMinArray {
    public static void newMaxMin(){
        int[] arr={1,2,3,4,5};
        int max=arr[0];
        int min=arr[0];
        for(int a:arr){
            if(a>max) max=a;
            if(a<min) min=a;
                   }
        System.out.println("Min :" +min+"Max : "+max);
        int diff=max-min;
        System.out.println("Differents of max and min is :"+diff);
    }
    public static void maxMin(){
        int[] arr={1,2,3,4,5};
        int max=0;
        int min=0;
        for(int i=0;i<=arr.length-1;i++){
                if(arr[i]>max) max=arr[i];
               if(arr[i]<min) min=arr[i];
                }
                System.out.println(max);
            }
    public static void main(String[] args) {
        AverageMaxMinArray.newMaxMin();
    }
}
