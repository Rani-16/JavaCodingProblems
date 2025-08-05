package arraypblms;

public class NumberPblm {
//    public boolean isPalindrome(int x) {
//        int input = x;
//        int temp=input;
//        int reverse = 0;
//        while (input > 0) {
//            int digit = x % 10;
//            reverse = reverse * 10 + digit;
//            x /= 10;
//        }

    /// /        return x == reverse;
//        if (reverse == input) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public static void main(String[] args) {
//        NumberPblm num = new NumberPblm();
//        System.out.println(num.isPalindrome(121));
//    }
    public boolean isPalindrome(int x) {
        int input = x;
        int reverse = 0;
        int digit;

        while (x > 0) {
            digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }

        return input == reverse;
    }

    public static void main(String[] args) {
        NumberPblm num = new NumberPblm();
        boolean value =num.isPalindrome(121);
        System.out.println(value);

    }
}