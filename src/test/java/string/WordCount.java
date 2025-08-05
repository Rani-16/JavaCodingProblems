package string;

import java.util.Arrays;

public class WordCount {
    public static void main(String[] args) {
        String str="This is Happy morning today";
        int charCount=0;
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) != ' ') {
                charCount++;
            }
        }
        System.out.println(charCount);


//        String replaced=str.replace('i','@');
//        System.out.println(replaced);
//        String[] word=str.split(" ");
       // System.out.println(word.Arrays.toString());
//        int wordCount=0;
//        for(String c:word){
//            wordCount++;
//        }
//        System.out.println(wordCount);
    }
}
