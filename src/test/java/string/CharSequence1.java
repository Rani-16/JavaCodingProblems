package string;

public class CharSequence1 {
    public static void main(String[] args) {
        String str = "Hello World";

        CharSequence cs1 = "Hello World"; // literal string
        StringBuilder sb = new StringBuilder("Hello World");
        StringBuffer sbf = new StringBuffer("Hello World");

        // Using contentEquals() to compare
        System.out.println("Compare with CharSequence: " + str.contentEquals(cs1));    // true
        System.out.println("Compare with StringBuilder: " + str.contentEquals(sb));    // true
        System.out.println("Compare with StringBuffer: " + str.contentEquals(sbf));    // true

        // Using equals (would not work directly with non-String CharSequence)
        System.out.println("Compare with equals(): " + str.equals(sb.toString()));     // true
    }
}

