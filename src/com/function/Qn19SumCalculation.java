/**
 * Write a program to print the sum of two numbers entered by users defining your own method.
 */
package com.function;
import java.util.Scanner;
public class Qn19SumCalculation {
    //Executor function
    public static void main(){
        Scanner sc = new Scanner(System.in);
        Qn19SumCalculation sum = new Qn19SumCalculation();

        System.out.println("Enter firstNumber: ");
        int num1= sc.nextInt();
        System.out.println("Enter secondNumber: ");
        int num2= sc.nextInt();
        System.out.println("Sum of given numbers is:"+sum.sum(num1,num2));

    }
    //method to return sum of two integers
    public int sum(int num1, int num2){
        return num1+num2;
    }
}
