/**
 * WAP a program that reads a range pf numbers as input and
 * iterates it then prints the sum of the odd and even integers
 */
package com.firstassignment.loops;
import java.util.Scanner;
public class Qn7LimitingValues {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lower limit:");
        int lowerLimit=input.nextInt();
        System.out.println("Enter the upper limit:");
        int upperLimit=input.nextInt();

        if(lowerLimit > upperLimit)
        {
            int temp = lowerLimit;
            lowerLimit=upperLimit;
            upperLimit=temp;
        }
        int evenSum=0;
        int oddSum =0;
        for(int i=lowerLimit ; i < upperLimit ; i++)
        {
            if(i % 2 ==0)
            {
                evenSum+=i;
            }
            else{
                oddSum+=i;
            }
        }
        System.out.println("The sum of even integers within boundary ("+lowerLimit +" - "+upperLimit+ ") is: "+evenSum );
        System.out.println("The sum of odd integers within boundary ("+lowerLimit+" - "+upperLimit+ ") is: "+oddSum );


    }
}
