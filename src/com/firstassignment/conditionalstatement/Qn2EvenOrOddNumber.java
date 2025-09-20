/**
 * WAp in java to check if the input number is even or odd.

 */
package com.firstassignment.conditionalstatement;
import java.util.Scanner;
public class Qn2EvenOrOddNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        boolean status= true;
        while(status) {
            System.out.println("*************************************");
            System.out.println("1 Do you want to check number is even or odd?");
            System.out.println("2 Exit");
            System.out.println("*************************************");
            System.out.println("Enter your Choice here:");
            int choice= input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a number:");
                    int number = input.nextInt();
                    if (number % 2 == 0)    //if else conditional statement to identify that given number is even or odd?
                    {
                        System.out.println(number + " is even number");
                    } else {
                        System.out.println(number + " is odd number");
                    }
                    break;
                case 2:
                    status= false;
                    break;
                default:
                    System.out.println(" Please make the correct choice");
            }
        }
    }
}
