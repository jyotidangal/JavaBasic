package com.firstassignment.loops;
import java.util.Scanner;
public class Qn4FactorialCalculation {
     static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number:");
         int number = sc.nextInt();
         if (number < 0) {
             System.out.println("Please enter a positive number");
         } else if (number == 0) {
             System.out.println("Factorial of 0 is : 1");
         } else {
             int i = 1, factorial = 1;
             while (i <= number) {
                 factorial = factorial * i;
                 i++;
             }
             System.out.println("Factorial of " + number + " is: " + factorial);

         }
     }
}
