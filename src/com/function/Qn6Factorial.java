package com.function;
import java.util.Scanner;
public class Qn6Factorial {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Qn6Factorial fact= new Qn6Factorial();
        System.out.println("Enter a number:");
        int number =sc.nextInt();
       int  factorial=fact.getFactorial(number);
        System.out.println("The factorial of number is:"+factorial);
    }
    public int getFactorial(int number){
        int num=number;
        int fact=1;
        for(int i=1;i<= num;i++){
            fact*=i;
        }
        return fact;
    }
}
