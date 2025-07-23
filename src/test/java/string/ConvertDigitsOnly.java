package string;

public class ConvertDigitsOnly {
    public static void main(String[] args) {
        String str="abc";
        boolean digit=str.matches("\\d+");  // \\d for the number
        System.out.println(digit);



    }
}
