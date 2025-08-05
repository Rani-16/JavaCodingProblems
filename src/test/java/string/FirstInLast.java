package string;

public class FirstInLast {
    public static void main(String[] args) {
        String str1 = "educated";
        String firstIn=str1.substring(0,2);
        String lastOut=str1.substring(str1.length()-2);
        if(firstIn.equals(lastOut)){
            System.out.println("passed");
        }
        else {
            System.out.println("failed");
        }
    }
}
