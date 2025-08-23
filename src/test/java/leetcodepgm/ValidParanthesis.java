package leetcodepgm;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s="()[]{}";
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
           if(c=='('&&c=='['&&c=='{'){
                   st.push(c);
        }else if(st.isEmpty()){
//               return false;
           }
            char top=st.pop();
           }
        System.out.println(st);

//if(top=='('&& ){

}
    }

