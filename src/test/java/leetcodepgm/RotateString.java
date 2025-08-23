package leetcodepgm;

public class RotateString {
    public boolean rotateString(String s, String goal) {
        String s1 = s + s;
        System.out.println(s1);
        return s1.contains(goal);
    }

    public static void main(String[] args) {
        RotateString rotate = new RotateString();
        boolean result = rotate.rotateString("abcde", "cdeab");
        System.out.println(result);
        boolean result2=rotate.rotateString("abcde", "abced");
        System.out.println(result2);
    }
}
