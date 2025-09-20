/**
 * Write a program to print out all Armstrong numbers between 1 and 500. If the sum of cubes of  each digit of the number is equal to the number itself, then the number is called an  Armstrong number.
 * For example, 153 = ( 1 * 1*1 ) + ( 5 * 5 * 5  ) + ( 3 * 3 * 3 )
 */
package com.firstassignment.loops;
public class Qn13ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 500 are: ");
//      variable declaration
        int num=0, rem=0,original=0, k = 0;
//       for  loop
        for (int i = 1; i < 501; i++) {
            num = i;//10
            original=i;
            int j = 0;//initialization
            int sumOfCubeOfDigits = 0;
            while (num != 0) {//10,1,0=terminated
                j++;
                rem = num % 10;//0,1
                sumOfCubeOfDigits+=rem*rem*rem;
                num = num / 10;//1,0
            }

            if (sumOfCubeOfDigits == original) {//1 is not equal to 3
                System.out.println( original);
            }
        }
    }
    }

