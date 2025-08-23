package leetcodepgm;

public class ReturnFizzBuzz {
//    Write a program which return "fizz" if the number is a multiplier of 3,
//    return "buzz" if its multiplier of 5 and
//    return "fizzbuzz" if the number is divisible by both 3 and 5.
//    If the number is not divisible by either 3 or 5 then it should just return the number itself?
    public static String returnString(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "fizzbuzz";
        } else if (num % 3 == 0) {
            return "fizz";
        } else if (num % 5 == 0) {
            return "buzz";
        } else {
            return String.valueOf(num);
        }
    }

    public static void main(String[] args) {
        System.out.println(ReturnFizzBuzz.returnString(12)); // fizz
        System.out.println(ReturnFizzBuzz.returnString(10)); // buzz
        System.out.println(ReturnFizzBuzz.returnString(15)); // fizzbuzz
        System.out.println(ReturnFizzBuzz.returnString(7));  // 7
    }
}
