package GuviJavaPractices;

import java.util.Scanner;

public class SwapTwoVariables {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c;
        System.out.println("Numbers before Swapping " +a +" and "+ b);
        c =a;
        a=b;
        b=c;
        System.out.println("Numbers after swapping "+a+" and "+b);
    }
}
