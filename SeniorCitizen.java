package GuviJavaPractices;

import java.util.Scanner;

public class SeniorCitizen {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if(age>18){
            System.out.println(age+" is greater than 18 so senior Citizen");
        }
        else {
            System.out.println(age+" is lower than 18 so not a senior citizen");
        }
    }
}
