/**
 *  Write a program to print Fibonacci series of n terms
 *  where n is input by user : Example Output : 0 1 1 2 3 5 8 13 24 .....
 */
package com.firstassignment.loops;
import java.util.Scanner;
public class Qn14FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of terms in fibonacci series: ");
        int terms=sc.nextInt();
        System.out.print("Fibonacci series of n terms: 0 1 ");
int a=0,b=1,c;
for(int i=2;i<terms;i++) {

    c = a + b;
    a =b ;
    b = c;
    System.out.print(" "+c);
}

    }
}
