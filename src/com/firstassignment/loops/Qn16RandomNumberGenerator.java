/**
 * Write a program that generates a random number and asks the user to guess what the  number is.
 * If the user's guess is higher than the random number, the program should display  "Too high, try again."
 * If the user's guess is lower than the random number,
 * the program  should display "Too low, try again." The program should use a loop that repeats until the  user correctly guesses the random number.
 */
package com.firstassignment.loops;
import java.util.Scanner;
public class Qn16RandomNumberGenerator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Qn16RandomNumberGenerator random = new  Qn16RandomNumberGenerator();
        System.out.println("Enter a limiting value of random number: ");
        int limitingValue = input.nextInt();

    }
    // methods to generate random number
    public void randomNumbersGenerator(int limitingValue){

    }
}
