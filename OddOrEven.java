package GuviJavaPractices;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a%2==0){
            System.out.println(a+"is an Even Number");
        }
        else{
            System.out.println(a+ "is an Odd Number");
        }
    }
}
