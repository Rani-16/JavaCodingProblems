package collectionspblm;

import java.util.LinkedList;
import java.util.List;

public class ListIterate {
    public static void main(String[] args) {
        List<String> input=new LinkedList<>();
        input.add("abcd");
        input.add("efgh");
        input.add("ijkl");
        for(String result:input){
            System.out.println(result);
        }
        System.out.println(input.size());
for(int i=input.size()-1;i>=0;i--){
    System.out.println(input.get(i));
}
    }
}
