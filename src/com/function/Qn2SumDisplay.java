/**
 * Write a program with a method
 * named getTotal that accepts two integers as an argument and
 * return its sum. Call this method from main( ) and print the results.
 */
package com.function;

public class Qn2SumDisplay {
    public static void main(String[] args){
        Qn2SumDisplay obj= new Qn2SumDisplay();
        int sum=obj.getTotals(10,20);
        System.out.println("Sum of two number is: "+sum);




    }
    public int getTotals(int firstNumber, int  secondNumber){
        return firstNumber+secondNumber;
    }

}
