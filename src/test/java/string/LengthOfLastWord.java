package string;

public class LengthOfLastWord {
    public static void main(String[] args) {
        
    
//    Input:  s = "Hello World Java"
//    Output: 5
    
    String input="Hello World Java";
    String[] countWord=input.split(" ");
   int length=countWord.length;
      String s1 = countWord[length - 1];
        System.out.println(s1);
        System.out.println(s1.length());
}
}