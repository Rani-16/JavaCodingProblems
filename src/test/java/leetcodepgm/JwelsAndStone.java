package leetcodepgm;

import java.util.HashSet;
import java.util.Set;

public class JwelsAndStone {
    public int numJewelsInStones(String jewels, String stones) {
//
//        char[] jwl = jewels.toCharArray();         //brouteforce method
//        System.out.println(jwl);
//        int count = 0;
//        for (int i = 0; i < stones.length(); i++) {
//            char st = stones.charAt(i);
//            if (jwl[0] == st) {
//                count++;
//            } else if (jwl[1] == st) {
//                count++;
//            }
//        }
//        System.out.println(count);


//        String input=jewels;            //optmization
//        String input2=stones;
        Set<Character> ch = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            ch.add(c);
        }
        System.out.println(ch);
        int count = 0;
        for (char st : stones.toCharArray()) {
            if (ch.contains(st)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        JwelsAndStone js = new JwelsAndStone();
        int result = js.numJewelsInStones("azzb", "aAAbbbb");
        System.out.println(result);
    }
}