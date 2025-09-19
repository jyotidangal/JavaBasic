//WAP to print the sum of first 10 natural numbers
package com.task1.loops;
import java.util.Scanner;
public class Qn2SumOfNaturalNumbers {
    static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        int n=10;
        System.out.println("USing for loop:");
        int sum=0;
        for(int i=0; i<n;i++)
        {
            sum=sum+i+1;
        }
        System.out.println("The sum of 10 natural number is : "+ sum);

        System.out.println("Using while loop:");
        int j=0, sum2=0;
        while(j<n)
        {
            sum2=sum2+j+1;
            j++;
        }
        System.out.println("The sum of 10 natural number is : "+ sum2);

    }
}
