package string;

public class FrequencyCount {
    public static void main(String[] args) {
        String input ="America";
        String toLower=input.toLowerCase();
        int count=0;
        char target='c';
          for(int i=0;i<toLower.length();i++)
          {
              char ch=toLower.charAt(i);
              if(ch==target){
                  count++;
              }
          }
        System.out.println(count);
    }
}
