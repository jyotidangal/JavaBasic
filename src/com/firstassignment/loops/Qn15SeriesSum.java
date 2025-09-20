/**
 * Write a program to calculate the sum of the following series
 * where n is input by user.  1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
 * where n is a positive integer and input by user.
 */
package com.firstassignment.loops;
import java.util.Scanner;
public class Qn15SeriesSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of terms of series: ");
        int terms=sc.nextInt();
        float sum=0;
        System.out.print("The sum of " +
                "1+" +
                "1/2+" +
                "1/3+"+"......."+
                "1/"+terms+
                "series is: ");
        if(terms<0){
            System.out.println("Invalid Input!, Number should be positive integer");
        }
        for(int i=1; i<=terms;i++){
            sum+=(1/(float)i);
        }
        System.out.println(sum);
    }

}
