package string;

public class StringPblm {
    public static void main(String[] args) {
        String str1 = "example.com", str2 = "Example.com";
        CharSequence cs = "example.com";
        boolean b = str2.contentEquals(cs);
        System.out.println(b);
        System.out.println(str1.equals(cs));

    }
}
