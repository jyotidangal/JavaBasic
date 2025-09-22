/**
 * Write a program that takes input from a user in a loop and
 * take input unless the user enters zero and display the max positive number entered
 * by the user during the iteration.
 */
package com.firstassignment.loops;
import java.util.Scanner;
public class Qn30UserControlLoop {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int max=0;
        do{
            System.out.println("Enter zero to exit from loop:");
            System.out.println("Enter an integer :");
            int number=sc.nextInt();
            if(number>max){
                max=number;
            }
            if(number == 0){
                break;
            }
        }while(true);
        System.out.print("The maximum number entered by user is: "+max);
    }
}
