package collectionspblm;

import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {   //       MCXIV
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);           //1000  100 10  1 5
        roman.put('V', 5);      //verify the character should be capital
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        int total = 0;
        int previous = 0; //5

        for (int i = s.length() - 1; i >= 0; i--) {
            int current = roman.get(s.charAt(i));
            if (current < previous) {       //condition keep in mind >,<
                //1>5
                total -= current;    //0+5
            } else {
                total += current; //5-1
            }
            previous = current;
        }
        return total;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInt("III");
        System.out.println(result);
    }
}
