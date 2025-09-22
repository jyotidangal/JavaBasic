/**
 * Find the sum of the series 2 + 22 + 222 + 2222 + .. n terms
 */
package com.firstassignment.loops;

import java.util.Scanner;

public class Qn27SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in series: ");
        int noOfTerms = sc.nextInt();

        int term = 2; // first term
        int sum = 0;

        for (int i = 1; i <= noOfTerms; i++) {
            sum += term;
            term = term * 10 + 2; // next term
        }

        System.out.println("The sum of series of " + noOfTerms + " terms is: " + sum);
    }
}
