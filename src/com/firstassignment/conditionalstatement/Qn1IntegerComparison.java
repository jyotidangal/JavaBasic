/**
 * WAP in java to accept  two integers and check whether they are equal or not
 */
package com.firstassignment.conditionalstatement;
import java.util.Scanner;
public class Qn1IntegerComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a firstNumber:");
        int firstNumber = input.nextInt();
        System.out.println(" Enter a secondNumber");
        int secondNumber = input.nextInt();
        if (firstNumber == secondNumber) {
            System.out.println(firstNumber + " and " + secondNumber + " are equal");

        }
        else {
            System.out.println(firstNumber + " and " + secondNumber + " are not equal");

        }


        }
    }