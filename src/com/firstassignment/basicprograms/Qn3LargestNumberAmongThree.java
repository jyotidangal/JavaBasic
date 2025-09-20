//WAP in java to find the largest number from the three numbers taken from the user

package com.firstassignment.basicprograms;
//Import the Scanner class
import java.util.Scanner;
public class Qn3LargestNumberAmongThree {
    static void main(String[] args){
//Create an Object of a class Scanner
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter firstNumber:");
         int firstNumber=sc.nextInt();
         System.out.println("Enter secondNumber:");
         int secondNumber=sc.nextInt();
         System.out.println("Enter thirdNumber:");
         int thirdNumber=sc.nextInt();
//Let's perform the comparison
        if(firstNumber > secondNumber)
        {
         if(firstNumber > thirdNumber)
         {
             System.out.println("The largest number is "+ firstNumber);
         }
         else {
             System.out.println("The largest number is "+ thirdNumber);
         }
        }
        else{
            System.out.println("The largest number is "+ secondNumber);
        }
    }
}
