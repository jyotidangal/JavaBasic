/**
 * Create a function that returns true when both the parameters are equal
 * else return false. isSameNum(4, 8) ➞ false
 */
package com.function;
import java.util.Scanner;
public class Qn17EqualityCheck {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Qn17EqualityCheck isEqual= new Qn17EqualityCheck();
        System.out.println("Enter a first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter a second number: ");
        int num2=sc.nextInt();
        boolean result=isEqual.isSameNumber(num1, num2);
        if(result){
            System.out.println(num1 +" and "+num2+" are equal numbers.");
        }
        else{
            System.out.println(num1 +" and "+num2+" are not equal numbers.");
        }




    }
    public boolean isSameNumber(int num1 , int num2){
        if(num1 == num2){
            return true;
        }
        return false;
    }
}
