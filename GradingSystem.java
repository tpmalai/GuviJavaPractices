package GuviJavaPractices2;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks :");
        double marks = scan.nextDouble();
        if (marks == 100) {
            System.out.println("Mark are " + marks + " So the Grade is S");
        } else if (marks >= 90 && marks <= 99) {
            System.out.println("Marks are " + marks + " so the Grade is A");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("Marks are " + marks + " so the Grade is B");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("Marks are " + marks + " so the Grade is C");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Marks are " + marks + " so the Grade is D");
        } else if (marks >= 50 && marks <= 59) {
            System.out.println("Marks are " + marks + " so the Grade is E");
        } else if (marks < 50) {
            System.out.println("Marks are " + marks + " so the Grade is F");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
