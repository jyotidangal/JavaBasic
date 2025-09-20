/**
 * Write a program that prompts the user to input a positive integer. It should then output a
 * message indicating whether the number is a prime number.
 */
package com.firstassignment.loops;
import  java.util.Scanner;
public class Qn8PrimeNumberCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int positiveInteger = sc.nextInt();
        if(positiveInteger < 0) {
            System.out.println(" Invalid Input!, Only positive integers are allowed");
        }
        int count=0;
        for(int i=2; i < (positiveInteger) ;i++){
            if(positiveInteger % i == 0){
               count++;
                break;
            }
        }
            if(count >=1){
                System.out.println("The given number: "+positiveInteger+" is not prime number.");
            }
            else{
                System.out.println("The given number: "+positiveInteger+" is  prime number.");

            }

    }
}
