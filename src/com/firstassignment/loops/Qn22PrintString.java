/**
 * Write a program to print a string like “Enter a number ”  into the console until the user enters 0 (zero)  from the keyboard.
 * The System.out.println() statement should not be written outside the loop.
 */
package com.firstassignment.loops;
import java.util.Scanner;
public class Qn22PrintString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter a number:");
            num=sc.nextInt();
        }while(num != 0);
    }

}
