package GuviJavaPractices;

import java.util.Scanner;

public class DemoClass {
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        int a =Scan.nextInt();
        int b =Scan.nextInt();
        int c =Scan.nextInt();
        int d =Scan.nextInt();
        if(a+b>c){
         System.out.println("Integer a + b is Greater than C");
        }else if (a+b>d) {
            System.out.println("Integer a + b is Greater than C");
        }
        else{
            System.out.println("Integer a + b is smaller than c and d");
        }
    }
}
