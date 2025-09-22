/**
 * For a given N, prints the sum of even and odd integers of the first N natural numbers.
 */
package com.firstassignment.loops;
import java.util.Scanner;
public class Qn23SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Qn23SumOfNaturalNumbers sum=new Qn23SumOfNaturalNumbers();
        System.out.println("Enter a value of N(Natural Numbers):");
        int naturalNumber = sc.nextInt();
        int[] result = sum.sumOfNaturalNumber(naturalNumber);
        System.out.println("Even Sum: " + result[0]);
        System.out.println("Odd Sum: " + result[1]);

    }
    // function to find even and odd number
    public int[] sumOfNaturalNumber(int naturalNumber) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= naturalNumber; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        return new int[]{evenSum, oddSum};// return result as an array create in the heap memory
    }
    }

