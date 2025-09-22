/**
 * WAP to print
 *       1
 *     222
 *   33333
 *  4444444
 * 555555555
 */
package com.firstassignment.loops;
import java.util.Scanner;
public class Qn24PatternPrint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<6;i++){
            // print space
            for(int k=1;k<=5-i;k++)
            {
                System.out.print(" ");
            }
            //print numbers
            for(int j=1;j<i*2;j++){

                System.out.print(i);
            }
System.out.print("\n");
        }
    }
}
