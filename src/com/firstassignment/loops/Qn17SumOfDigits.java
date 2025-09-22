package com.firstassignment.loops;
import java.util.Scanner;
public class Qn17SumOfDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Qn17SumOfDigits s= new Qn17SumOfDigits();
        System.out.println("Enter a number:");
        int num=input.nextInt();
        int sum=s.sumOfDigits(num);
        System.out.println("Sum of digits of number is: "+sum );

    }
    // function or method to find sum of digits in a number
    public int sumOfDigits(int num){
        int rem=0,sum=0;
        while(num!=0){
            rem=num%10;
            sum+=rem;
            num=num/10;
        }
        return sum;
    }
}
