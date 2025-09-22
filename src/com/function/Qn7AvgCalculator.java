/**
 *Create a function called averageNumber(int num1 , int num2 , int num3)  and inside the function
 *  display the highest and lowest among three numbers.
 */
package com.function;
import java.util.Scanner;
public class Qn7AvgCalculator {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Qn7AvgCalculator avg= new Qn7AvgCalculator();
        avg.averageNumber(10,20,30);


    }
    public void averageNumber(int num1, int num2,int num3){
        float avg=(num1+num2+num3)/3f;
        System.out.println("avg of there is:"+avg);
        if(num1>num2){
            if(num1>num3){
                System.out.println("largest is:"+num1);
            }
            else
            {
                System.out.println("largest is:"+num3);
            }
        }
        else{
            System.out.println("largest is:"+num2);
        }
    }
}
