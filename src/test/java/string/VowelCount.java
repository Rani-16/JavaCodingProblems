package string;

public class VowelCount {
    public static void main(String[] args) {
        String input="America";
String lowerCase=input.toLowerCase();
        int count=0;
        for(int i=0;i<lowerCase.length();i++){
            char ch = lowerCase.charAt(i);

            if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
