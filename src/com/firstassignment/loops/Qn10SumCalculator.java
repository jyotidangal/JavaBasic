/**
 * Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed.
 * The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate.
 */
package com.firstassignment.loops;
import java.util.Scanner;
public class Qn10SumCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char ch;
        do{
            System.out.println("Enter firstNumber: ");
            int firstNumber=sc.nextInt();
            System.out.println("Enter secondNumber: ");
            int secondNumber=sc.nextInt();
            int sum=firstNumber+secondNumber;
            System.out.println("Sum of two numbers "+firstNumber+ " and "+secondNumber+" is: "+sum);
            System.out.println("Do you want to continue(y/n)?");
            sc.nextLine();
            String choice=sc.nextLine();
             ch=choice.charAt(0);
        }while(ch=='y'||ch=='Y');
    }
}
