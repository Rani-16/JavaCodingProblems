package arraypblms;

import java.util.Scanner;

public class Cubic {
    public void cubicSum(){
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int cube=input*input*input;
        System.out.println(cube);
    }

    public static void main(String[] args) {
        Cubic c=new Cubic();
        c.cubicSum();
    }
}
