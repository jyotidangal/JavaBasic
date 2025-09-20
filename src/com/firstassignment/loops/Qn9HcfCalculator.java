/**
 * WAP in java to calculate HCF(GCD) of two given numbers

 *we can find the GCd or HCF of any two numbers using "Euclidean Algorithm")
 */
package com.firstassignment.loops;
import java.util.Scanner;
public class Qn9HcfCalculator {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a firstNumber: ");
        int firstNumber= sc.nextInt();
        System.out.println("Enter a secondNumber: ");
        int secondNumber= sc.nextInt();
        if(firstNumber==0){
            System.out.println("The GCD of "+ firstNumber +" and "+secondNumber+" is : "+secondNumber );
        }
        else if(secondNumber==0){
            System.out.println("The GCD of "+ firstNumber +" and "+secondNumber+" is : "+secondNumber );
        }
        else if(firstNumber < secondNumber){
            int temp=firstNumber;
            firstNumber=secondNumber;
            secondNumber=temp;
        }
        int a=firstNumber, b=secondNumber;
        while(b!=0){
          int temp=a;
            a=b;
            b=temp%b;
        }
        System.out.println("The GCD of "+ firstNumber +" and "+secondNumber+" is : "+a );

    }
}
