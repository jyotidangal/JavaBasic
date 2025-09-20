/**
 * Write a program to enter the numbers till the user wants
 * and at the end the program should  display the largest and smallest numbers entered.
 */
package com.firstassignment.loops;
import java.util.Scanner;
public class Qn12LargestNumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        char ch;
        int smallestNumber=0,largestNumber=0;
        do{
            System.out.println("Enter a number:");
            int number = sc.nextInt();

            if (number < smallestNumber) {
                smallestNumber = number;
            } else if (number > largestNumber) {
                largestNumber = number;
            }
            if(smallestNumber > largestNumber)
            {
                int temp=smallestNumber;
                smallestNumber=largestNumber;
                largestNumber=temp;
            }
            System.out.println("Do you want to continue(y/n)?");
            sc.nextLine();
            String choice = sc.nextLine();
            ch = choice.charAt(0);
        }while(ch=='y'||ch=='Y');
        System.out.println("Smallest Number is: " +smallestNumber+" \n"+
                "Largest number is: "+largestNumber);
    }
}
