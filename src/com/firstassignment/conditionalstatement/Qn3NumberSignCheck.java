package com.firstassignment.conditionalstatement;
import java.util.Scanner;
public class Qn3NumberSignCheck {
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);//Object created
        System.out.println("Enter a number:");
        int num = input.nextInt();
        if(num < 0){
            System.out.println(num+" is Negative number");
        }
        else{
            System.out.println(num+" is Positive number");
        }

    }
}
