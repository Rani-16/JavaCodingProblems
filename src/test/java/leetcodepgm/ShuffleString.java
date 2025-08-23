package leetcodepgm;

import java.util.Arrays;

public class ShuffleString {
    public void restoreString(String s, int[] indices) {
        char[] ch = new char[s.length()];
        for (int i = 0; i <= s.length() - 1; i++) {
            ch[indices[i]] = s.charAt(i);
            //String s = "code";
            //int[] indices = {3, 1, 2, 0};
        }
        System.out.println(Arrays.toString(ch));

    }

    public static void main(String[] args) {
        ShuffleString sh = new ShuffleString();
//        int[] indices = {3, 1, 2, 0};
        sh.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3});
    }

}