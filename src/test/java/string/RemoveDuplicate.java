package string;

import java.util.LinkedHashSet;

public class RemoveDuplicate {

    public static void main(String[] args) {
                String s1 = "programming"; //Output: progamin
        LinkedHashSet<Character> duplicate=new LinkedHashSet<>();
        for(char c:s1.toCharArray()){
            duplicate.add(c);
}
        System.out.println(duplicate);
  StringBuilder build=new StringBuilder();
  for(Character c1:duplicate){
      build.append(c1);
  }
        System.out.println(build);
    }
}
