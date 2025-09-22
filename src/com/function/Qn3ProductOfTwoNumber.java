/**
 * Define a method that returns the product of two numbers entered by the user.
 */
package com.function;
import java.util.Scanner;

public class Qn3ProductOfTwoNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Qn3ProductOfTwoNumber product= new Qn3ProductOfTwoNumber();
        System.out.println("Enter a firstNumber:");
        int firstNumber=sc.nextInt();
        System.out.println("Enter a secondNumber:");
        int secondNumber=sc.nextInt();
        int productOfNumbers=product.product(firstNumber,secondNumber);
        System.out.println(" Product is :"+productOfNumbers);


    }
    public int product(int firstNumber, int secondNumber){
        return  firstNumber*secondNumber;
    }
}
