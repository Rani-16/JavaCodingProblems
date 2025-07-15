package arraypblms;

import java.util.Scanner;

public class OddOrEven {

//    Given an integer n:
//
//    If n is odd, print Weird
//
//    If n is even and in the range 2 to 5 (inclusive), print Not Weird
//
//    If n is even and in the range 6 to 20 (inclusive), print Weird
//
//    If n is even and greater than 20, print Not Weird

    public void oddOrEven() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input % 2 != 0) {
            System.out.println("wired");
        } else if (input >= 2 && input <= 5) {
            System.out.println("not wired");
        } else if (input >= 6 && input <= 20) {
            System.out.println("wired");
        } else if (input > 20) {
            System.out.println("not wired");
        }
        sc.close();
    }

    public static void main(String[] args) {
        OddOrEven odd=new OddOrEven();
        odd.oddOrEven();
    }


}




