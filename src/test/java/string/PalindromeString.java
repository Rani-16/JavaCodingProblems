package string;

public class PalindromeString {
    public static void main(String[] args) {
        StringBuilder input=new StringBuilder("MalayalaM");
        StringBuilder reverse =input.reverse();
        if(input.equals(reverse)){
            System.out.println("palindrome");
        }else {
            System.out.println("given String is not a palindrome");
        }

//        String reverse="";
//        for(int i=input.length()-1;i>=0;i--){
//            reverse+=input.charAt(i);
//
//        }
//        if(reverse.equals(input)){
//            System.out.println("given String is palindrome");
//        }else {
//            System.out.println("given String is not a palindrome");
//        }
    }
}
