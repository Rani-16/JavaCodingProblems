package collectionspblm;

import java.util.ArrayList;
import java.util.List;

public class ReverseSorting {
    public void reverseString(){
        List<String> list1=new ArrayList<>();
        list1.add("typescript");
        list1.add("python");
        list1.add("java");
        System.out.println(list1);
        System.out.println(list1.reversed());

    }
    public void reverseNumber(){
        List<Integer> list2=new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(56);
        System.out.println(list2);
        System.out.println(list2.reversed());
    }
    public static void main(String[] args) {
        ReverseSorting reverse=new ReverseSorting();
        reverse.reverseString();
        reverse.reverseNumber();
    }
}
