/**
 * Define two methods to print the maximum and minimum number
 * respectively among three numbers entered by the user.
 */
package com.function;
import java.util.Scanner;
public class Qn18MaxMinAmongThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Qn18MaxMinAmongThree maxMin = new Qn18MaxMinAmongThree();
        maxMin.maxNumber(10,20,15);
        maxMin.minNumber(12,-19,0);


    }
    //method to calculate maximum among three
    public void maxNumber(int num1,int num2,int num3){
        if(num1>=num2 && num1>=num3){
            System.out.println(num1 +" is maximum number");
        }
        else if(num1 <= num2 && num2>=num3){
            System.out.println(num2 +" is maximum number");
        }
        else{
            System.out.println(num3 +" is maximum number");
        }
    }
    //method to calculate minimum among three
    public void minNumber(int num1,int num2,int num3){
        if(num1<num2 && num1<num3){
            System.out.println(num1 +" is minimum number");
        }
        else if(num1 >= num2 && num2<=num3){
            System.out.println(num2 +" is minimum number");
        }
        else{
            System.out.println(num3 +" is minimum number");
        }
    }

}
