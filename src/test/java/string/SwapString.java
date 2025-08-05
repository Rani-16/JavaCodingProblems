package string;

public class SwapString {
    public static void main(String[] args) {
        String input1 = "Apple";
        String input2 = "Orange";
        String temp;
        System.out.println("before: " + input1 + " " + input2);
        temp = input1;    //apple
        input1 = input2;    //orange
        input2 = temp;          //we are assigning the address to
                            // another string address not swaping the string
        System.out.println("after: " + input1 + " " + input2);
    }
}
