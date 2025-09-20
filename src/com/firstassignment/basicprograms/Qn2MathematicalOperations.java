/*
WAP in java to take two number input from the user and display
its Sum, Product, Difference, Quotient and Remainder.Display
invalid number as a message if any one of number is less than or equal to zero
*/
package com.firstassignment.basicprograms;
import java.util.Scanner;
public class Qn2MathematicalOperations {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Define object of Scanner class
//Prompt to the user for input
        System.out.println("Enter the first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = sc.nextInt();
        if (firstNumber <= 0 && secondNumber <= 0) {
            System.out.println("Invalid numbers:" + firstNumber + "and" + secondNumber);
        } else if (firstNumber <= 0) {
            System.out.println("Invalid number:" + firstNumber);
        } else if (secondNumber <= 0) {
            System.out.println("Invalid number:" + secondNumber);
        } else {
            int sum = firstNumber + secondNumber;
            int product = firstNumber * secondNumber;
            if (firstNumber < secondNumber) {
                int temp = firstNumber;
                firstNumber = secondNumber;
                secondNumber = temp;
            }
            int difference = firstNumber - secondNumber;

            int quotient = firstNumber / secondNumber;
            int remainder = firstNumber % secondNumber;

            System.out.println("Sum of " + firstNumber + " and " + secondNumber + " is: " + sum);
            System.out.println("Product of " + firstNumber + " and " + secondNumber + " is: " + product);
            System.out.println("Difference of " + firstNumber + " and " + secondNumber + " is: " + difference);
            System.out.println("Quotient of " + firstNumber + " and " + secondNumber + " is: " + quotient);
            System.out.println("Remainder of " + firstNumber + " and " + secondNumber + " is: " + remainder);
        }
    }

}
